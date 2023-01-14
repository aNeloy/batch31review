package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
	
public class GreenKartPages {
	

	public GreenKartPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how = How.XPATH, using = "//*[@class='brand greenLogo']")
	private static WebElement homePageVerification;

	//@FindBy (how = How.XPATH, using = "//*[@class='products']/div[" + pos2 +"]/div[3]/button")
	@FindBy (how = How.XPATH, using = "//*[@class='products']/div[XX]/div[3]/button")
	private static WebElement addToCartButton;

	@FindBy (how = How.XPATH, using = "//*[@class='cart-icon']")
	private static WebElement cartButton;
	
	@FindBy (how = How.XPATH, using = "//*[contains(text(),'PROCEED TO CHECKOUT')]")
	private static WebElement checkoutButton;
	
	@FindBy (how = How.XPATH, using = "//*[contains(text(),'Total Amount     : ')]")
	private static WebElement totalTextVerification;
	
	@FindBy (how = How.XPATH, using = "//*[@class= 'totAmt']")
	private static WebElement totalAmt;
	
	@FindBy (how = How.XPATH, using = "//*[contains(text(),'Place Order')]")
	private static WebElement placeOrderButton;
	
	@FindBy (how = How.XPATH, using = "//*[select]")
	private static WebElement countryDropdown;
	
	@FindBy (how = How.XPATH, using = "//*[@value='United States']")
	private static WebElement unitedStatesSelection;
	
	@FindBy (how = How.XPATH, using = "//*[@class = 'chkAgree']")
	private static WebElement termsCheckbox;
	
	@FindBy (how = How.XPATH, using = "//*[contains(text(),'Proceed')]")
	private static WebElement proceedButton;
	
	@FindBy (how = How.XPATH, using = "//*[contains(text(),'placed successfully')]")
	private static WebElement successfulPurchase;
	
	
	public WebElement getHomePageVerification() {
		return homePageVerification;
	}

	public void setHomePageVerification(WebElement homePageVerification) {
		GreenKartPages.homePageVerification = homePageVerification;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public void setAddToCartButton(WebElement addToCartButton) {
		GreenKartPages.addToCartButton = addToCartButton;
	}


	public WebElement getCartButton() {
		return cartButton;
	}

	public void setCartButton(WebElement cartButton) {
		GreenKartPages.cartButton = cartButton;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}

	public void setCheckoutButton(WebElement checkoutButton) {
		GreenKartPages.checkoutButton = checkoutButton;
	}

	public WebElement getTotalTextVerification() {
		return totalTextVerification;
	}

	public void setTotalTextVerification(WebElement totalTextVerification) {
		GreenKartPages.totalTextVerification = totalTextVerification;
	}

	public WebElement getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(WebElement totalAmt) {
		GreenKartPages.totalAmt = totalAmt;
	}

	public WebElement getPlaceOrderButton() {
		return placeOrderButton;
	}

	public void setPlaceOrderButton(WebElement placeOrderButton) {
		GreenKartPages.placeOrderButton = placeOrderButton;
	}

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public void setCountryDropdown(WebElement countryDropdown) {
		GreenKartPages.countryDropdown = countryDropdown;
	}

	public WebElement getUnitedStatesSelection() {
		return unitedStatesSelection;
	}

	public void setUnitedStatesSelection(WebElement unitedStatesSelection) {
		GreenKartPages.unitedStatesSelection = unitedStatesSelection;
	}

	public WebElement getTermsCheckbox() {
		return termsCheckbox;
	}

	public void setTermsCheckbox(WebElement termsCheckbox) {
		GreenKartPages.termsCheckbox = termsCheckbox;
	}

	public WebElement getProceedButton() {
		return proceedButton;
	}

	public void setProceedButton(WebElement proceedButton) {
		GreenKartPages.proceedButton = proceedButton;
	}

	public WebElement getSuccessfulPurchase() {
		return successfulPurchase;
	}

	public void setSuccessfulPurchase(WebElement successfulPurchase) {
		GreenKartPages.successfulPurchase = successfulPurchase;
	}

}
