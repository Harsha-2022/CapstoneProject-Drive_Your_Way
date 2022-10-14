package com.driveyway;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.*;
import org.testng.annotations.*;

public class DriveYourWayTests {
	private WebDriver wd;
	private String URL = "http://localhost:4200/";

	@Test(priority = 1)
	public void userlogin() throws InterruptedException {
		Thread.sleep(2500);
		wd.findElement(By.xpath("//a[contains(text(),'Create an Account!')]")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(1000);
		wd.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(2500);
		wd.findElement(
				By.cssSelector("body > app-root > div > div > app-login > div > form > div > div:nth-child(1) > input"))
				.sendKeys("Sammuel");
		Thread.sleep(2500);
		wd.findElement(
				By.cssSelector("body > app-root > div > div > app-login > div > form > div > div:nth-child(3) > input"))
				.sendKeys("user");
		Thread.sleep(2500);
		wd.findElement(By
				.cssSelector("body > app-root > div > div > app-login > div > form > div > div:nth-child(5) > button"))
				.click();
		Thread.sleep(2500);
		wd.findElement(By.xpath("//button[contains(text(),'Subscribe')]")).click();
		Thread.sleep(2500);
		wd.findElement(By.cssSelector(
				"div.page-wrapper:nth-child(1) div.page-container div.main-content:nth-child(2) div.section-content.section-content-p30 div.container-fluid div:nth-child(5) > button:nth-child(1)"))
				.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2500);
		wd.findElement(By.xpath("//button[@id='btn']")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//a[contains(text(),'Show All')]")).click();
		Thread.sleep(2500);
	}

	@Test(priority = 2)
	public void ScrollBar() throws Exception {
		Thread.sleep(2000);
		String execScript = "return document.documentElement.scrollHeight>document.documentElement.clientHeight;";
		JavascriptExecutor scrollBarPresent = (JavascriptExecutor) wd;
		Boolean test = (Boolean) (scrollBarPresent.executeScript(execScript));
		if (test == true) {
			System.out.print("Scrollbar is present.\n");
		} else if (test == false) {
			System.out.print("Scrollbar is not present.\n");
		}
	}

	@Test(priority = 3)
	public void scroll() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) wd;
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2500);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(2500);
	}

	@Test(priority = 4)
	public void car() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) wd;
		Thread.sleep(3000);
		wd.findElement(By.xpath("//a[contains(text(),'Sedan')]")).click();
		Thread.sleep(3000);
		wd.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/app-product-list[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/button[1]"))
				.click();
		Thread.sleep(1000);
		wd.findElement(By.xpath(
				" //body/app-root[1]/div[1]/div[1]/app-product-list[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]"))
				.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2500);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		wd.findElement(By.xpath(" //a[contains(text(),'Back to Home Page')]")).click();
		Thread.sleep(1500);
		wd.findElement(By.xpath("//header/div[1]/div[1]/div[1]/app-cart-status[1]/div[1]/a[1]/div[1]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 5)
	public void search() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) wd;
		Thread.sleep(3000);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		wd.findElement(
				By.cssSelector("body > app-root > div > div > header > div > div > div > app-search > div > input"))
				.sendKeys("HYUNDAI");
		Thread.sleep(2500);
		wd.findElement(
				By.cssSelector("body > app-root > div > div > header > div > div > div > app-search > div > button"))
				.click();
		Thread.sleep(2500);
		wd.findElement(
				By.cssSelector("body > app-root > div > div > header > div > div > div > app-search > div > input"))
				.clear();
		Thread.sleep(2000);
	}

	@Test(priority = 6)
	public void cart() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		wd.findElement(By.cssSelector(
				"div.page-wrapper:nth-child(1) div.page-container header.header-desktop:nth-child(1) div.section-content.section-content-p30 div.container-fluid div.header-wrap app-cart-status:nth-child(2) div.cart-area.d-n:nth-child(2) a:nth-child(1) > div.total"))
				.click();
		Thread.sleep(3000);
		wd.findElement(By.cssSelector(
				"div.page-wrapper:nth-child(1) div.page-container div.main-content:nth-child(2) div.section-content.section-content-p30 div.container-fluid table.table.table-bordered tr:nth-child(3) td:nth-child(2) a:nth-child(2) > button.au-btn-submit"))
				.click();
		Thread.sleep(3500);
		wd.findElement(By.xpath("//button[contains(text(),'Look for more Models!')]")).click();
		Thread.sleep(3500);

	}

	@Test(priority = 7)
	public void sellcar() throws InterruptedException {

		Thread.sleep(2500);
		wd.findElement(By.xpath("//button[contains(text(),'Sell Your Car')]")).click();
		Thread.sleep(2500);
		wd.findElement(
				By.cssSelector("body > app-root > div > div > app-add-product > div > form > div:nth-child(2) > input"))
				.sendKeys("BMW Z4");
		Thread.sleep(2000);
		wd.findElement(
				By.cssSelector("body > app-root > div > div > app-add-product > div > form > div:nth-child(4) > input"))
				.sendKeys(
						"BMW India has listed the 2019 Z4 on its official website, suggesting its imminent launch. It is expected to be available in two variants: sDrive20i and the M40i. Where the sDrive20i is powered by a 2.0-litre petrol engine that makes 197PS of power and 320Nm of torque, the M40i gets a 3.0-litre unit that produces 340PS and 500Nm. Both engines are mated to an 8-speed automatic transmission.");
		Thread.sleep(2000);
		wd.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/app-add-product[1]/div[1]/form[1]/div[3]/input[1]"))
				.sendKeys("103147");
		Thread.sleep(2000);
		wd.findElement(
				By.cssSelector("body > app-root > div > div > app-add-product > div > form > div:nth-child(8) > input"))
				.sendKeys(
						"https://stimg.cardekho.com/images/carexteriorimages/630x420/BMW/Z4/6880/1645593929509/front-left-side-47.jpg?impolicy=resize&imwidth=420");
		Thread.sleep(2000);
		wd.findElement(By
				.cssSelector("body > app-root > div > div > app-add-product > div > form > div:nth-child(10) > select"))
				.sendKeys("Convertible");
		Thread.sleep(2000);
		wd.findElement(By
				.cssSelector("body > app-root > div > div > app-add-product > div > form > div:nth-child(12) > button"))
				.click();
		Thread.sleep(2000);
	}

	@Test(priority = 8)
	public void adminlogin() throws InterruptedException {
		wd.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
		Thread.sleep(2500);
		wd.findElement(
				By.cssSelector("body > app-root > div > div > app-login > div > form > div > div:nth-child(1) > input"))
				.sendKeys("admin");
		Thread.sleep(2500);
		wd.findElement(
				By.cssSelector("body > app-root > div > div > app-login > div > form > div > div:nth-child(3) > input"))
				.sendKeys("admin");
		Thread.sleep(2500);
		wd.findElement(By
				.cssSelector("body > app-root > div > div > app-login > div > form > div > div:nth-child(5) > button"))
				.click();
		Thread.sleep(2500);
	}

	@Test(priority = 9)
	public void addproduct() throws InterruptedException {

		Thread.sleep(2500);
		wd.findElement(By.xpath("//button[contains(text(),'Add Model')]")).click();
		Thread.sleep(2500);
		wd.findElement(
				By.cssSelector("body > app-root > div > div > app-add-product > div > form > div:nth-child(2) > input"))
				.sendKeys("MARUTI SUZUKI S-Presso");
		Thread.sleep(2000);
		wd.findElement(
				By.cssSelector("body > app-root > div > div > app-add-product > div > form > div:nth-child(4) > input"))
				.sendKeys(
						"The Maruti Suzuki S-Presso has a decently performing 998 cc engine which churns out 67 BHP of maximum power along with peak torque of 90 Nm which offers good drivability, especially on city roads The Maruti Suzuki S-Presso is reasonable value for money, if you are looking for a nicely performing and relatively spacious entry-level offering that is more like an SUV in terms of its look, feel and height.");
		Thread.sleep(2000);
		wd.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/app-add-product[1]/div[1]/form[1]/div[3]/input[1]"))
				.sendKeys("13675");
		Thread.sleep(2000);
		wd.findElement(
				By.cssSelector("body > app-root > div > div > app-add-product > div > form > div:nth-child(8) > input"))
				.sendKeys(
						"https://th-i.thgim.com/public/incoming/5u0bn1/article65356044.ece/alternates/FREE_1200/S-Presso.jpg");
		Thread.sleep(2000);
		wd.findElement(By
				.cssSelector("body > app-root > div > div > app-add-product > div > form > div:nth-child(10) > select"))
				.sendKeys("Crossover");
		Thread.sleep(2000);
		wd.findElement(By
				.cssSelector("body > app-root > div > div > app-add-product > div > form > div:nth-child(12) > button"))
				.click();
		Thread.sleep(2000);
	}

	/*
	 * @Test(priority=10) public void removeproduct() throws InterruptedException {
	 * 
	 * Thread.sleep(3000); wd.findElement(By.
	 * cssSelector("body > app-root > div > div > app-product-list > div > div > div > div.row > div:nth-child(1) > div > div:nth-child(3) > button.btn.btn-danger.btn-sm"
	 * )).click(); Thread.sleep(2500); }
	 * 
	 * @Test(priority=11) public void editproduct() throws InterruptedException {
	 * 
	 * Thread.sleep(3000); wd.findElement(By.
	 * cssSelector("body > app-root > div > div > app-product-list > div > div > div > div.row > div:nth-child(1) > div > div:nth-child(3) > button.btn.btn-success.btn-sm"
	 * )).click(); Thread.sleep(2500); }
	 */

	@BeforeClass
	public void launchapp() {
		System.out.println(" Executing on CHROME");
		System.setProperty("webdriver.chrome.driver", "C:\Users\USER\Downloads\chromedriver_win32\\chromedriver.exe");
		wd = new ChromeDriver();
		long start = System.currentTimeMillis();
		wd.get(URL);
		System.out.println("Chrome: Title: " + wd.getTitle());
		long finish = System.currentTimeMillis();
		long Total_time = (finish - start) / 1000;
		System.out.println("Chrome:Total page load time: " + Total_time + " seconds");
		if (Total_time > 10)
			System.out.println("Page load time is more than expected in Chrome:(");
		else
			System.out.println("Hurray! Page loaded quickly in Chrome :D");
		wd.manage().window().maximize();
	}

	@AfterClass
	public void closeBrowser() {
		wd.close();
	}
}
