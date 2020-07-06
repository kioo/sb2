package com.mooc.sb2.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

@Order(3)
public class ThirdInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        ConfigurableEnvironment environment = configurableApplicationContext.getEnvironment();
//        environment.setRequiredProperties("mooc");
        Map<String, Object> map = new HashMap<>();
        map.put("key3","value1");
        MapPropertySource mapPropertySource = new MapPropertySource("thirdInitializar", map);
        environment.getPropertySources().addLast(mapPropertySource);
        System.out.println("run -----------------000 thridInitializer");

    }
}
