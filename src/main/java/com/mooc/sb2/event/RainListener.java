package com.mooc.sb2.event;

import org.springframework.stereotype.Component;

@Component
public class RainListener implements WeatherListener {

    @Override
    public void onWeatherEvent(WeatherEvent weatherEvent) {
        if(weatherEvent instanceof RainWeather){
            System.out.println("Hello "+ weatherEvent.getWeather());
        }
    }
}
