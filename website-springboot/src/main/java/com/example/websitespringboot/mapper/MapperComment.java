package com.example.websitespringboot.mapper;

import com.example.websitespringboot.entity.Comment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MapperComment {

  @Select("select * from t_comment")
  List<Comment> findAll();

  @Delete("delete from t_comment where id=#{id}")
  Integer delete(Integer id);
}
