package com.example.websitespringboot.entity;

import lombok.Data;

@Data
public class Comment {
  private Integer id;
  private String content;
  private Integer userId;
  private String time;
  private Integer originId;
  private Integer pid;
  private Integer articleId;
}
