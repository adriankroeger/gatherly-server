package com.gatherly.server.info;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@ConfigurationPropertiesScan
public class InfoController {

  private final InfoProperties properties;

  InfoController(InfoProperties properties) {
    this.properties = properties;
  }

  @GetMapping({"api/info", "api/info/"})
  public InfoProperties getInfo() {
      return properties;
  }
  
}