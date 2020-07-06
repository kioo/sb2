package com.mooc.sb2.event;

import javafx.beans.WeakListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 事件广播器抽象类
 * 实现了定义监听器的类型
 * 实现了添加和移除监听器的方法
 * 实现了事件广播的方法
 */
@Component
public  abstract class AbstractEventMulticaster implements EventMulticaster{

    @Autowired
    private List<WeatherListener> listenerList;

    @Override
    public void multicastEvent(WeatherEvent event) {
        doStart();
        // 遍历每个监听器，然后调用监听器的判断方法，确定是否是自己感兴趣的event
        listenerList.forEach(i -> i.onWeatherEvent(event));
        doEnd();
    }

    @Override
    public void addListener(WeatherListener listener) {
        listenerList.add(listener);
    }

    @Override
    public void removeListener(WeatherListener listener) {
        listenerList.remove(listener);
    }

    abstract void doEnd();
    abstract void doStart();

}
