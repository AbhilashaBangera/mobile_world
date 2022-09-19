package mobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;





public class signup {
    @Test(dataProvider="login") //SIGNUP
     public void sign(String Firstname,String Lastname,String Email,String password,String date,String phonenumber) throws Exception
     {
         System.setProperty("webdriver.chrome.driver","C:\\Users\\abhilasha.bangera\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        signupland page = new signupland(driver);
        page.goTo();
        
        page.signin().click();
        Thread.sleep(1000);
        page.signup().click();
        Thread.sleep(1000);
        page.FirstName().sendKeys(Firstname);
        Thread.sleep(1000);
        page.LastName().sendKeys(Lastname);
        Thread.sleep(1000);
        page.Email().sendKeys(Email);
        Thread.sleep(1000);
        page.Password().sendKeys(password);
        Thread.sleep(1000);
        page.date().sendKeys(date);
        Thread.sleep(1000);
        page.gender().click();
        Thread.sleep(1000);
        page.phonenumber().sendKeys(phonenumber);
        Thread.sleep(1000);
        page.register().click();
        Thread.sleep(1000);
        driver.close();
     }
     @DataProvider(name="login")
        public Object[][] getdata()
        {
            Object [][] data=new Object[5][6];
            data [0][0]="ab";
            data [0][1]="ab";
            data [0][2]="abhi";
            data [0][3]="e3";
            data [0][4]="12/03/2000";
            data [0][5]="6361851163";
            
            data [1][0]="Abhilasha";
            data [1][1]="Bangera";
            data [1][2]="abhi@123";
            data [1][3]="4r4r4r44";
            data [1][4]="11/03/1997";
            data [1][5]="jciejejjjc";
            
            data [2][0]="Abhilashajoijiojiojjiojjioj";
            data [2][1]="Bangerahikijiiiojoiihij";
            data [2][2]="abhi@123";
            data [2][3]="4r4r4r6y6y6y6y6y6y78ui89";
            data [2][4]="nmjhiokm";
            data [2][5]="7897";
            
            data [3][0]="67890";
            data [3][1]="56789";
            data [3][2]="abhi@123";
            data [3][3]="44444444";
            data [3][4]="11/03/1997";
            data [3][5]="6361851163";
            
            data [4][0]="$%^&$%#$%";
            data [4][1]="#^$#&&Z%#";
            data [4][2]="abhi@123";
            data [4][3]="yhuthuyjikh";
            data [4][4]="11/03/1997";
            data [4][5]="6361851163";
            
            
            
            
        return data;
    
    
}
}