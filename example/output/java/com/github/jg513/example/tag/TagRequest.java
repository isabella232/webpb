// Code generated by Webpb compiler, do not edit.
// https://github.com/jg513/webpb
package com.github.jg513.example.tag;

import com.github.jg513.webpb.WebpbMessage;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class TagRequest implements WebpbMessage {

    public static final String METHOD = "GET";

    public static final String PATH = "/tag";
}
