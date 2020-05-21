// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: Resource.proto
package com.github.jg513.example.resource;

import com.github.jg513.webpb.core.WebpbMessage;
import com.github.jg513.webpb.options.MessageOptions;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import okio.ByteString;

@Getter
@Setter
@Accessors(chain = true)
public final class PageablePb extends Message<PageablePb, PageablePb.Builder>
        implements WebpbMessage {

    public static final MessageOptions MESSAGE_OPTIONS = new MessageOptions.Builder().build();

    public static final ProtoAdapter<PageablePb> ADAPTER = new ProtoAdapter_PageablePb();

    private static final long serialVersionUID = 0L;

    public static final Boolean DEFAULT_PAGINATION = false;

    public static final Integer DEFAULT_PAGE = 0;

    public static final Integer DEFAULT_SIZE = 0;

    public static final String DEFAULT_SORT = "";

    @WireField(tag = 1, adapter = "com.squareup.wire.ProtoAdapter#BOOL")
    private Boolean pagination;

    @WireField(tag = 2, adapter = "com.squareup.wire.ProtoAdapter#INT32")
    private Integer page;

    @WireField(tag = 3, adapter = "com.squareup.wire.ProtoAdapter#INT32")
    private Integer size;

    @WireField(tag = 4, adapter = "com.squareup.wire.ProtoAdapter#STRING")
    private String sort;

    public PageablePb() {
        super(ADAPTER, ByteString.EMPTY);
    }

    public PageablePb(Boolean pagination, Integer page, Integer size, String sort) {
        this(pagination, page, size, sort, ByteString.EMPTY);
    }

    public PageablePb(
            Boolean pagination, Integer page, Integer size, String sort, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        this.pagination = pagination;
        this.page = page;
        this.size = size;
        this.sort = sort;
    }

    @Override
    public MessageOptions messageOptions() {
        return MESSAGE_OPTIONS;
    }

    @Override
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.pagination = pagination;
        builder.page = page;
        builder.size = size;
        builder.sort = sort;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof PageablePb)) return false;
        PageablePb o = (PageablePb) other;
        return unknownFields().equals(o.unknownFields())
                && Internal.equals(pagination, o.pagination)
                && Internal.equals(page, o.page)
                && Internal.equals(size, o.size)
                && Internal.equals(sort, o.sort);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode;
        if (result == 0) {
            result = unknownFields().hashCode();
            result = result * 37 + (pagination != null ? pagination.hashCode() : 0);
            result = result * 37 + (page != null ? page.hashCode() : 0);
            result = result * 37 + (size != null ? size.hashCode() : 0);
            result = result * 37 + (sort != null ? sort.hashCode() : 0);
            super.hashCode = result;
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (pagination != null) builder.append(", pagination=").append(pagination);
        if (page != null) builder.append(", page=").append(page);
        if (size != null) builder.append(", size=").append(size);
        if (sort != null) builder.append(", sort=").append(Internal.sanitize(sort));
        return builder.replace(0, 2, "PageablePb{").append('}').toString();
    }

    public static final class Builder extends Message.Builder<PageablePb, Builder> {

        public Boolean pagination;

        public Integer page;

        public Integer size;

        public String sort;

        public Builder() {}

        public Builder pagination(Boolean pagination) {
            this.pagination = pagination;
            return this;
        }

        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        public Builder size(Integer size) {
            this.size = size;
            return this;
        }

        public Builder sort(String sort) {
            this.sort = sort;
            return this;
        }

        @Override
        public PageablePb build() {
            return new PageablePb(pagination, page, size, sort, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_PageablePb extends ProtoAdapter<PageablePb> {

        public ProtoAdapter_PageablePb() {
            super(
                    FieldEncoding.LENGTH_DELIMITED,
                    PageablePb.class,
                    "type.googleapis.com/ResourceProto.PageablePb");
        }

        @Override
        public int encodedSize(PageablePb value) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, value.pagination)
                    + ProtoAdapter.INT32.encodedSizeWithTag(2, value.page)
                    + ProtoAdapter.INT32.encodedSizeWithTag(3, value.size)
                    + ProtoAdapter.STRING.encodedSizeWithTag(4, value.sort)
                    + value.unknownFields().size();
        }

        @Override
        public void encode(ProtoWriter writer, PageablePb value) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.pagination);
            ProtoAdapter.INT32.encodeWithTag(writer, 2, value.page);
            ProtoAdapter.INT32.encodeWithTag(writer, 3, value.size);
            ProtoAdapter.STRING.encodeWithTag(writer, 4, value.sort);
            writer.writeBytes(value.unknownFields());
        }

        @Override
        public PageablePb decode(ProtoReader reader) throws IOException {
            Builder builder = new Builder();
            long token = reader.beginMessage();
            for (int tag; (tag = reader.nextTag()) != -1; ) {
                switch (tag) {
                    case 1:
                        builder.pagination(ProtoAdapter.BOOL.decode(reader));
                        break;
                    case 2:
                        builder.page(ProtoAdapter.INT32.decode(reader));
                        break;
                    case 3:
                        builder.size(ProtoAdapter.INT32.decode(reader));
                        break;
                    case 4:
                        builder.sort(ProtoAdapter.STRING.decode(reader));
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
        public PageablePb redact(PageablePb value) {
            Builder builder = value.newBuilder();
            builder.clearUnknownFields();
            return builder.build();
        }
    }
}
