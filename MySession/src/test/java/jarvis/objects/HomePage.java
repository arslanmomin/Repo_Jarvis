package jarvis.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commands.ElementsOp;
import configs.Base;

public class HomePage extends Base{

	@FindBy(xpath="//li[@id='topcartlink']/a/span[1]")
	WebElement shoppingcart;
	
	@FindBy(className="ico-logout")
	WebElement logout;
	
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void clickoncart() throws Exception {
		ElementsOp.click(getDriver(),shoppingcart,"shoppingcart btn");
		
	}
	
	public void clickonlogout() throws Exception {
		ElementsOp.click(getDriver(),logout,"logout button");
		
	}
	
	//public static By shoppingcart =By.xpath("//li[@id='topcartlink']/a/span[1]");
	//public static By logoutbtn = By.className("ico-logout");
	
}