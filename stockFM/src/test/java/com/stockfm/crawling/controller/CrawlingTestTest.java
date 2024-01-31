package com.stockfm.crawling.controller;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class CrawlingTestTest {

//	@MockBean
//    private StockFmApplicationTests test;
	
	
	CrawlingTest service = new CrawlingTest();
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Test");
	}
	
	@Test
	public void runTest() {
		System.out.println("jUnit run method:CTset");
		service.CTest();
	}
}
