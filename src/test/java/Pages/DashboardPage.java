package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {

	//Locating_elements_in_dashboard_page
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/header/nav/div[1]/a/b/img[2]")
	WebElement HubexLogo;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/header/nav/div[2]/ul[2]/li[1]/a/span")
	WebElement lbl_Dashboard;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/header/nav/div[2]/ul[2]/li[2]/a/span")
	WebElement lbl_componenetes;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/header/nav/div[2]/ul[2]/li[3]/a/span")
	WebElement lbl_Roles;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/header/nav/div[2]/ul[2]/li[4]/a/span")
	WebElement lbl_Usarios;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/header/nav/div[2]/ul[2]/li[5]/a/span")
	WebElement drpdwn_Procesos;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/header/nav/div[2]/ul[2]/li[6]/a")
	WebElement lbl_Reportes;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/header/nav/div[2]/ul[2]/li[7]/a/span")
	WebElement drpdwn_ShirleySolis;
	
	public WebElement getComponentes(){return lbl_componenetes;}
	public WebElement getUsers(){return lbl_Usarios;}
	
	public Boolean HubexLogo_visibility_check() {
		return HubexLogo.isDisplayed();
	}
	
	public Boolean lblDashboard_visibility_check() {
		return lbl_Dashboard.isDisplayed();
	}
	
	public Boolean lblComponente_visibility_check() {
		return lbl_componenetes.isDisplayed();
	}
	
	public Boolean lblRoles_visibility_check() {
		return lbl_Roles.isDisplayed();
	}
	
	public Boolean lblUsarios_visibility_check() {
		return lbl_Usarios.isDisplayed();
	}
	
	public Boolean drpdwnProcesos_visibility_check() {
		return drpdwn_Procesos.isDisplayed();
	}
	
	public Boolean lblReportes_visibility_check() {
		return lbl_Reportes.isDisplayed();
	}
	
	public Boolean drpdwnShirleySolis_visibility_check() {
		return drpdwn_ShirleySolis.isDisplayed();
	}
	
	public Boolean NavigationBar_elements_visibility_check() {
		return HubexLogo.isDisplayed();
	}
	
}
