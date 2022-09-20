package mobile;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;







public class orderland {
        
        WebDriver driver;
        public orderland(WebDriver driver)
        {
            this.driver=driver;
            PageFactory.initElements(driver, this);
        }
        @FindBy(xpath="/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]")
        WebElement support;
        @FindBy(css="a[href='order.html']")
        WebElement odr;
        @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
        WebElement Fname;
        @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(2)")
        WebElement Lastname;
        @FindBy(xpath="//input[@id='inputEmail']")
        WebElement email;
        @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/input[1]")
        WebElement password1;
        @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[3]/input[1]")
        WebElement Gen;
        @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[4]/input[1]")
        WebElement Num;
        @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")
        WebElement Add1;
        @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[2]/input[1]")
        WebElement Add2;
        @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/input[1]")
        WebElement City;
        @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[2]/select[1]")
        WebElement Choose;
        @FindBy(xpath="//*[@id=\"inputState\"]/option[3]")
        WebElement State;
        @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[3]/input[1]")
        WebElement Zip;
        @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
        WebElement choosebrand;
        @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/label[1]")
        WebElement brand;
        @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[1]/div[3]/div[1]/div[1]/select[1]/option[2]")
        WebElement model;
        @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[6]/div[2]/input[1]")
        WebElement Count;
        @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[7]/div[2]/div[1]/select[1]")
        WebElement opt;
        @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[7]/div[2]/div[2]/input[1]")
        WebElement numoftimes;
        @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[8]/div[2]/input[1]")
        WebElement check1;
        @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[9]/div[2]/input[1]")
        WebElement check2;
        @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button[1]")
        WebElement order;
 
        
        public void goTo()
        {
            driver.get("https://mobileworld.banyanpro.com/");
        }
       
        public WebElement support()
        {
            return support;
        }
        public WebElement odr()
        {
        return odr;
        }
        public WebElement Fname()
        {
            return Fname;
        }
        public WebElement Lastname()
        {
            return Lastname;
        }
        public WebElement email()
        {
            return email;
        }
        public WebElement password1()
        {
            return password1;
        }
        public WebElement Gen()
        {
            return Gen;
        }
        public WebElement Num()
        {
            return Num;
        }
        public WebElement Add1()
        {
            return Add1;
            
        }
        public WebElement Add2()
        {
            return Add2;
        }
        public WebElement City()
        {
            return City;
        }
      
        public WebElement Choose()
        {
            return Choose;
        }
        public WebElement State()
        {
            return State;
            
        }
        public WebElement Zip()
        {
            return Zip;
        }
        public WebElement choosebrand()
        {
            return choosebrand;
        }
        public WebElement brand()
        {
            return brand;
        }
        public WebElement model()
        {
            return model;
        }
       
        public WebElement Count()
        {
            return Count;
        }
       
        public WebElement opt()
        {
            return opt;
            
        }
        public WebElement  numoftimes()
        {
            return  numoftimes;
            
        }
        public WebElement check1()
        {
            return check1;
        }
       
        public WebElement check2()
        {
            return check2;
            
        }
        public WebElement order ()
        {
            return order;
            
        }
       

		

		
		}

		
        
