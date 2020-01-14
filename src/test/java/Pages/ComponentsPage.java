package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ComponentsPage {
	
	//Locating_elements_in_components_page
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/header/nav/div[2]/ul[2]/li[1]/a/span")
	WebElement lbl_dashboard;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/header/nav/div[2]/ul[2]/li[2]/a/span")
	WebElement lbl_components;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/header/nav/div[2]/ul[2]/li[3]/a/span")
	WebElement lbl_roles;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/header/nav/div[2]/ul[2]/li[4]/a/span")
	WebElement lbl_usuarios;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/header/nav/div[2]/ul[2]/li[5]/a/span")
	WebElement lbl_procesos;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/header/nav/div[2]/ul[2]/li[6]/a")
	WebElement lbl_reportes;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/header/nav/div[2]/ul[2]/li[7]/a")
	WebElement lbl_profileName;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/header/nav/div[2]/ul[2]/li[7]/a")
	WebElement lbl_listaDeComponent;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/header/nav/div[1]/a/b/img[2]")
	WebElement hubex_logo;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div[2]/div/ol/li[2]")
	WebElement brdCrum_listaDeComponent;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div[2]/div/a/button")
	WebElement crear_component;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/h4")
	WebElement header_listaDeComponenet;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/table/thead/tr/th[1]")
	WebElement lbl_name;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/table/thead/tr/th[2]")
	WebElement lbl_description;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/table/thead/tr/th[3]")
	WebElement lbl_createdBy;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/table/thead/tr/th[4]")
	WebElement lbl_craetedAt;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/table/thead/tr/th[5]")
	WebElement lbl_options;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div[2]/div/a/button")
	WebElement btn_crearCompo;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[5]/a[1]/i")
	WebElement btn_editElement;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[5]/a[2]")
	WebElement btn_delete;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[60]/div/div[2]/div[1]")
	WebElement del_btn_alertMssgBox;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[60]/div/div[3]/button[1]")
	WebElement delBtn_alert_yesBtn;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[60]/div/div[3]/button[2]")
	WebElement delBtn_alert_cancleBtn;
	
	public Boolean Hubex_logo_visibility() {
		return hubex_logo.isDisplayed();
	}
	
	public Boolean label_dashboard_visibility() {
		return lbl_dashboard.isDisplayed();
	}
	
	public Boolean label_component_visibility() {
		return lbl_components.isDisplayed();
	}
	
	public Boolean label_roles_visibility() {
		return lbl_roles.isDisplayed();
	}
	
	public Boolean label_usuarios_visibility() {
		return lbl_usuarios.isDisplayed();
	}
	
	public Boolean label_procesos_visibility() {
		return lbl_procesos.isDisplayed();
	}
	
	public Boolean label_reportes_visibility() {
		return lbl_reportes.isDisplayed();
	}
	
	public Boolean label_profileName_visibility() {
		return lbl_profileName.isDisplayed();
	}
	
	public Boolean label_listaDeComponent_visibility() {
		return lbl_listaDeComponent.isDisplayed();
	}
	
	public String breadcrum_listDeComponents()
	{
		return brdCrum_listaDeComponent.getAttribute("class");
	}

	public Boolean header_listaDeComponent_visibility() {
		return header_listaDeComponenet.isDisplayed();
	}
	
	public Boolean label_name_visibility() {
		return lbl_name.isDisplayed();
	}
	
	public Boolean label_descrption_visibility() {
		return lbl_description.isDisplayed();
	}
	
	public Boolean label_createdBy_visibility() {
		return lbl_createdBy.isDisplayed();
	}
	
	public Boolean label_createdAt_visibility() {
		return lbl_craetedAt.isDisplayed();
	}
	
	public Boolean label_option_visibility() {
		return lbl_options.isDisplayed();
	}
	
	public Boolean btn_create_component_visibility() {
		return btn_crearCompo.isDisplayed();
	}
	
	public void edit_btn_click() {
		btn_editElement.click();
	}
	
	public void crearComponentes_click() {
		btn_crearCompo.click();
	}
	
	public void click_btn_delete() {
		btn_delete.click();
	}
	
	public Boolean delBtn_alertMssg_visibility() {
		return del_btn_alertMssgBox.isDisplayed();
	}
	
	public Boolean delBtn_alert_yesBtn_visibility() {
		return delBtn_alert_yesBtn.isDisplayed();
	}
	
	public Boolean delBtn_alert_cancleBtn_visibility() {
		return delBtn_alert_cancleBtn.isDisplayed();
	}
	
	public void delBtn_alert_cancleBtn_click()
	{
		delBtn_alert_cancleBtn.click();
	}
}
