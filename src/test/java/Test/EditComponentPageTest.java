package Test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ComponentsPage;
import Pages.DashboardPage;
import Pages.EditComponentPage;
import Pages.LoginPage;

public class EditComponentPageTest {
	
WebDriver driver = new ChromeDriver();
	
    
    @BeforeTest
    public void startBrowserTNG() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver.get("http://stage.hubex.tech/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        LoginPage Lp = PageFactory.initElements(driver, LoginPage.class);
        Lp.login_using_valid_info();
        DashboardPage Dp = PageFactory.initElements(driver, DashboardPage.class);
        Dp.NavigationBar_elements_visibility_check();
        Dp.getComponentes().click();
        ComponentsPage CP = PageFactory.initElements(driver, ComponentsPage.class);
        CP.edit_btn_click();
        
    }
    
    @Test
    public void check_editarPage() throws InterruptedException
    {
    	EditComponentPage ECP = PageFactory.initElements(driver, EditComponentPage.class);
    	assertEquals(ECP.EditarComponente_visibility(), true);
    	assertEquals(ECP.CrearComponente_visibility(), true);
    	assertEquals(ECP.breadcrum_EditarComponent(), "breadcrumb-item active");
    	assertEquals(ECP.lbl_name_visibility(), true);
    	assertEquals(ECP.lbl_deacription_visibility(), true);
    	assertEquals(ECP.lbl_organization_visibility(), true);
    	assertEquals(ECP.organizationField_visisbility(), true);

    	assertEquals(ECP.Edit_name(), "text");
    	assertEquals(ECP.Edit_description(), "text");
    	
    	ECP.submitBtn_click();
    	TimeUnit.SECONDS.sleep(3);
    	String edit_pageUrl = driver.getCurrentUrl();
    	assertEquals(edit_pageUrl, "http://stage.hubex.tech/dashboard/components");
    }
    
    
    @AfterTest
    public void tearDownTNG() {
    	driver.close();
        
    }
	
}
