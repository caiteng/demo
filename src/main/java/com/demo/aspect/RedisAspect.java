package com.demo.aspect;

import com.demo.redis.RedisCache;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017-08-14.
 */
@Component
@Aspect
public class RedisAspect {

    @Autowired
    @Qualifier("redisCache")
    private RedisCache redisCache;

    /**
     * 配置切点，对所有service的get方法的结果进行缓存
     */
    @Pointcut("execution(* com.demo.service.*.get(..))")
    public void GetPointCut(){
    }

    @Around("GetPointCut()")
    public Object around(ProceedingJoinPoint joinPoint){

        //获取key key="demo"+类名+方法名+参数
        StringBuffer redisKey=new StringBuffer();
        redisKey.append("demo");
        String className = joinPoint.getTarget().getClass().getSimpleName();
        redisKey.append("_").append(className);
        String methodName = joinPoint.getSignature().getName();
        redisKey.append("_").append(methodName);
        //先获取目标方法参数
        Object[] args = joinPoint.getArgs();
        for(Object obj:args){
            redisKey.append("_").append(String.valueOf(obj));
        }
        System.out.println("redisKey为"+redisKey.toString());

        //获取从redis中查询到的对象
        Object objectFromRedis = redisCache.getDataFromRedis(redisKey.toString());

        //如果查询到了
        if(null != objectFromRedis){
            System.out.println("从redis中查询到了数据...不需要查询数据库");
            return objectFromRedis;
        }

        System.out.println("没有从redis中查到数据...");

        //没有查到，那么查询数据库
        Object object = null;
        try {
            object = joinPoint.proceed();
        } catch (Throwable e) {

            e.printStackTrace();
        }

        System.out.println("从数据库中查询的数据...");

        //后置：将数据库中查询的数据放到redis中
        System.out.println("把数据库查询的数据存储到redis中...");

        redisCache.setDataToRedis(redisKey.toString(), object);

        //将查询到的数据返回
        return object;

   }
}
