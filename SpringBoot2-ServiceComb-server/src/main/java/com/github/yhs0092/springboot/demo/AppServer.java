package com.github.yhs0092.springboot.demo;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class AppServer {
  public static void main(String[] args) {
    SpringApplication.run(AppServer.class);
  }
}
