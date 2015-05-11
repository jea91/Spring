package com.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AOPTest
{
    public Object beforeMethod(ProceedingJoinPoint jp) throws Throwable
    {
        Object result = null;
        try
        {
            String methodName = jp.getSignature().getName();
            System.out.println(methodName + " 동작...");
            result = jp.proceed();
            
        }
        catch (Exception e)
        {
            System.out.println("예외 발생");
        }
        System.out.println("동작 완료");
        return result;
    }
    
}