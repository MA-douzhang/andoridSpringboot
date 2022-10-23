package com.example.websitespringboot.mapper;

import com.example.websitespringboot.entity.Content;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MapperContent {
  @Select("select * from t_content")
  List<Content> findAll();

  @Insert("INSERT into t_content(title,content) values (#{title},#{content})")
  Integer save(Content content);
}
