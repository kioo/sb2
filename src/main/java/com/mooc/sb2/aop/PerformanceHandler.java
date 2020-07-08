package com.mooc.sb2.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * need to implements InvocationHandler make target class strong
 */
public class PerformanceHandler implements InvocationHandler {

    private Object targer;

    public PerformanceHandler(Object target){
        this.targer = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // before strong
        System.out.println(targer.getClass().getName()+"."+ method.getName());
        // invoke target method
        Object obj = method.invoke(targer,args);
        System.out.println("end after");

        return obj;
    }
}
