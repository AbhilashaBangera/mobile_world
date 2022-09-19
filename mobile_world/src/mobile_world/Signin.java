package mobile_world;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {

		
			
			  WebDriver driver;
			    
			    public void LandingPage(WebDriver driver)
			    {
			        this.driver=driver;
			        PageFactory.initElements(driver,this);
			    }
			    
			    
				@FindBy(xpath="//input[@id='username']")
				WebElement username;
				@FindBy(xpath="//input[@id='password']")
				WebElement password;
				@FindBy(xpath="//a[.='Log In']")
				WebElement button;

				public void goTo()
			    {
			        driver.get("https://mobileworld.azurewebsites.net/");
			    }
				
				 public void signinapplication(String name,String pwd)
				    {
				      
				        username.sendKeys("Abhilasha");
				        password.sendKeys("Abhilassha");
				        button.click();
				    }
		}
}
