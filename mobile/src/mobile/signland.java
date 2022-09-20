package mobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class signland {
        
        WebDriver driver;
        public signland(WebDriver driver)
        {
            this.driver=driver;
            PageFactory.initElements(driver, this);
        }    
        
        @FindBy(xpath="//button[.='SIGN IN']")
        WebElement signin;
        @FindBy(xpath="//input[@id='username']")
        WebElement username;
        @FindBy(xpath="//input[@id='password']")
        WebElement password;
        @FindBy(xpath="//a[.='Log In']")
        WebElement logbutton;
        
        public void goTo()
        {
            driver.get("https://mobileworld.banyanpro.com/");
        }
        public WebElement signin()
        {
            return signin;
        }
        public WebElement username()
        {
            return username;
        }
        public  WebElement password()
        {
            return password;
        }
        public WebElement button()
        {
            return logbutton;
        }





  }



 