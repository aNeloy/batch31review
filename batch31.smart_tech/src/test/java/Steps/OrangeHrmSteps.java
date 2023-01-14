package Steps;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.OrangeHrmPages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class OrangeHrmSteps {
	
		WebDriver driver;
		OrangeHrmPages page;
		
		@Given("User go to OrangeHRM home page")
		public void user_go_to_OrangeHRM_home_page() throws InterruptedException {
		   
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(4000);
			page = new OrangeHrmPages(driver);		
		}

	/*	@Given("User click on the user name field")
		public void user_click_on_the_user_name_field() {
			
		   //driver.findElement(By.xpath("//*[@name='username']")).click();
			page.getUsername().click();
		}
	*/
		
		@When("User type test username in username field")
		public void user_type_test_username_in_username_field() throws InterruptedException {
		    
			//driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
			page.getUsername().sendKeys("Admin");
		}

		@When("User click on the password field")
		public void user_click_on_the_password_field() {
		   
			//driver.findElement(By.xpath("//*[@name='password']")).click();
			page.getPassword().click();
		}

		@When("User type test password in password field")
		public void user_type_test_password_in_password_field() {
		   //driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		   page.getPassword().sendKeys("admin123");
			
		}

		@Then("User click on the login button")
		public void user_click_on_the_loging_button() throws InterruptedException {
		   
			//driver.findElement(By.xpath("//*[@type='submit']")).click();
			page.getSubmit().click();
			Thread.sleep(4000);
		}

//		@Then("User verify the text {string}")
//		public void user_verify_the_text(String expectedText) {
//			
//		   String expected = expectedText;
//		   //String actual = driver.findElement(By.xpath("//*[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
//		   String actual = page.getDashboardVerification().getText();
//		   Assert.assertTrue("The text does not match", expected.contains(actual));
//		}
		@Then("^User verify the text \"([^\"]*)\"$")
		public void user_verify_the_text(String expectedText) throws Throwable {
			String expected = expectedText;
			   //String actual = driver.findElement(By.xpath("//*[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
			   String actual = page.getDashboardVerification().getText();
			   Assert.assertTrue("The text does not match", expected.contains(actual));
		}
}
