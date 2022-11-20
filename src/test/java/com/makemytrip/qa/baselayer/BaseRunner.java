package com.makemytrip.qa.baselayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseRunner {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");

	}

}
