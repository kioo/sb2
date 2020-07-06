package com.mooc.sb2.event;

public class Test {

    public static void main(String[] args) {
        WeatherEventMulticaster weatherEventMulticaster = new WeatherEventMulticaster();
        RainListener rainListener = new RainListener();
        SnowListener snowListener = new SnowListener();
        weatherEventMulticaster.addListener(rainListener);
        weatherEventMulticaster.addListener(snowListener);
        weatherEventMulticaster.multicastEvent(new RainWeather());
        weatherEventMulticaster.multicastEvent(new SnowWeather());
    }
}
