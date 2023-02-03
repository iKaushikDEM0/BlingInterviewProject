package org.assignment;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlingProject {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\User\\eclipse-workspace\\BlingInterviewProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://dash.bling-center.com/platform/signIn.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement forgotPass = driver.findElement(By.xpath("//p[text()='Forgot Password?']"));
		forgotPass.click();
		Thread.sleep(3000);
		WebElement eMail = driver.findElement(By.id("email1"));
		eMail.sendKeys("kaushikdem022@gmail.com");
		Thread.sleep(2000);
		WebElement resend = driver.findElement(By.xpath("//button[@class=\"reset-pwd signIn-btn\"]"));
		resend.click();
		Thread.sleep(10000);
		driver.quit();
		System.out.println("Project Success");
	}
}
