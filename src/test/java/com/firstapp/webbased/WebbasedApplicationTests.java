package com.firstapp.webbased;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.firstapp.webbased.controller.MessageDisplayController;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class WebbasedApplicationTests {

@Autowired
	private MessageDisplayController controller;

@Test
void contextLoads() throws Exception {
		
	assertThat(controller).isNotNull();
	}

}
