package com.amazon.bestSeller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAmazonTitle {

	public static void main(String[] args) {
		//this is how we open chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver1= new FirefoxDriver();
		//driver1.get("https://www.amazon.com/");
		
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver2= new EdgeDriver();
		//this is how we open an application
		//driver2.get("https://www.amazon.com/");
			
		// not working
		//WebDriverManager.iedriver().setup();
		//WebDriver driver3= new InternetExplorerDriver();
		//driver3.get("https://www.amazon.com/");
		
		String amazonTitle= driver.getTitle();
		// string is a data type
		// amazonTitle is a variable
		//= is an operator
		// driver.getTitle(); is a selinium WebDriver interface method. also variable value.
		System.out.println(amazonTitle);
		
		// kill browser command
		//driver1.quit();
		
	}

}
