package com.mooc.sb2.event;

import org.springframework.stereotype.Component;

@Component
public class WeatherEventMulticaster extends AbstractEventMulticaster{
    @Override
    void doEnd() {
        System.out.println("停止广播");
    }

    @Override
    void doStart() {
        System.out.println("开始广播");
    }
}
