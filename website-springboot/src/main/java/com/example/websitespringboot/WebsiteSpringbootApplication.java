package com.example.websitespringboot;

import com.example.websitespringboot.entity.User;
import com.example.websitespringboot.mapper.MapperUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@SpringBootApplication
public class WebsiteSpringbootApplication {
  public static void main(String[] args) {
    SpringApplication.run(WebsiteSpringbootApplication.class, args);
  }
}
