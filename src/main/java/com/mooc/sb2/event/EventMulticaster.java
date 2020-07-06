package com.mooc.sb2.event;

/**
 * 定义事件广播器接口
 */
public interface EventMulticaster {
    /**
     * 触发事件Event的方法
     * @param event
     */
    void multicastEvent(WeatherEvent event);

    /**
     * 添加监听器的方法
     * @param listener
     */
    void addListener(WeatherListener listener);

    /**
     * 移除监听器的方法
     * @param listener
     */
    void removeListener(WeatherListener listener);
}
