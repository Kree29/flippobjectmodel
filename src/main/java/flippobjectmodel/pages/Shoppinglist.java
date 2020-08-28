package flippobjectmodel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Shoppinglist {
	public WebElement ShoppingList() {
		return BaseDriver.driver.findElement(By.xpath("//*[@class='sl-button']"));
	}
	
	public WebElement addItemField() {
		
		return BaseDriver.driver.findElement(By.xpath("//*[@title='Add an item']"));
	}
	

}
