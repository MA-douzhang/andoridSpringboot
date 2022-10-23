package com.example.websitespringboot.controller;

import com.example.websitespringboot.entity.Content;
import com.example.websitespringboot.service.impl.ContentServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/content")
public class ContentController {
  @Resource
  ContentServiceImpl contentService;

  @GetMapping("/")
  private List<Content> findAll(){
    return contentService.findAll();
  }

  @PostMapping("/save")
  private Integer save(Content content){
    return contentService.save(content);
  }
}
