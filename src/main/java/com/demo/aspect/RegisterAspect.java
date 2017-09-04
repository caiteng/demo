package com.demo.aspect;

/**
 * Created by caiteng on 2017-09-04.
 */

import com.demo.core.exception.DemoException;
import com.demo.service.UserService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.test.context.transaction.BeforeTransaction;

/**
 * 注册切面
 * @author qubianzhong
 *
 */
@Aspect
@Component
public class RegisterAspect {

    /**
     * 查询结果处理
     * @param joinPoint 接入点
     * @param result 目标方法的返回结果
     */
    @AfterReturning(value="execution(* com.demo.service.UserService.*(..))", returning = "result")
    public void afterMethod(JoinPoint joinPoint, Object result){

       // throw new DemoException("结果不存在");

    }

    /**
     * 对所有controller进行日志输出
     * @param joinPoint
     */
    @Before(value="execution(* com.demo.controller.*.*(..))")
    public void controllerLog(JoinPoint joinPoint){
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        System.out.println(className+":"+methodName);
    }

}