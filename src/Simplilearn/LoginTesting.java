package Simplilearn;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTesting {
		
		@Test
		public void Login1() {
			
			System.setProperty("webdriver.chrome.driver","chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.simplilearn.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			/*driver.findElement(By.linkText("Log in")).click(); - Click log in directly, but not recommended to avoid multiple calls in future. 
			Use object based for code reuse */
			
			WebElement LoginLink = driver.findElement(By.linkText("Log in"));
			LoginLink.click();
			WebElement UserName = driver.findElement(By.name("user_login"));
			UserName.sendKeys("ausr@my.com");
			WebElement UserPwd = driver.findElement(By.name("user_pwd"));
			UserPwd.sendKeys("ausr");
			WebElement RememberMe = driver.findElement(By.className("rememberMe"));
			RememberMe.click();
			WebElement Login = driver.findElement(By.name("btn_login"));
			Login.click();

			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			WebElement ErrorMsg = driver.findElement(By.id("msg_box"));
			String ActMsg = ErrorMsg.getText();
			System.out.println("ActMsg:" + ActMsg);
			String ExpMsg = "The email or password you have entered is invalid.";
			
			if (ActMsg.equals(ExpMsg)) {
				System.out.println("PASSED: Test case for Invalid User Nama and Password completed successfuly");
			}
			else {
				System.out.println("FAILED: Test case for Invalid User Nama and Password failed.");
			}
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
			
			driver.close();
			
		}
	

}
