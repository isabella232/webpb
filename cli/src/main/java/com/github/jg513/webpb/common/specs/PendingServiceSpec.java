package com.github.jg513.webpb.common.specs;

import com.squareup.wire.schema.ProtoFile;
import com.squareup.wire.schema.Service;
import com.github.jg513.webpb.common.PendingSpec;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PendingServiceSpec extends PendingSpec {
    private final ProtoFile file;

    private final Service service;
}
