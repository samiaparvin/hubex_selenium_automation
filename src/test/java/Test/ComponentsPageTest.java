package Test;



import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
//import org.junit.Test;

//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ComponentsPage;
import Pages.DashboardPage;
import Pages.LoginPage;

 


public class ComponentsPageTest {

WebDriver driver = new ChromeDriver();
	
    
    @BeforeTest
    public void startBrowserTNG() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("http://stage.hubex.tech/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        LoginPage Lp = PageFactory.initElements(driver, LoginPage.class);
        Lp.login_using_valid_info();
        DashboardPage Dp = PageFactory.initElements(driver, DashboardPage.class);
        Dp.getComponentes().click();
        
    }
 
    @Test
    public void check_Logo_and_All_labels_visibility()
    {
            
            ComponentsPage Cp = PageFactory.initElements(driver, ComponentsPage.class);
            assertEquals(Cp.Hubex_logo_visibility(), true);
            assertEquals(Cp.label_dashboard_visibility(), true);
            assertEquals(Cp.label_component_visibility(), true);
            assertEquals(Cp.label_roles_visibility(), true);
            assertEquals(Cp.label_usuarios_visibility(), true);
            assertEquals(Cp.label_procesos_visibility(), true);
            assertEquals(Cp.label_reportes_visibility(), true);
            assertEquals(Cp.label_profileName_visibility(), true);
            assertEquals(Cp.label_listaDeComponent_visibility(), true);
        
    }
    
    @Test
    public void check_breadCrun_ListaDeComponent() {
    	
    	ComponentsPage Cp = PageFactory.initElements(driver, ComponentsPage.class);
    	assertEquals(Cp.breadcrum_listDeComponents(), "breadcrumb-item active");
    	
	}
    
    @Test
    public void check_table_header_elements_visibility() {

        ComponentsPage Cp = PageFactory.initElements(driver, ComponentsPage.class);
        assertEquals(Cp.header_listaDeComponent_visibility(), true);
        assertEquals(Cp.label_name_visibility(), true);
        assertEquals(Cp.label_descrption_visibility(), true);
        assertEquals(Cp.label_createdBy_visibility(), true);
        assertEquals(Cp.label_createdAt_visibility(), true);
        assertEquals(Cp.label_option_visibility(), true);
        assertEquals(Cp.btn_create_component_visibility(), true);
    	
	}
    
    @Test
    public void check_editBtn_click() throws InterruptedException {
    	ComponentsPage Cp = PageFactory.initElements(driver, ComponentsPage.class);
    	Cp.edit_btn_click();
    	TimeUnit.SECONDS.sleep(3);
    	String compo_edit_pageUrl = driver.getCurrentUrl();
    	assertEquals(compo_edit_pageUrl, "http://stage.hubex.tech/dashboard/components/edit/30");
    	driver.navigate().back();
	}
    
    @Test
    public void check_CrearComponentes_click() throws InterruptedException {
    	ComponentsPage Cp = PageFactory.initElements(driver, ComponentsPage.class);
    	Cp.crearComponentes_click();
    	TimeUnit.SECONDS.sleep(3);
    	String compo_crear_pageUrl = driver.getCurrentUrl();
    	assertEquals(compo_crear_pageUrl, "http://stage.hubex.tech/dashboard/components/create");
    	driver.navigate().back();
	}
    
    @Test
    public void delete_btn_action_check() throws InterruptedException {
    	ComponentsPage Cp = PageFactory.initElements(driver, ComponentsPage.class);
    	Cp.click_btn_delete();
    	TimeUnit.SECONDS.sleep(8);
    	
    	assertEquals(Cp.delBtn_alertMssg_visibility(), true);
    	assertEquals(Cp.delBtn_alert_yesBtn_visibility(), true);
    	assertEquals(Cp.delBtn_alert_cancleBtn_visibility(), true);

    	TimeUnit.SECONDS.sleep(1);
    	Cp.delBtn_alert_cancleBtn_click();
	}
    
    
    @AfterTest
    public void tearDownTNG() {
    	driver.close();
        
    }
	
}
