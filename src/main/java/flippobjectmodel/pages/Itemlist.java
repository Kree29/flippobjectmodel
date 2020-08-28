package flippobjectmodel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Itemlist {
	
	
	public WebElement ShoppingList() {
		return BaseDriver.driver.findElement(By.xpath("//div[@class='accessories']"));
	}

}
