package mobile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;





public class signin {
    
    @Test(dataProvider="login")//LOGIN
    public void sign(String username,String Password) throws Exception
    {
    
        System.setProperty("webdriver.chrome.driver","C:\\Users\\abhilasha.bangera\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
             
            signland page=new signland(driver);
            page.goTo();
           // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            page.signin().click();
            Thread.sleep(2000);
            page.username().sendKeys(username);
            Thread.sleep(2000);
            page.password().sendKeys(Password);
            Thread.sleep(2000);
            page.button().click();
            driver.close();
        }
    @DataProvider(name="login")
    public Object[][] getdata()
    {
        Object [][] data=new Object[5][2];
      data [0][0]="Ab";
      data [0][1]="A4";
      data [1][0]="Abhilasgahabnshdhukxhudhuiudsy";
      data [1][1]="jsdbcwccjsj3766253725362565263";
      data [2][0]="Abhilasha";
      data [2][1]="shty9880";
      data [3][0]="Abhilasha";
      data [3][1]="456789990";
      data [4][0]="Abhilasha";
      data [4][1]="Abhilasha";



     return data;
        
    }





}



