package flippobjectmodel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class ItemPage {
	
	public WebElement getTitle() {
		if (BaseDriver.driver.findElements(By.xpath("//*[@class='slideable title']/span")).size() != 0) {
			return BaseDriver.driver.findElement(By.xpath("//*[@class='slideable title']/span"));
		}
		else {
			return null;
		}
		
	}
	
	public WebElement getPrice() {
		
		if (BaseDriver.driver.findElements(By.xpath("//flipp-price")).size() != 0) {
			return BaseDriver.driver.findElement(By.xpath("//flipp-price"));
		}
		else {
			return null;
		}
	}
}
