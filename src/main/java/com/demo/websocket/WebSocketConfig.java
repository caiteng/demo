package com.demo.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * Created by Administrator on 2017-08-04.
 */
@Configuration
@EnableWebMvc
@EnableWebSocket
public class WebSocketConfig extends WebMvcConfigurerAdapter implements WebSocketConfigurer {

    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        //允许连接的域,只能以http或https开头
       // String[] allowsOrigins = {"http://localhost"};

       /* 实现WebSocketConfigurer接口，重写registerWebSocketHandlers方法，这是一个核心实现方法，配置websocket入口，
       允许访问的域、注册Handler、SockJs支持和拦截器。

        registry.addHandler注册和路由的功能，当客户端发起websocket连接，把/path交给对应的handler处理，
        而不实现具体的业务逻辑，可以理解为收集和任务分发中心。

        setAllowedOrigins(String[] domains),允许指定的域名或IP(含端口号)建立长连接，如果只允许自家域名访问，这里轻松设置。
        如果不限时使用"*"号，如果指定了域名，则必须要以http或https开头。

        addInterceptors，handler添加拦截器，可以在调用handler前后加入我们自己的逻辑代码。*/

       //WebIM WebSocket通道
        registry.addHandler(chatWebSocketHandler(),"/springWebSocket").addInterceptors(myInterceptor());

       // registry.addHandler(chatWebSocketHandler(),"/sockjs/webSocket").setAllowedOrigins(allowsOrigins).addInterceptors(myInterceptor()).withSockJS();
    }

    /**
     * 处理类
     * @return
     */
    @Bean
    public ChatWebSocketHandler chatWebSocketHandler() {
        return new ChatWebSocketHandler();
    }

    /**
     * 拦截器
     * @return
     */
    @Bean
    public WebSocketHandshakeInterceptor myInterceptor(){
        return new WebSocketHandshakeInterceptor();
    }
}
