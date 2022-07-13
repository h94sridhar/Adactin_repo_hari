package com.minimvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class mini {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HARIKRISHNAN S\\eclipse-workspace\\Java_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("harrykrish404");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Hari@2022");

		WebElement login = driver.findElement(By.name("login"));
		login.click();

		Thread.sleep(3000);

		WebElement location = driver.findElement(By.name("location"));

		Select s = new Select(location);
		s.selectByVisibleText("London");

		WebElement hotels = driver.findElement(By.name("hotels"));
		Select s1 = new Select(hotels);
		s1.selectByVisibleText("Hotel Cornice");

		WebElement room_type = driver.findElement(By.name("room_type"));
		Select s2 = new Select(room_type);
		s2.selectByVisibleText("Deluxe");

		Thread.sleep(3000);

		WebElement room_nos = driver.findElement(By.name("room_nos"));
		Select s3 = new Select(room_nos);
		s3.selectByVisibleText("7 - Seven");

		WebElement CheckIn = driver.findElement(By.xpath("(//input[@type='text'])[2] "));
		CheckIn.clear();

		CheckIn.sendKeys("07/04/2022");

		WebElement CheckOut = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		CheckOut.clear();
		CheckOut.sendKeys("10/04/2022");

		WebElement adult_room = driver.findElement(By.name("adult_room"));
		Select s6 = new Select(adult_room);
		s6.selectByVisibleText("3 - Three");

		WebElement child_room = driver.findElement(By.name("child_room"));
		Select s7 = new Select(child_room);
		s7.selectByVisibleText("2 - Two");

		WebElement search = driver.findElement(By.name("Submit"));
		search.click();

		WebElement radiobutton = driver.findElement(By.name("radiobutton_0"));
		radiobutton.click();

		WebElement Continue = driver.findElement(By.name("continue"));

		Continue.click();

		Thread.sleep(2000);

		WebElement first_name = driver.findElement(By.name("first_name"));
		first_name.sendKeys("Harry");

		WebElement last_name = driver.findElement(By.name("last_name"));
		last_name.sendKeys("krish");

		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("dubai, dubai kurukku street");

		WebElement cc_num = driver.findElement(By.name("cc_num"));
		cc_num.sendKeys("9843172202843801");

		WebElement card_type = driver.findElement(By.name("cc_type"));
		Select s8 = new Select(card_type);
		s8.selectByVisibleText("Master Card");

		WebElement cardmonth = driver.findElement(By.name("cc_exp_month"));
		Select s9 = new Select(cardmonth);
		s9.selectByVisibleText("January");
		
		Thread.sleep(6000);

		WebElement cardyear = driver.findElement(By.name("cc_exp_year"));
		Select s10 = new Select(cardyear);
		s10.selectByVisibleText("2022");

		WebElement ccv = driver.findElement(By.name("cc_cvv"));
		ccv.sendKeys("123");

		WebElement book = driver.findElement(By.name("book_now"));
		book.click();

		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click();

	}
}
