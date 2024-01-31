package com.stockfm.crawling.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CrawlingTest {

//	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
//	public static final String WEB_DRIVER_PATH = "./chromedriver.exe";
	
//	public void runBrowser() {
//		WebDriverManager.chromedriver().setup();
//		
//		// 크롬 옵션 설정
//		ChromeOptions option = new ChromeOptions();
//		ChromeDriver driver = new ChromeDriver(option);
//		
//		// 실행
//		driver.get("https://kr.investing.com/");
//	}
	
	public List<HashMap<String,String>> CTest () {
		System.out.println("#####################################");
		System.out.println("init CTest");
		List<HashMap<String, String>> resultSet = new ArrayList<>();
		HashMap<String, String> resultMap = new HashMap<>();
		
		WebDriverManager.chromedriver().setup();
		
		// 크롬 드라이버 설정
//		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		
		// 크롬 옵션 설정
		ChromeOptions option = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(option);
		try {
			driver.get("https://kr.investing.com/");
			System.out.println("timesleep:10000ms");
			Thread.sleep(2000);
			
			System.out.println("data");
			System.out.println(driver.findElements(By.className("datatable-v2_table__93S4Y dynamic-table-v2_dynamic-table__iz42m datatable-v2_table--mobile-basic__uC0U0 datatable-v2_table--freeze-column__uGXoD datatable-v2_table--freeze-column-first__zMZNN undefined")));
			
			
		} catch(Exception e) {
			System.out.println(e);
		}
		
		
		return resultSet;
	}
}
