package mobile;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;





public class order {
   @Test(dataProvider="order") //SIGNUP
   
     public void order(String Firstname,String Lastname,String Email,String password,String number,String address1,String address2,String city,String zip,String count) throws Exception
     {
         System.setProperty("webdriver.chrome.driver","C:\\Users\\abhilasha.bangera\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        orderland page = new orderland(driver);
        page.goTo();
        
        page.support.click();
        Thread.sleep(1000);
        page.odr.click();
        Set windows = driver.getWindowHandles();
        Iterator it = windows.iterator();
        String parentId = (String) it.next();
        String childId = (String) it.next();
        driver.switchTo().window(childId);
        
        
        page.Fname.sendKeys(Firstname);
        Thread.sleep(1000);
        page.Lastname.sendKeys(Lastname);
        Thread.sleep(1000);
        page.email.sendKeys(Email);
        Thread.sleep(1000);
        page.password1.sendKeys(password);
        Thread.sleep(1000);
        page.Gen.click();
        Thread.sleep(1000);
        page.Num.sendKeys(number);
        Thread.sleep(1000);
        page.Add1.sendKeys(address1);
        Thread.sleep(1000);
        page.Add2.sendKeys(address2);
        Thread.sleep(1000);
        page.City.sendKeys(city);
        Thread.sleep(1000);
        page.Choose.click();
        Thread.sleep(1000);
        page.State.click();
        Thread.sleep(1000);
        page.Zip.sendKeys(zip);
        Thread.sleep(1000);
        page.choosebrand.click();
        Thread.sleep(1000);
        page.brand.click();
        Thread.sleep(1000);
        page.model.click();
        Thread.sleep(1000);
        page.Count.sendKeys(count);
        Thread.sleep(1000);
        page.opt.click();
        Thread.sleep(1000);
        page.check1.click();
        Thread.sleep(1000);
        page.check2.click();
        Thread.sleep(1000);
        page.order.click();
        Thread.sleep(1000);
        driver.close();
     }
     @DataProvider(name="order")
        public Object[][] getdata()
        {
            Object [][] data=new Object[3][10];
            data [0][0]="ab";
            data [0][1]="ab";
            data [0][2]="abhi@gmail.com";
            data [0][3]="e3";
            data [0][4]="6361851163";
            data [0][5]="ab";
            data [0][6]="ab";
            data [0][7]="ba";
            data [0][8]="12";
            data [0][9]="1";
           
            
            data [1][0]="abhilasha";
            data [1][1]="bangera";
            data [1][2]="abhi";
            data [1][3]="e3456dgyugu";
            data [1][4]="6361851163";
            data [1][5]="Peddamastrret";
            data [1][6]="Subbayanpalya";
            data [1][7]="Bangalore";
            data [1][8]="567895678";
            data [1][9]="2";
           
            data [2][0]="abhilashagdiuhewiuhdiew";
            data [2][1]="bangerabvkhubjbcjfsjfh";
            data [2][2]="abhi@gmail.com";
            data [2][3]="e3478487uihcdui3787382";
            data [2][4]="abhilas";
            data [2][5]="Peddamastrrebangaloreman";
            data [2][6]="Subbayanpalyamangalorefhm";
            data [2][7]="123456";
            data [2][8]="abhila";
            data [2][9]="2";
           
            
          
            
            
            
            
        return data;
    
    
}
}