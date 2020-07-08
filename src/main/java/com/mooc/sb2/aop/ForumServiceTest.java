package com.mooc.sb2.aop;

import java.lang.reflect.Proxy;

public class ForumServiceTest {
    public static void main(String[] args) {
        ForumServiceImpl target = new ForumServiceImpl();
        PerformanceHandler handler = new PerformanceHandler(target);

        ForumService proxy = (ForumService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);

        proxy.removeForum(1);
        proxy.removeTopic(1);
    }
}
