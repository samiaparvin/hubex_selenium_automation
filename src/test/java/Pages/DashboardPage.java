package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {

	//Locating_elements_in_dashboard_page
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/header/nav/div[2]/ul[2]/li[2]/a/span")
	WebElement lbl_componenetes;
	
	public WebElement getComponentes(){return lbl_componenetes;}
	
}
