package flippobjectmodel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebElement postCode() {
		return BaseDriver.getDriver().findElement(By.xpath("//*[@name='postal_code']"));
		
	}

}
