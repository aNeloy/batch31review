package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmPages {

		public OrangeHrmPages(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy (how = How.XPATH, using = "//*[@name='username']")
		private static WebElement username;
		
		@FindBy (how = How.XPATH, using = "//*[@name='password']")
		private static WebElement password;
		
		@FindBy (how = How.XPATH, using = "//*[@type='submit']")
		private static WebElement submit;
		
		@FindBy (how = How.XPATH, using ="//*[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
		private static WebElement dashboardVerification;

		
		public WebElement getUsername() {
			return username;
		}
		
		public void setUsername(WebElement username) {
			OrangeHrmPages.username = username;
		}

		
		public WebElement getPassword() {
			return password;
		}

		public void setPassword(WebElement password) {
			OrangeHrmPages.password = password;
		}

		
		public WebElement getSubmit() {
			return submit;
		}

		public void setSubmit(WebElement submit) {
			OrangeHrmPages.submit = submit;
		}

		
		public WebElement getDashboardVerification() {
			return dashboardVerification;
		}

		public void setDashboardVerification(WebElement dashboardVerification) {
			OrangeHrmPages.dashboardVerification = dashboardVerification;
		}
		
		
		
}
