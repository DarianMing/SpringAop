package com.lm.demo.aspet;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author lm
 * @since 2019-07-31 16:03
 **/
@Aspect
@Component
public class UserAspect {

//    @Before("bean(userController)")
//    public void before (JoinPoint joinPoint) {
//        System.out.println("-------------before with pointcut expression bean(userController)-------------");
//        joinPoint.getArgs();//获取当前目标方法调用传递的参数
//        joinPoint.getSignature();//获取当前目标方法的签名，通过它可以获取到目标方法名
//        joinPoint.getThis();//获取AOP生成的代理对象
//        joinPoint.getTarget();//获取被代理对象，即目标对象
//        System.out.println(Arrays.toString(joinPoint.getArgs()));
//        System.out.println(joinPoint.getSignature().getName());
//        System.out.println(joinPoint.getThis().getClass());
//        System.out.println(joinPoint.getTarget().getClass());
//        System.out.println(joinPoint.toString());
//    }
//
//    @Around("bean(userController)")
//    public Object around (ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("-----around with pointcut expression: bean(userService)------");
//        System.out.println("---------------------调用前---------------------");
//        Object[] params = new Object[]{15};
//        Object result = pjp.proceed(params);//可以调整目标方法调用时传递的参数
//        System.out.println("---------------------调用后---------------------");
//        return result;
//    }

    @Before("execution(void com.lm.demo.controller.UserController.testParam(..)) && args(param))")
    public void test (Integer param) {
        System.out.println(param);
    }


}
