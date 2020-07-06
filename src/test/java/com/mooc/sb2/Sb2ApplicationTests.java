package com.mooc.sb2;

import com.mooc.sb2.event.WeatherRunListerer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Sb2ApplicationTests {

	@Autowired
	private WeatherRunListerer weatherRunListerer;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testEvent(){
		weatherRunListerer.rain();
		weatherRunListerer.snow();
	}


}
