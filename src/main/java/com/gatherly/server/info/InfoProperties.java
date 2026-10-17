package com.gatherly.server.info;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.info")
public record InfoProperties(
    String name,
    String author,
    String version) {
}
