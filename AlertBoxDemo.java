package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\CDAC\\Desktop\\Selenium Testing\\chromedriver-win32\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");

		d.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
		Alert a = d.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
Thread.sleep(3000);

		d.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
Thread.sleep(3000);
		d.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		Alert a1 = d.switchTo().alert();
		System.out.println(a1.getText());
		a1.accept();
		WebElement we= d.findElement(By.xpath("//p[@id='demo']"));
		System.out.println(we.getText());
Thread.sleep(3000);

		d.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
Thread.sleep(3000);
		d.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
		Alert a2 = d.switchTo().alert();
		//System.out.println(a2.getText());
		Thread.sleep(3000);
		a2.sendKeys("Manasi");
		Thread.sleep(3000);
		a2.accept();
		Thread.sleep(3000);
		WebElement we1= d.findElement(By.xpath("//p[@id='demo1']"));
		System.out.println(we1.getText());
Thread.sleep(3000);

	}

}
