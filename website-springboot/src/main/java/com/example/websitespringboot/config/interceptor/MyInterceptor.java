package com.example.websitespringboot.config.interceptor;

import com.example.websitespringboot.entity.User;
import com.sun.net.httpserver.HttpsServer;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyInterceptor implements HandlerInterceptor {
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    System.out.println("--------------拦截器-------------");
    try {

//      response.setHeader("Access-Control-Allow-Origin", "http://localhost:20888");
      //todo ajxs跨域导致session不能找到
      //统一拦截（查询当前session是否存在user）(这里user会在每次登录成功后，写入session)
//      request.getSession().setAttribute("user","3333");
      //为找到header中id会返回undefined
      String user =  request.getHeader("id");
      //拦截器 判断是否登录
//      if(!user.equals("undefined")){
//        System.out.println("--------------拦截器放行-------------");
//        return true;
//      }
//      response.sendRedirect("/backlogin");
    } catch (Exception e) {
      e.printStackTrace();
    }
    return true;
  }
}
