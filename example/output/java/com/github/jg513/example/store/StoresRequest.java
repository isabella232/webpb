// Code generated by Webpb compiler, do not edit.
// https://github.com/jg513/webpb
package com.github.jg513.example.store;

import com.github.jg513.webpb.WebpbMessage;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Range;

@Getter
@Setter
@Accessors(chain = true)
public class StoresRequest implements WebpbMessage {

    public static final String METHOD = "POST";

    public static final String PATH = "/stores/{type}";

    @NotNull(message = "City is required")
    @Range(min = 0)
    private Integer city;
}
