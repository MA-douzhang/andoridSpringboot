package com.example.websitespringboot.service.utils;

import com.example.websitespringboot.entity.Comment;
import com.example.websitespringboot.entity.New;

import java.util.List;

public interface CommentService {
  List<Comment> findAll();

  //新闻编辑保存
  Integer save(New news);
  //新闻删除方法
  Integer delete(Integer id);
}
