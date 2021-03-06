package com.neuq.info.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

/**
 * Created by lihang on 2017/4/24.
 */
public class AllInterceptor implements WebRequestInterceptor {
//    @Autowired
//    private RedisDao redisDao;
    @Autowired
    private RedisTemplate redisTemplate;

    public void preHandle(WebRequest request) throws Exception {

        String session = request.getHeader("session");
        if (session != null && session != "") {
//            Object wxSessionObj = redisDao.get(session);
            Object wxSessionObj = redisTemplate.opsForValue().get("session");
            if (wxSessionObj != null) {
                String wxSessionStr = (String) wxSessionObj;
                String sessionKey = wxSessionStr.split("#")[0];
                String openId = wxSessionStr.split("#")[1];
                request.setAttribute("sessionKey", sessionKey, WebRequest.SCOPE_REQUEST);
                request.setAttribute("openId", openId, WebRequest.SCOPE_REQUEST);
            }
        }
    }

    public void postHandle(WebRequest webRequest, ModelMap modelMap) throws Exception {

    }

    public void afterCompletion(WebRequest webRequest, Exception e) throws Exception {

    }

}
