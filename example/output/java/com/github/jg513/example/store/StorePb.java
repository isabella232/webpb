// Code generated by Webpb compiler, do not edit.
// https://github.com/jg513/webpb
package com.github.jg513.example.store;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.github.jg513.webpb.WebpbMessage;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@JsonInclude(Include.NON_NULL)
public class StorePb implements WebpbMessage {

    private Integer id;

    private String name;

    private Integer city;
}
