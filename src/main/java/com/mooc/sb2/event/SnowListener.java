package com.mooc.sb2.event;

import javafx.beans.WeakListener;
import org.springframework.stereotype.Component;

@Component
public class SnowListener implements WeatherListener {

    @Override
    public void onWeatherEvent(WeatherEvent weatherEvent) {
        if(weatherEvent instanceof SnowWeather){
            System.out.println("Hello "+ weatherEvent.getWeather());
        }
    }
}
