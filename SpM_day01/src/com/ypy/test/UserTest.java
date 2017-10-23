package com.ypy.test;

import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ypy.model.UserModel;
import com.ypy.service.impl.UserServiceImpl;

public class UserTest {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserServiceImpl user = ac.getBean(UserServiceImpl.class);
		List<UserModel> list = user.query();
		for (UserModel u : list) {
			System.out.println(u);
		}
	}

}
