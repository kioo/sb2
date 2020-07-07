package com.mooc.sb2;

import com.mooc.sb2.initializer.SecondInitializer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;

import javax.swing.*;

@SpringBootApplication
@MapperScan("com.mooc.sb2.mapper")
public class Sb2Application {

	public static void main(String[] args) throws InterruptedException {

		SpringApplication.run(Sb2Application.class, args);

		// add Initializer
//		SpringApplication springApplication = new SpringApplication(Sb2Application.class);
//		springApplication.addInitializers(new SecondInitializer());
//		springApplication.run(args);

		// timer use way
//		StopWatch stopWatch = new StopWatch();
//		stopWatch.start("task1");
//		Thread.sleep(1000L);
//		stopWatch.stop();
//		stopWatch.start("task2");
//		Thread.sleep(2000L);
//		stopWatch.stop();
//
//		System.out.println(stopWatch.prettyPrint());

	}

}
