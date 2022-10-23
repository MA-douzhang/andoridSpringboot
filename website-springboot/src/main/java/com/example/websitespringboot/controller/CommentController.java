package com.example.websitespringboot.controller;

import com.example.websitespringboot.entity.Comment;
import com.example.websitespringboot.service.impl.CommentServiceImpl;
import com.example.websitespringboot.service.utils.CommentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
  @Resource
  private CommentServiceImpl commentService;

  @GetMapping("/")
  private List<Comment> getList(){
    return commentService.findAll();
  }

  @DeleteMapping("/{id}")
  private Integer delete(@PathVariable Integer id){
    return commentService.delete(id);
  }
}
