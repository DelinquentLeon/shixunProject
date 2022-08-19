package com.cqu.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class WelcomeInterceptor implements HandlerInterceptor {
	 /**
     * 目标方法执行前
     * 该方法在控制器处理请求方法前执行，其返回值表示是否中断后续操作
     * 返回 true 表示继续向下执行，返回 false 表示中断后续操作
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("submitUser");
        if (loginUser == null) {
            //未登录，返回登陆页
            request.setAttribute("msg", "请先填写表单！");
            request.getRequestDispatcher("/submit.html").forward(request, response);
            return false;
        } else {
            //放行
            return true;
        }
    }
}
