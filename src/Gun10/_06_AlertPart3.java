package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AlertPart3 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe1 = driver.findElement(By.xpath("//button[@onclick='myPrommptFunction()']"));
        clickMe1.click();

        MyFunc.Bekle(2);
        // alert açılıyor.
        driver.switchTo().alert().sendKeys("kubilay"); // alert kutusu OK a bas
        driver.switchTo().alert().accept();

        MyFunc.Bekle(2);
        WebElement txtActual=driver.findElement(By.id("prompt-demo"));

        Assert.assertTrue("Beklenen yazi gözüktü mü" , txtActual.getText().contains("ismet"));


        BekleKapat();
    }
}
