package com.example.websitespringboot.config;

import com.example.websitespringboot.config.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

  @Bean
  public MyInterceptor setBean2(){
    System.out.println("注入了handler");
    return new MyInterceptor();
  }

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(setBean2())
      //ToDo 会拦截所有接口
      .addPathPatterns("/**")
      .excludePathPatterns("/user/login","/user/register","/file/**");
  }
}
