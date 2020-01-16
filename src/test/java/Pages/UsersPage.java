package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsersPage {

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div[1]/h4")
	WebElement header_lbl1Element;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/h4")
	WebElement header_lbl2Element;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/table/thead/tr/th[1]")
	WebElement tblHeader_nombre;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/table/thead/tr/th[2]")
	WebElement tblHeader_apellido;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/table/thead/tr/th[3]")
	WebElement tblHeader_SegundoApellido;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/table/thead/tr/th[4]")
	WebElement tblHeader_email;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/table/thead/tr/th[5]")
	WebElement tblHeader_tipo;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/table/thead/tr/th[6]")
	WebElement tblHeader_creadoPor;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/table/thead/tr/th[6]")
	WebElement tblHeader_creadoEl;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[8]/a[1]")
	WebElement btn_edit;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[8]/a[2]")
	WebElement btn_Lock;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[8]/a[3]")
	WebElement btn_Delete;
	
	public Boolean Header1_visibility()
	{
		return header_lbl1Element.isDisplayed();
	}
	
	public Boolean Header2_visibility()
	{
		return header_lbl2Element.isDisplayed();
	}
	
	public Boolean TH_Nombre_visibility()
	{
		return tblHeader_nombre.isDisplayed();
	}
	
	public Boolean TH_Apellido_visibility()
	{
		return tblHeader_apellido.isDisplayed();
	}
	
	public Boolean TH_SegundoApellido_visibility()
	{
		return tblHeader_SegundoApellido.isDisplayed();
	}
	
	public Boolean TH_Email_visibility()
	{
		return tblHeader_email.isDisplayed();
	}
	
	public Boolean TH_Tipo_visibility()
	{
		return tblHeader_tipo.isDisplayed();
	}
	
	public Boolean TH_CreadoPor_visibility()
	{
		return tblHeader_creadoPor.isDisplayed();
	}
	
	public Boolean TH_creadoEl_visibility()
	{
		return tblHeader_creadoEl.isDisplayed();
	}
	
	
}
