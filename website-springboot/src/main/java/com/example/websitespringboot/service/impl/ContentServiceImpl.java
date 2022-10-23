package com.example.websitespringboot.service.impl;

import com.example.websitespringboot.entity.Content;
import com.example.websitespringboot.mapper.MapperContent;
import com.example.websitespringboot.service.utils.ContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {

  @Resource
  MapperContent mapperContent;
  @Override
  public List<Content> findAll() {
    return mapperContent.findAll();
  }

  @Override
  public Integer save(Content content) {
    return mapperContent.save(content);
  }
}
