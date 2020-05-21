// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: Store.proto
package com.github.jg513.example.store;

import com.github.jg513.webpb.core.WebpbMessage;
import com.github.jg513.webpb.options.MessageOptions;
import com.somewhere.Const;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import okio.ByteString;

@Getter
@Setter
@Accessors(chain = true)
public final class StoreRequest extends Message<StoreRequest, StoreRequest.Builder>
        implements WebpbMessage {

    public static final MessageOptions MESSAGE_OPTIONS =
            new MessageOptions.Builder().method("GET").path("/stores/{id}").build();

    public static final ProtoAdapter<StoreRequest> ADAPTER = new ProtoAdapter_StoreRequest();

    private static final long serialVersionUID = 0L;

    public static final Integer DEFAULT_ID = 0;

    public static final String DEFAULT_EMAIL = "";

    public static final Boolean DEFAULT_VALID = false;

    public static final Long DEFAULT_MAX = 4503599627370495L;

    public static final ByteString DEFAULT_BINARY = ByteString.EMPTY;

    public static final StoreType DEFAULT_TYPE = StoreType.NORMAL;

    public static final Float DEFAULT_FLOATDATA = 0.0f;

    public static final Long DEFAULT_STRINGFIELD = 0L;

    public static final String DEFAULT_ANYNAME = "";

    public static final StoreType DEFAULT_ANYSTORE = StoreType.NORMAL;

    @WireField(
            tag = 1,
            adapter = "com.squareup.wire.ProtoAdapter#INT32",
            label = WireField.Label.REQUIRED)
    private transient Integer id;

    @WireField(
            tag = 2,
            adapter = "com.squareup.wire.ProtoAdapter#STRING",
            label = WireField.Label.REQUIRED)
    @Pattern(regexp = Const.EMAIL_REGEX)
    private String email;

    @WireField(tag = 3, adapter = "com.squareup.wire.ProtoAdapter#BOOL")
    private Boolean valid;

    @WireField(
            tag = 4,
            keyAdapter = "com.squareup.wire.ProtoAdapter#STRING",
            adapter = "com.squareup.wire.ProtoAdapter#INT32")
    private Map<String, Integer> data;

    @WireField(
            tag = 5,
            keyAdapter = "com.squareup.wire.ProtoAdapter#STRING",
            adapter = "com.github.jg513.example.store.Project#ADAPTER")
    private Map<String, Project> projects;

    @WireField(
            tag = 6,
            adapter = "com.squareup.wire.ProtoAdapter#INT32",
            label = WireField.Label.REPEATED)
    private List<Integer> unpacked;

    @WireField(
            tag = 7,
            adapter = "com.squareup.wire.ProtoAdapter#INT32",
            label = WireField.Label.PACKED)
    private List<Integer> packed;

    @WireField(
            tag = 8,
            adapter = "com.github.jg513.example.store.Project#ADAPTER",
            label = WireField.Label.REPEATED)
    private List<Project> projectList;

    @WireField(
            tag = 9,
            adapter = "com.github.jg513.example.store.Project#ADAPTER",
            label = WireField.Label.REQUIRED)
    private Project project;

    @WireField(
            tag = 10,
            adapter = "com.squareup.wire.ProtoAdapter#INT64",
            label = WireField.Label.REQUIRED)
    private Long max;

    @WireField(
            tag = 11,
            keyAdapter = "com.squareup.wire.ProtoAdapter#INT64",
            adapter = "com.squareup.wire.ProtoAdapter#INT32")
    private Map<Long, Integer> longMap;

    @WireField(
            tag = 12,
            keyAdapter = "com.squareup.wire.ProtoAdapter#INT64",
            adapter = "com.github.jg513.example.store.Project#ADAPTER")
    private Map<Long, Project> projectMap;

    @WireField(
            tag = 13,
            keyAdapter = "com.squareup.wire.ProtoAdapter#INT64",
            adapter = "com.github.jg513.example.store.StoreType#ADAPTER")
    private Map<Long, StoreType> typeMap;

    @WireField(
            tag = 14,
            adapter = "com.squareup.wire.ProtoAdapter#BYTES",
            label = WireField.Label.REQUIRED)
    private ByteString binary;

    @WireField(
            tag = 15,
            adapter = "com.github.jg513.example.store.StoreType#ADAPTER",
            label = WireField.Label.REQUIRED)
    private StoreType type;

    @WireField(
            tag = 16,
            adapter = "com.squareup.wire.ProtoAdapter#FLOAT",
            label = WireField.Label.REQUIRED)
    private Float floatData;

    @WireField(
            tag = 24,
            adapter = "com.squareup.wire.ProtoAdapter#INT64",
            label = WireField.Label.REQUIRED)
    private Long stringField;

    @WireField(tag = 20, adapter = "com.squareup.wire.ProtoAdapter#STRING")
    private String anyName;

    @WireField(tag = 21, adapter = "com.github.jg513.example.store.Project#ADAPTER")
    private Project anyProject;

    @WireField(tag = 22, adapter = "com.github.jg513.example.store.StoreType#ADAPTER")
    private StoreType anyStore;

    public StoreRequest() {
        super(ADAPTER, ByteString.EMPTY);
    }

    public StoreRequest(Builder builder, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        if (Internal.countNonNull(builder.anyName, builder.anyProject, builder.anyStore) > 1) {
            throw new IllegalArgumentException(
                    "at most one of builder.anyName, builder.anyProject, builder.anyStore may be non-null");
        }
        this.id = builder.id;
        this.email = builder.email;
        this.valid = builder.valid;
        this.data = Internal.immutableCopyOf("data", builder.data);
        this.projects = Internal.immutableCopyOf("projects", builder.projects);
        this.unpacked = Internal.immutableCopyOf("unpacked", builder.unpacked);
        this.packed = Internal.immutableCopyOf("packed", builder.packed);
        this.projectList = Internal.immutableCopyOf("projectList", builder.projectList);
        this.project = builder.project;
        this.max = builder.max;
        this.longMap = Internal.immutableCopyOf("longMap", builder.longMap);
        this.projectMap = Internal.immutableCopyOf("projectMap", builder.projectMap);
        this.typeMap = Internal.immutableCopyOf("typeMap", builder.typeMap);
        this.binary = builder.binary;
        this.type = builder.type;
        this.floatData = builder.floatData;
        this.stringField = builder.stringField;
        this.anyName = builder.anyName;
        this.anyProject = builder.anyProject;
        this.anyStore = builder.anyStore;
    }

    @Override
    public MessageOptions messageOptions() {
        return MESSAGE_OPTIONS;
    }

    @Override
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = id;
        builder.email = email;
        builder.valid = valid;
        builder.data = Internal.copyOf(data);
        builder.projects = Internal.copyOf(projects);
        builder.unpacked = Internal.copyOf(unpacked);
        builder.packed = Internal.copyOf(packed);
        builder.projectList = Internal.copyOf(projectList);
        builder.project = project;
        builder.max = max;
        builder.longMap = Internal.copyOf(longMap);
        builder.projectMap = Internal.copyOf(projectMap);
        builder.typeMap = Internal.copyOf(typeMap);
        builder.binary = binary;
        builder.type = type;
        builder.floatData = floatData;
        builder.stringField = stringField;
        builder.anyName = anyName;
        builder.anyProject = anyProject;
        builder.anyStore = anyStore;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof StoreRequest)) return false;
        StoreRequest o = (StoreRequest) other;
        return unknownFields().equals(o.unknownFields())
                && id.equals(o.id)
                && email.equals(o.email)
                && Internal.equals(valid, o.valid)
                && data.equals(o.data)
                && projects.equals(o.projects)
                && unpacked.equals(o.unpacked)
                && packed.equals(o.packed)
                && projectList.equals(o.projectList)
                && project.equals(o.project)
                && max.equals(o.max)
                && longMap.equals(o.longMap)
                && projectMap.equals(o.projectMap)
                && typeMap.equals(o.typeMap)
                && binary.equals(o.binary)
                && type.equals(o.type)
                && floatData.equals(o.floatData)
                && stringField.equals(o.stringField)
                && Internal.equals(anyName, o.anyName)
                && Internal.equals(anyProject, o.anyProject)
                && Internal.equals(anyStore, o.anyStore);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode;
        if (result == 0) {
            result = unknownFields().hashCode();
            result = result * 37 + id.hashCode();
            result = result * 37 + email.hashCode();
            result = result * 37 + (valid != null ? valid.hashCode() : 0);
            result = result * 37 + data.hashCode();
            result = result * 37 + projects.hashCode();
            result = result * 37 + unpacked.hashCode();
            result = result * 37 + packed.hashCode();
            result = result * 37 + projectList.hashCode();
            result = result * 37 + project.hashCode();
            result = result * 37 + max.hashCode();
            result = result * 37 + longMap.hashCode();
            result = result * 37 + projectMap.hashCode();
            result = result * 37 + typeMap.hashCode();
            result = result * 37 + binary.hashCode();
            result = result * 37 + type.hashCode();
            result = result * 37 + floatData.hashCode();
            result = result * 37 + stringField.hashCode();
            result = result * 37 + (anyName != null ? anyName.hashCode() : 0);
            result = result * 37 + (anyProject != null ? anyProject.hashCode() : 0);
            result = result * 37 + (anyStore != null ? anyStore.hashCode() : 0);
            super.hashCode = result;
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(", id=").append(id);
        builder.append(", email=").append(Internal.sanitize(email));
        if (valid != null) builder.append(", valid=").append(valid);
        if (!data.isEmpty()) builder.append(", data=").append(data);
        if (!projects.isEmpty()) builder.append(", projects=").append(projects);
        if (!unpacked.isEmpty()) builder.append(", unpacked=").append(unpacked);
        if (!packed.isEmpty()) builder.append(", packed=").append(packed);
        if (!projectList.isEmpty()) builder.append(", projectList=").append(projectList);
        builder.append(", project=").append(project);
        builder.append(", max=").append(max);
        if (!longMap.isEmpty()) builder.append(", longMap=").append(longMap);
        if (!projectMap.isEmpty()) builder.append(", projectMap=").append(projectMap);
        if (!typeMap.isEmpty()) builder.append(", typeMap=").append(typeMap);
        builder.append(", binary=").append(binary);
        builder.append(", type=").append(type);
        builder.append(", floatData=").append(floatData);
        builder.append(", stringField=").append(stringField);
        if (anyName != null) builder.append(", anyName=").append(Internal.sanitize(anyName));
        if (anyProject != null) builder.append(", anyProject=").append(anyProject);
        if (anyStore != null) builder.append(", anyStore=").append(anyStore);
        return builder.replace(0, 2, "StoreRequest{").append('}').toString();
    }

    public static final class Builder extends Message.Builder<StoreRequest, Builder> {

        public Integer id;

        public String email;

        public Boolean valid;

        public Map<String, Integer> data;

        public Map<String, Project> projects;

        public List<Integer> unpacked;

        public List<Integer> packed;

        public List<Project> projectList;

        public Project project;

        public Long max;

        public Map<Long, Integer> longMap;

        public Map<Long, Project> projectMap;

        public Map<Long, StoreType> typeMap;

        public ByteString binary;

        public StoreType type;

        public Float floatData;

        public Long stringField;

        public String anyName;

        public Project anyProject;

        public StoreType anyStore;

        public Builder() {
            data = Internal.newMutableMap();
            projects = Internal.newMutableMap();
            unpacked = Internal.newMutableList();
            packed = Internal.newMutableList();
            projectList = Internal.newMutableList();
            longMap = Internal.newMutableMap();
            projectMap = Internal.newMutableMap();
            typeMap = Internal.newMutableMap();
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder valid(Boolean valid) {
            this.valid = valid;
            return this;
        }

        public Builder data(Map<String, Integer> data) {
            Internal.checkElementsNotNull(data);
            this.data = data;
            return this;
        }

        public Builder projects(Map<String, Project> projects) {
            Internal.checkElementsNotNull(projects);
            this.projects = projects;
            return this;
        }

        public Builder unpacked(List<Integer> unpacked) {
            Internal.checkElementsNotNull(unpacked);
            this.unpacked = unpacked;
            return this;
        }

        public Builder packed(List<Integer> packed) {
            Internal.checkElementsNotNull(packed);
            this.packed = packed;
            return this;
        }

        public Builder projectList(List<Project> projectList) {
            Internal.checkElementsNotNull(projectList);
            this.projectList = projectList;
            return this;
        }

        public Builder project(Project project) {
            this.project = project;
            return this;
        }

        public Builder max(Long max) {
            this.max = max;
            return this;
        }

        public Builder longMap(Map<Long, Integer> longMap) {
            Internal.checkElementsNotNull(longMap);
            this.longMap = longMap;
            return this;
        }

        public Builder projectMap(Map<Long, Project> projectMap) {
            Internal.checkElementsNotNull(projectMap);
            this.projectMap = projectMap;
            return this;
        }

        public Builder typeMap(Map<Long, StoreType> typeMap) {
            Internal.checkElementsNotNull(typeMap);
            this.typeMap = typeMap;
            return this;
        }

        public Builder binary(ByteString binary) {
            this.binary = binary;
            return this;
        }

        public Builder type(StoreType type) {
            this.type = type;
            return this;
        }

        public Builder floatData(Float floatData) {
            this.floatData = floatData;
            return this;
        }

        public Builder stringField(Long stringField) {
            this.stringField = stringField;
            return this;
        }

        public Builder anyName(String anyName) {
            this.anyName = anyName;
            this.anyProject = null;
            this.anyStore = null;
            return this;
        }

        public Builder anyProject(Project anyProject) {
            this.anyProject = anyProject;
            this.anyName = null;
            this.anyStore = null;
            return this;
        }

        public Builder anyStore(StoreType anyStore) {
            this.anyStore = anyStore;
            this.anyName = null;
            this.anyProject = null;
            return this;
        }

        @Override
        public StoreRequest build() {
            if (id == null
                    || email == null
                    || project == null
                    || max == null
                    || binary == null
                    || type == null
                    || floatData == null
                    || stringField == null) {
                throw Internal.missingRequiredFields(
                        id,
                        "id",
                        email,
                        "email",
                        project,
                        "project",
                        max,
                        "max",
                        binary,
                        "binary",
                        type,
                        "type",
                        floatData,
                        "floatData",
                        stringField,
                        "stringField");
            }
            return new StoreRequest(this, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_StoreRequest extends ProtoAdapter<StoreRequest> {

        private final ProtoAdapter<Map<String, Integer>> data =
                ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT32);

        private final ProtoAdapter<Map<String, Project>> projects =
                ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Project.ADAPTER);

        private final ProtoAdapter<Map<Long, Integer>> longMap =
                ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, ProtoAdapter.INT32);

        private final ProtoAdapter<Map<Long, Project>> projectMap =
                ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, Project.ADAPTER);

        private final ProtoAdapter<Map<Long, StoreType>> typeMap =
                ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, StoreType.ADAPTER);

        public ProtoAdapter_StoreRequest() {
            super(
                    FieldEncoding.LENGTH_DELIMITED,
                    StoreRequest.class,
                    "type.googleapis.com/StoreProto.StoreRequest");
        }

        @Override
        public int encodedSize(StoreRequest value) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, value.id)
                    + ProtoAdapter.STRING.encodedSizeWithTag(2, value.email)
                    + ProtoAdapter.BOOL.encodedSizeWithTag(3, value.valid)
                    + data.encodedSizeWithTag(4, value.data)
                    + projects.encodedSizeWithTag(5, value.projects)
                    + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(6, value.unpacked)
                    + ProtoAdapter.INT32.asPacked().encodedSizeWithTag(7, value.packed)
                    + Project.ADAPTER.asRepeated().encodedSizeWithTag(8, value.projectList)
                    + Project.ADAPTER.encodedSizeWithTag(9, value.project)
                    + ProtoAdapter.INT64.encodedSizeWithTag(10, value.max)
                    + longMap.encodedSizeWithTag(11, value.longMap)
                    + projectMap.encodedSizeWithTag(12, value.projectMap)
                    + typeMap.encodedSizeWithTag(13, value.typeMap)
                    + ProtoAdapter.BYTES.encodedSizeWithTag(14, value.binary)
                    + StoreType.ADAPTER.encodedSizeWithTag(15, value.type)
                    + ProtoAdapter.FLOAT.encodedSizeWithTag(16, value.floatData)
                    + ProtoAdapter.INT64.encodedSizeWithTag(24, value.stringField)
                    + ProtoAdapter.STRING.encodedSizeWithTag(20, value.anyName)
                    + Project.ADAPTER.encodedSizeWithTag(21, value.anyProject)
                    + StoreType.ADAPTER.encodedSizeWithTag(22, value.anyStore)
                    + value.unknownFields().size();
        }

        @Override
        public void encode(ProtoWriter writer, StoreRequest value) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(writer, 1, value.id);
            ProtoAdapter.STRING.encodeWithTag(writer, 2, value.email);
            ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.valid);
            data.encodeWithTag(writer, 4, value.data);
            projects.encodeWithTag(writer, 5, value.projects);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(writer, 6, value.unpacked);
            ProtoAdapter.INT32.asPacked().encodeWithTag(writer, 7, value.packed);
            Project.ADAPTER.asRepeated().encodeWithTag(writer, 8, value.projectList);
            Project.ADAPTER.encodeWithTag(writer, 9, value.project);
            ProtoAdapter.INT64.encodeWithTag(writer, 10, value.max);
            longMap.encodeWithTag(writer, 11, value.longMap);
            projectMap.encodeWithTag(writer, 12, value.projectMap);
            typeMap.encodeWithTag(writer, 13, value.typeMap);
            ProtoAdapter.BYTES.encodeWithTag(writer, 14, value.binary);
            StoreType.ADAPTER.encodeWithTag(writer, 15, value.type);
            ProtoAdapter.FLOAT.encodeWithTag(writer, 16, value.floatData);
            ProtoAdapter.INT64.encodeWithTag(writer, 24, value.stringField);
            ProtoAdapter.STRING.encodeWithTag(writer, 20, value.anyName);
            Project.ADAPTER.encodeWithTag(writer, 21, value.anyProject);
            StoreType.ADAPTER.encodeWithTag(writer, 22, value.anyStore);
            writer.writeBytes(value.unknownFields());
        }

        @Override
        public StoreRequest decode(ProtoReader reader) throws IOException {
            Builder builder = new Builder();
            long token = reader.beginMessage();
            for (int tag; (tag = reader.nextTag()) != -1; ) {
                switch (tag) {
                    case 1:
                        builder.id(ProtoAdapter.INT32.decode(reader));
                        break;
                    case 2:
                        builder.email(ProtoAdapter.STRING.decode(reader));
                        break;
                    case 3:
                        builder.valid(ProtoAdapter.BOOL.decode(reader));
                        break;
                    case 4:
                        builder.data.putAll(data.decode(reader));
                        break;
                    case 5:
                        builder.projects.putAll(projects.decode(reader));
                        break;
                    case 6:
                        builder.unpacked.add(ProtoAdapter.INT32.decode(reader));
                        break;
                    case 7:
                        builder.packed.add(ProtoAdapter.INT32.decode(reader));
                        break;
                    case 8:
                        builder.projectList.add(Project.ADAPTER.decode(reader));
                        break;
                    case 9:
                        builder.project(Project.ADAPTER.decode(reader));
                        break;
                    case 10:
                        builder.max(ProtoAdapter.INT64.decode(reader));
                        break;
                    case 11:
                        builder.longMap.putAll(longMap.decode(reader));
                        break;
                    case 12:
                        builder.projectMap.putAll(projectMap.decode(reader));
                        break;
                    case 13:
                        builder.typeMap.putAll(typeMap.decode(reader));
                        break;
                    case 14:
                        builder.binary(ProtoAdapter.BYTES.decode(reader));
                        break;
                    case 15:
                        {
                            try {
                                builder.type(StoreType.ADAPTER.decode(reader));
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
                            }
                            break;
                        }
                    case 16:
                        builder.floatData(ProtoAdapter.FLOAT.decode(reader));
                        break;
                    case 20:
                        builder.anyName(ProtoAdapter.STRING.decode(reader));
                        break;
                    case 21:
                        builder.anyProject(Project.ADAPTER.decode(reader));
                        break;
                    case 22:
                        {
                            try {
                                builder.anyStore(StoreType.ADAPTER.decode(reader));
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
                            }
                            break;
                        }
                    case 24:
                        builder.stringField(ProtoAdapter.INT64.decode(reader));
                        break;
                    default:
                        {
                            reader.readUnknownField(tag);
                        }
                }
            }
            builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
            return builder.build();
        }

        @Override
        public StoreRequest redact(StoreRequest value) {
            Builder builder = value.newBuilder();
            Internal.redactElements(builder.projects, Project.ADAPTER);
            Internal.redactElements(builder.projectList, Project.ADAPTER);
            builder.project = Project.ADAPTER.redact(builder.project);
            Internal.redactElements(builder.projectMap, Project.ADAPTER);
            if (builder.anyProject != null)
                builder.anyProject = Project.ADAPTER.redact(builder.anyProject);
            builder.clearUnknownFields();
            return builder.build();
        }
    }
}
