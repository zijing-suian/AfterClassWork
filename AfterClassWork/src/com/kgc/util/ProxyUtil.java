package com.kgc.util;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
//@Transactional
//@Aspect
//@Component  //可以将非java类变成springboot的组件
public class ProxyUtil {
    public Logger logger = Logger.getLogger(getClass());

    @Pointcut(value = "execution(* com.kgc..*.*(..))")  //公共切点
    public void point(){

    }



    /**
     * 前置通知  JoinPoint  业务方法执行之前
     * 可以定义多个切点,用||隔开
     * @Before("point() || aa()")
     * @param joinPoint
     */
    @Before("point()")
    public void before(JoinPoint joinPoint){
        logger.info("||before C:"+joinPoint.getTarget()+" M:"+joinPoint.getSignature().getDeclaringTypeName()
        +"\n P:"+ Arrays.toString(joinPoint.getArgs()));
    }

    /**
     * 后置通知  JoinPoint  目标方法正常执行之后
     * @param joinPoint
     * @param str
     */
    @AfterReturning(pointcut = "point()",returning = "str")
    public void afterReturn(JoinPoint joinPoint,Object str){
        logger.info("||afterReturn C:"+joinPoint.getTarget()+" M:"+joinPoint.getSignature().getDeclaringTypeName()
                +"\n P:"+ Arrays.toString(joinPoint.getArgs())+" R:"+str+" afterReturn||");
    }

    /**
     * 异常通知  JoinPoint  目标方法抛出异常之后
     * @param joinPoint
     * @param e
     */
    @AfterThrowing(pointcut = "point()",throwing = "e")
    public void afterThrowing(JoinPoint joinPoint,Exception e){
        logger.info("||afterThrowing C:"+joinPoint.getTarget()+" M:"+joinPoint.getSignature().getDeclaringTypeName()
                +"\n P:"+ Arrays.toString(joinPoint.getArgs())+" E:"+e);
    }

    /**
     * 最终通知  JoinPoint  目标方法执行之后
     */
    @After(value = "point()")
    public void after(JoinPoint joinPoint){
        logger.info("||after C:"+joinPoint.getTarget()+" M:"+joinPoint.getSignature().getDeclaringTypeName()
                +"\n P:"+ Arrays.toString(joinPoint.getArgs()));
    }

    /**
     * 环绕通知[最强大,用得最多]  ProceedingJoinPoint  目标方法执行前后
     * 修改参数与返回值[一般不改]
     * 进行异常处理
     * 决定方法是否执行
     */
//    @Around(value = "point()")
    public Object around(ProceedingJoinPoint joinPoint){
//        logger.info("||around C:"+joinPoint.getTarget()+" M:"+joinPoint.getSignature().getDeclaringTypeName()
//                +"\n P:"+ Arrays.toString(joinPoint.getArgs()));
        Object[] args = joinPoint.getArgs();

        //可以对参数进行修改
//        if(args!=null){
//            for (int i = 0; i < args.length; i++) {
//                args[i]="要修改的值";
//            }
//        }
//        try {
            //执行业务方法,得到返回值
//            Object proceed = joinPoint.proceed(args);

            //可以对返回结果进行修改
            //根据被增强方法的返回值进行类型转换[public void showInfo()]
//            String modify = (String) proceed;

            //返回未修改或修改后的值
//            return modify;

            logger.info("||around C:"+joinPoint.getTarget()+" M:"+joinPoint.getSignature().getDeclaringTypeName()
                    +"\n P:"+ Arrays.toString(joinPoint.getArgs()));

//            return proceed;
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
        return null;
    }

}
