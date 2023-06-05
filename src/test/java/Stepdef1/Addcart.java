package Stepdef1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	import io.cucumber.java.en.*;

	import org.junit.Assert;

	public class Addcart {
		WebDriver driver = Hooks1.driver;
		
		@When("Click on login")
		public void click_on_login() {
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
			loginButton.click();
		    
		}

		@When("I click Add to cart in {string}")
		public void i_click_Add_to_cart_in(String string) throws InterruptedException {
		 Thread.sleep(2000);   
		WebElement productName = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		productName.click();
		}

		@When("I click add to cart")
		public void i_click_add_to_cart() throws InterruptedException {
		WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		addToCartButton.click();
		Thread.sleep(2000);
		}

		@When("I click on shopping cart link")
		public void i_click_on_shopping_cart_link() {
		WebElement shoppingCartLink  = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		shoppingCartLink.click();  
		}

		@Then("I should be able to see the product as {string}")
		public void i_should_be_able_to_see_the_product_as(String string) {
			
			WebElement productTitleOnCartPage = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
			String actualProductName = productTitleOnCartPage.getText();
			String expectedProductName = "Sauce Labs Backpack";
			Assert.assertEquals(actualProductName, expectedProductName);
		}

		}
	




