package com.github.jg513.webpb.writers.typescript;

import com.github.jg513.webpb.core.CodeWriter;
import com.github.jg513.webpb.core.CodeWriterContext;
import com.github.jg513.webpb.core.PendingSpec;
import com.github.jg513.webpb.core.specs.PendingFileSpec;
import com.squareup.wire.schema.ProtoFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TypescriptWriter extends CodeWriter {
    public TypescriptWriter(CodeWriterContext options) {
        super(options);
    }

    @Override
    public Void call() {
        while (true) {
            PendingSpec spec = context.getSpecs().poll();
            if (spec == null) {
                return null;
            }
            if (!(spec instanceof PendingFileSpec)) {
                continue;
            }
            try {
                ProtoFile protoFile = ((PendingFileSpec) spec).getFile();
                if (protoFile.types().isEmpty()) {
                    continue;
                }
                String packageName = protoFile.packageName();
                StringBuilder builder = new StringBuilder();
                boolean hasContent = TypescriptGenerator
                    .of(context.getSchema(), context.getTags(), builder)
                    .generate(protoFile);
                if (!hasContent) {
                    continue;
                }

                Path path = Paths.get(context.getOut(), packageName + ".ts");
                Files.write(path, builder.toString().getBytes());
            } catch (IOException e) {
                context.getLog().error("Error emitting %s, %s, %s", spec.toString(), context.getOut(), e.getMessage());
            }
        }
    }
}
