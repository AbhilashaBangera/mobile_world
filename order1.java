package mobile;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class order1 {
    @Test
    public void orderMethod(){
        // TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver","C:\\Users\\abhilasha.bangera\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get(" https://mobileworld.banyanpro.com/");
           orderland1 lp = new orderland1(driver);
           
           lp.ordername("Abhilasha","Bangera","abhi@gmail.com", "abhi123", "123456789","Sridurgakripa", "Mangalore","Bangalore", "5436267346", "1", "0");
         



   }
}

