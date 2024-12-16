package com.winsun.rosalindfranklin;

import com.winsun.rosalindfranklin.model.MyModel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomerManagementApiApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(MyModel.name);
	}

}
