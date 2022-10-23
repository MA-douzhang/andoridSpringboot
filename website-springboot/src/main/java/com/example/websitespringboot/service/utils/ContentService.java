package com.example.websitespringboot.service.utils;

import com.example.websitespringboot.entity.Content;
import com.example.websitespringboot.entity.New;

import java.util.List;

public interface ContentService {
  List<Content> findAll();
  Integer save(Content content);
}
