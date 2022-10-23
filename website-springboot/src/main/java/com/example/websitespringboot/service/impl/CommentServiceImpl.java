package com.example.websitespringboot.service.impl;

import com.example.websitespringboot.entity.Comment;
import com.example.websitespringboot.entity.New;
import com.example.websitespringboot.mapper.MapperComment;
import com.example.websitespringboot.service.utils.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

  @Resource
  MapperComment mapperComment;

  @Override
  public List<Comment> findAll() {
    return mapperComment.findAll();
  }

  @Override
  public Integer save(New news) {
    return null;
  }

  @Override
  public Integer delete(Integer id) {
    return mapperComment.delete(id);
  }
}
