package mobile;


import java.util.Iterator;
import java.util.Set;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class orderland1 {
    WebDriver driver;
    public orderland1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]")
WebElement support;
@FindBy(css="a[href='order.html']")
WebElement odr;
@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
WebElement Fname;
@FindBy(xpath="//body/div[@class='container']/div[@class='card']/div[@class='card-body']/form[@id='myForm']/div[1]/div[1]/input[1]")
WebElement Lname;
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

    public void ordername(String firstname, String lastname,String mail, String pswd1, String mobnum, String add1, String add2, String city, String zip, String count, String times) {
    support.click();
    odr.click();
    Set windows = driver.getWindowHandles();
    Iterator it = windows.iterator();
    String parentId = (String) it.next();
    String childId = (String) it.next();
    driver.switchTo().window(childId);
    
    
    Fname.sendKeys(firstname);
    Lname.sendKeys(lastname);
    email.sendKeys(mail);
    password1.sendKeys(pswd1);
    Gen.click();
    Num.sendKeys(mobnum);
    Add1.sendKeys(add1);
    Add2.sendKeys(add2);
    City.sendKeys(city);
    Choose.click();
    State.click();
    Zip.sendKeys(zip);
    choosebrand.click();
    brand.click();
    model.click();
    Count.sendKeys(count);
    opt.click();
    numoftimes.sendKeys(times);
    check1.click();
    check2.click();
    order.click();
    driver.close();
}
}