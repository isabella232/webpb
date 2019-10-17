package com.github.jg513.webpb.writers.java;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.expr.Name;
import com.github.jg513.webpb.common.Const;
import com.squareup.wire.schema.ProtoFile;
import com.squareup.wire.schema.Schema;
import com.squareup.wire.schema.Type;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class JavaOptions {
    private Map<String, Name> nameMap = new HashMap<>();

    private Map<AnnotationExpr, Name> annotationMap = new HashMap<>();

    private boolean getter = true;

    private boolean setter = true;

    public JavaOptions(Schema schema) {
        for (ProtoFile file : schema.protoFiles()) {
            this.parseOptions(file);
        }
    }

    @SuppressWarnings("unchecked")
    private void parseOptions(ProtoFile file) {
        JavaParser parser = new JavaParser();
        parser.parseName(List.class.getName())
            .ifSuccessful(name -> nameMap.put(name.getIdentifier(), name));
        parser.parseName(Map.class.getName())
            .ifSuccessful(name -> nameMap.put(name.getIdentifier(), name));
        for (Type type : file.types()) {
            String identifier = type.type().simpleName();
            if (StringUtils.isEmpty(file.javaPackage())) {
                throw new IllegalArgumentException("java_package option is required in " + file.name());
            }
            nameMap.put(identifier, new Name(new Name(null, file.javaPackage()), identifier));
        }
        List<String> importList = (List<String>) file.options().get(Const.JAVA_IMPORT);
        if (importList != null && !importList.isEmpty()) {
            for (String str : importList) {
                parser.parseName(str).ifSuccessful(name ->
                    nameMap.put(name.getIdentifier(), name)
                );
            }
        }
        List<String> annotationList = (List<String>) file.options().get(Const.JAVA_MESSAGE_ANNO);
        if (annotationList != null && !annotationList.isEmpty()) {
            for (String annotation : annotationList) {
                parser.parseAnnotation(annotation).ifSuccessful(expr -> {
                    Name fullName = getFullName(expr.getName());
                    expr.getName().setQualifier(null);
                    annotationMap.put(expr, fullName);
                });
            }
        }
        this.getter = "true".equals(file.options().get(Const.JAVA_GETTER));
        this.setter = "true".equals(file.options().get(Const.JAVA_SETTER));
    }

    public Name getFullName(Name name) {
        if (name.getQualifier().isPresent()) {
            return new Name(name.getQualifier().orElse(null), name.getIdentifier());
        }
        Name full = nameMap.get(name.getIdentifier());
        if (full == null) {
            throw new RuntimeException("Unknown identifier " + name.getIdentifier());
        }
        return new Name(full.getQualifier().orElse(null), full.getIdentifier());
    }

    public Name getName(String identifier) {
        Name name = nameMap.get(identifier);
        if (name == null) {
            return null;
        }
        return name.clone();
    }
}
