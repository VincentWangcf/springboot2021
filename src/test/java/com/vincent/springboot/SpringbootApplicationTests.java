package com.vincent.springboot;

import com.vincent.springboot.demo.Api;
import com.vincent.springboot.demo.Impl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

	@Test
	void contextLoads() {

		Api api = new Impl();
		api.test1("哈哈，不要紧张，只是个测试而已！");
		System.out.println("不可以这样的去做这种的事情的");
        Impl impl = new Impl();



    }

}
