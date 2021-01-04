package com.cy.pj.common.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.pj.common.cache.DefaultCache;

@SpringBootTest //这个注解描述的类也会由spring框架进行创建,并且进行值的注入
public class DefaultCacheTests {

	/**
	 * has a
	 * @Autowired 注解描述的属性,由spring框架进行值的注入(赋值).
	 */
	@Autowired
	private DefaultCache defaultCache;
	
	@Test
	void testDefaultCache() {
		System.out.println("defaultCache="+defaultCache);
	}
}
