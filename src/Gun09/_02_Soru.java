package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class _02_Soru extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.facebook.com/");

        MyFunc.Bekle(2);
        List<WebElement> cookiesAccept=driver.findElements(By.xpath("//button[text()='Allow essential and optional cookies']"));
        if (cookiesAccept.size() > 0)
            cookiesAccept.get(0).click();

        MyFunc.Bekle(2);
        WebElement newAccount=driver.findElement(By.linkText("Yeni hesap oluştur"));
        newAccount.click();

        MyFunc.Bekle(2);
        WebElement name=driver.findElement(By.name("firstname"));
        name.sendKeys("kubilay");

        MyFunc.Bekle(2);
        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("culha");

        MyFunc.Bekle(2);
        WebElement reEmail=driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(reEmail.isDisplayed()); // beklenen görünmemesi için görünmediğinden zaten false olacaktır.
        // reEmail.isDisplayed(); // -> false verecektir.
        System.out.println("reEmail = " + reEmail.isDisplayed());

        MyFunc.Bekle(2);
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("kubilayculha@hotmail.com");

        MyFunc.Bekle(2);
        Assert.assertTrue(reEmail.isDisplayed()); // burada ise beklenenin görünmesi
        System.out.println("reEmail.isDisplayed() = " + reEmail.isDisplayed());

        MyFunc.Bekle(1);
        WebElement webDay=driver.findElement(By.id("day"));
        Select day= new Select(webDay);
        day.selectByVisibleText("21");

        MyFunc.Bekle(1);
        WebElement webMonth=driver.findElement(By.id("month"));
        Select month= new Select(webMonth);
        month.selectByValue("2");

        MyFunc.Bekle(1);
        WebElement webYear=driver.findElement(By.id("year"));
        Select year= new Select(webYear);
        year.selectByVisibleText("1974");


        BekleKapat();
    }
}
