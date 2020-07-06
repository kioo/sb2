package com.mooc.sb2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class  WeatherRunListerer {

    @Autowired
    private WeatherEventMulticaster eventMulticaster;

    public void snow(){
        eventMulticaster.multicastEvent(new SnowWeather());
    }

    public void rain(){
        eventMulticaster.multicastEvent(new RainWeather());
    }
}
