package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
    //Locate_elements_in_login_page
	@FindBy(how = How.XPATH, using = "/html/body/section/div/div/form[1]/a/img")
	WebElement hubex_logo;
	
	@FindBy(how = How.ID, using = "to-recover")
	WebElement forgot_pass_section;
	
    @FindBy(how = How.ID, using = "email")
    WebElement txtbox_email;

    @FindBy(how = How.ID, using = "pass")
    WebElement txtbox_password;

    @FindBy(how = How.ID, using = "sent")
    WebElement btn_login;
    
    @FindBy(how = How.ID, using = "error")
    WebElement error_mssg;
    
    public WebElement getError_Mssg(){return error_mssg;}
    
    public void login_using_valid_info()
    {
        txtbox_email.sendKeys("info@hubex.tech");
        txtbox_password.sendKeys("admin");
        btn_login.click();
    }

    public void login_using_Invalid_info()
    {
        txtbox_email.sendKeys("info@");
        txtbox_password.sendKeys("ad");
        btn_login.click();
    }
    
    public void maxLength_for_emailTxtbox() 
    {	
		String maxLengthDefined = txtbox_email.getAttribute("maxlength");
		 
		if (maxLengthDefined == null) {
			System.out.println("No limit is set for email textbox.");
		}
	}
    
    public void maxLength_for_passTxtbox() 
    {	
		String maxLengthDefined = txtbox_password.getAttribute("maxlength");
		 
		if (maxLengthDefined == null) {
			System.out.println("No limit is set password textbox.");
		}
	}
    
    public Boolean logo_visibility_check()
    {
    	return hubex_logo.isDisplayed();
    }
    
    public Boolean forgot_pass_visibility_check()
    {
    	return forgot_pass_section.isDisplayed();
    }
    
    public Boolean emailTxtbox_visibility_check()
    {
    	return txtbox_email.isDisplayed();
    }
    
    public Boolean passwordTxtbox_visibility_check()
    {
    	return txtbox_password.isDisplayed();
    }
    
    public Boolean btnLogin_visibility_check()
    {
    	return btn_login.isDisplayed();
    }
    
}
