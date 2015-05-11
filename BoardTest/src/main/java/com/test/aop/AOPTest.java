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
            System.out.println(methodName + " ����...");
            result = jp.proceed();
            
        }
        catch (Exception e)
        {
            System.out.println("���� �߻�");
        }
        System.out.println("���� �Ϸ�");
        return result;
    }
    
}