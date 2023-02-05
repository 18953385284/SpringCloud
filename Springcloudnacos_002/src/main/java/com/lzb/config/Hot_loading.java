package com.lzb.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author lzb
 * @date 2023/2/4 16:01
 */
@Data
@Component
@ConfigurationProperties(prefix = "pattern")
public class Hot_loading {
    public String dateformat;
    public String envSharedValue;
}
