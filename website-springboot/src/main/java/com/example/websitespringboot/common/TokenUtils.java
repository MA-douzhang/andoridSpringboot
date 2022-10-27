package com.example.websitespringboot.common;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.websitespringboot.entity.User;
import com.example.websitespringboot.service.impl.UserServiceImpl;
import com.example.websitespringboot.service.utils.UserService;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Component
public class TokenUtils {
   private static UserServiceImpl userService;
  /**
   * 生成token
   * @param userId
   * @param password
   * @return
   */
  public static String genToken(String userId, String password) {
    return JWT.create().withAudience(userId) // 将 user id 保存到 token 里面,作为载荷
      .withExpiresAt(DateUtil.offsetHour(new Date(), 2)) // 2小时后token过期
      .sign(Algorithm.HMAC256(password)); // 以 password 作为 token 的密钥
  }
  public static User getCurrentAdmin() {
    String token = null;
    try {
      HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
      token = request.getHeader("token");
      if (StrUtil.isNotBlank(token)) {
        token = request.getParameter("token");
      }
      if (StrUtil.isBlank(token)) {
        System.out.println("获取当前登录的token失败， token: {}"+ token);
        return null;
      }
      String userId = JWT.decode(token).getAudience().get(0);
      return userService.getById(Integer.valueOf(userId));
    } catch (Exception e) {
      System.out.println("获取当前登录的管理员信息失败, token={}"+ token+ e);
      return null;
    }
  }
}
