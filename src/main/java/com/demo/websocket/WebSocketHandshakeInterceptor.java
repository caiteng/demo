package com.demo.websocket;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import java.util.Map;

/**
 * Created by Administrator on 2017-08-04.
 */
public class WebSocketHandshakeInterceptor implements HandshakeInterceptor {

    //在调用handler前处理方法。常用在注册用户信息，绑定WebSocketSession，在handler里根据用户信息获取WebSocketSession发送消息
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response,
                                   WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {
        if (request instanceof ServletServerHttpRequest) {
            //attributes.put("username",userName);
//            attributes.put("username","");
        }
        return true;
    }


    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception exception) {

    }
}