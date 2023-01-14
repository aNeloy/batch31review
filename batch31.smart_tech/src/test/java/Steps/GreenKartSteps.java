package Steps;


import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.GreenKartPages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class GreenKartSteps {

	WebDriver driver;
	GreenKartPages page;
	TreeMap<Integer,Integer> prices;
	int price2;
	int pos2;
	int price3;
	int pos3;
	int total;
	
	@Given("User goes to GreenKart home page")
	public void user_goes_to_GreenKart_home_page() throws Throwable {
	driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	page = new GreenKartPages(driver);
	
	}
	
	@Given("^User verifies the text \"([^\"]*)\"$")
	public void verify_Green_Kart_home_page(String expectedText) {
		String actual = page.getHomePageVerification().getText();
		Assert.assertTrue("The text does not match" , expectedText.contains(actual));	
	}
	
	@Given("^User sorts and prints the items in descending order$")
	public void user_sorts_and_prints_the_items_in_descending_order() {
		
		//tree map takes two pieces of data. So price, and position of product(for add to cart button). 
		//tree map automatically sorts after every put()
		prices = new TreeMap<Integer, Integer>(Collections.reverseOrder());
		List<WebElement> products = driver.findElements(By.xpath("//*[@class = 'product-price']"));	
		for(int i=0; i<products.size() -1; i++) {
			prices.put(Integer.parseInt(products.get(i).getText()) , i+1 );
		}
		int tmp=0;
		
		//prints the prices in tree map and stores position of second, third highest item, and price
		for (Map.Entry<Integer, Integer> price : prices.entrySet()) {
		     System.out.println("Price " + price.getKey() + ". Position: " + price.getValue());
		     if(tmp==1) {pos2 = price.getValue();
		     			 price2 = price.getKey();}
		     if(tmp==2) {pos3 = price.getValue();
		     			 price3 = price.getKey();}
		     tmp++;
		}
		
	}

	@When("^User adds second most expensive item to cart$")
	public void user_adds_second_most_expensive_item_to_cart() {
		
		//WebElement button1 = driver.findElement(By.xpath("//*[@class='products']/div[" + pos2 +"]/div[3]/button"));
		//Couldnt insert variable pos2 into page factory xpath like above. Ended up doing weird line below
		//where I convert the getter method result to string then inserting pos2
		String newXPath = page.getAddToCartButton().toString().substring(52,96).replaceAll("XX", Integer.toString(pos2));
		driver.findElement(By.xpath(newXPath)).click();
	}

	
	@When("^User adds third most expensive item to cart$")
	public void user_adds_third_most_expensive_item_to_cart() {
	 
		String newXPath2 = page.getAddToCartButton().toString().substring(52,96).replaceAll("XX", Integer.toString(pos3));
		driver.findElement(By.xpath(newXPath2)).click();
	}

	
	@Then("^User clicks on the shopping bag icon$")
	public void user_clicks_on_the_shopping_bag_icon() {
	    
		page.getCartButton().click();
	}

	@Then("^User clicks on the Proceed to Checkout button$")
	public void user_clicks_on_the_Proceed_to_Checkout_button() {
		
		page.getCheckoutButton().click();  
	}

	@Then("^User verifies \"([^\"]*)\"$")
	public void user_verifies(String arg1) throws InterruptedException {
		
		Thread.sleep(2000);
		String actual = page.getTotalTextVerification().getText();
		total = price2 + price3;
		Assert.assertTrue("The text does not match" , (arg1.contains(actual)) && page.getTotalAmt().getText().contains(Integer.toString(total)));
	}

	@Then("^User clicks on the Place Order Button$")
	public void user_clicks_on_the_Place_Order_Button() {
		
		page.getPlaceOrderButton().click();
	}

	@Then("^User selects Ship To United States from the drop down$")
	public void user_selects_Ship_To_United_States_from_the_drop_down() throws InterruptedException {
		
		Thread.sleep(1000);
	    page.getCountryDropdown().click();
	    page.getUnitedStatesSelection().click();
	}

	@Then("^User checks the terms and conditions checkbox$")
	public void user_checks_the_terms_and_conditions_checkbox() {
		
		page.getTermsCheckbox().click();
	}

	@Then("^User clicks on the Proceed button$")
	public void user_clicks_on_the_Proceed_button() {
		
		page.getProceedButton().click();
	}

	@Then("^User verifies the \"([^\"]*)\" text$")
	public void user_verifies_the_text(String arg1) throws InterruptedException {
		
		Thread.sleep(1000);
	    String actual = page.getSuccessfulPurchase().getText();
	    actual = actual.substring(0, 50);
	    Assert.assertTrue("The text does not match" , arg1.contains(actual));
	}

	@Then("^User is redirected to the home page$")
	public void user_is_redirected_to_the_home_page() throws InterruptedException {
		
		Thread.sleep(4000);
		Assert.assertTrue("Website did not redirect to home page" , driver.getCurrentUrl().contains("https://rahulshettyacademy.com/seleniumPractise/#/"));
 
	}
	
	
	
	
}
