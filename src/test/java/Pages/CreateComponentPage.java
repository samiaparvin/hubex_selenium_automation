package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateComponentPage {
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div[1]/h4")
	WebElement header_lbl1Element;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/h4")
	WebElement header_lbl2Element;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/div[1]/label")
	WebElement lblName;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/div[2]/label")
	WebElement lblDescription;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/div[3]/label")
	WebElement lblOrganization;
	
	@FindBy(how = How.ID, using = "name")
	WebElement txtbox_name;
	
	@FindBy(how = How.ID, using = "description")
	WebElement txtbox_description;
	
	@FindBy(how = How.ID, using = "btnSubmit")
	WebElement btn_submit;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/div[3]/span/span[1]/span/ul/li/input")
	WebElement organization_field;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div[2]/div/ol/li[3]")
	WebElement CrearComponente_breadcrum;
	
	@FindBy(how = How.XPATH, using = "/html/body/span/span/span/ul/li[2]")
	WebElement caris_organizationElement;
	
	public Boolean EditarComponente_visibility() {
		return header_lbl1Element.isDisplayed();
	}
	
	public Boolean CrearComponente_visibility() {
		return header_lbl2Element.isDisplayed();
	}
	
	public Boolean lbl_name_visibility() {
		return lblName.isDisplayed();
	}
	
	public Boolean lbl_deacription_visibility() {
		return lblDescription.isDisplayed();
	}
	
	public Boolean lbl_organization_visibility() {
		return lblOrganization.isDisplayed();
	}
	
	public String breadcrum_CrearComponent()
	{
		return CrearComponente_breadcrum.getAttribute("class");
	}
	
	public String Edit_name()
	{
		return txtbox_name.getAttribute("type");
	}
	
	public String Edit_description()
	{
		return txtbox_description.getAttribute("type");
	}
	
	public void select_organization() {
		organization_field.click();
		caris_organizationElement.click();
	}
	
	public void textboxex_fill() {
		txtbox_name.sendKeys("Auto test 1");
		txtbox_description.sendKeys("Testing");
	}
	
	public void submitBtn_click() {
		btn_submit.click();
	}
	
}
