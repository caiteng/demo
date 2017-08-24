package com.demo.redis;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017-08-14.
 */
@Component
@Aspect
public class RedisAspect {

//    @Autowired
//    @Qualifier("redisCache")
//    private RedisCache redisCache;
//
//    //设置切点：使用xml，在xml中配置
//    @Pointcut("execution(* com.demo.service.*.get(java.lang.Integer))")    //测试用，这里还额外指定了方法名称，方法参数类型，方法形参等，比较完整的切点表达式
//    public void myPointCut(){
//
//    }
//
//    @Around("myPointCut()")
//    public Object around(ProceedingJoinPoint joinPoint){
//        //前置：到redis中查询缓存
//        System.out.println("调用从redis中查询的方法...");
//
//        //先获取目标方法参数
//        String applId = null;
//        Object[] args = joinPoint.getArgs();
//        if (args != null && args.length > 0) {
//            applId = String.valueOf(args[0]);
//        }
//
//        //redis中key格式：    applId
//        String redisKey = applId;
//
//        //获取从redis中查询到的对象
//        Object objectFromRedis = redisCache.getDataFromRedis(redisKey);
//
//        //如果查询到了
//        if(null != objectFromRedis){
//            System.out.println("从redis中查询到了数据...不需要查询数据库");
//            return objectFromRedis;
//        }
//
//        System.out.println("没有从redis中查到数据...");
//
//        //没有查到，那么查询数据库
//        Object object = null;
//        try {
//            object = joinPoint.proceed();
//        } catch (Throwable e) {
//
//            e.printStackTrace();
//        }
//
//        System.out.println("从数据库中查询的数据...");
//
//        //后置：将数据库中查询的数据放到redis中
//        System.out.println("调用把数据库查询的数据存储到redis中的方法...");
//
//        redisCache.setDataToRedis(redisKey, object);
//
//        //将查询到的数据返回
//        return object;
//
//    }
}
