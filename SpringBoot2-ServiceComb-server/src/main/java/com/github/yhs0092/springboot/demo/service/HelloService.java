package com.github.yhs0092.springboot.demo.service;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestSchema(schemaId = "hello")
//@RestController
@RequestMapping("helloService")
public class HelloService {

  private static final Logger LOGGER = LoggerFactory.getLogger(HelloService.class);

  @RequestMapping(path = "/hello", method = RequestMethod.GET)
  public String hello(@RequestParam(value = "name") String name) {
    LOGGER.info("hello() is called, name = [{}]", name);
    return "Hello, " + name;
  }
}
