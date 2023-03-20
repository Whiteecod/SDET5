package SeleniumSorular2;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
Bu web sitesine gidiniz.  [http://demo.seleniumeasy.com/basic-first-form-demo.html](http://demo.seleniumeasy.com/basic-first-form-demo.html)
        Mesajınızı giriniz.
        Show message'a tıklayınız.
        Show message button'unun altında mesajınızı yazdırınız.

 */
public class Soru_14 extends BaseDriver {

    @Test
    void Test1() {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement inputMessage = driver.findElement(By.id("user-message"));
        inputMessage.sendKeys("Hello World");

        WebElement showMessage = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        showMessage.click();

        WebElement yourMessage = driver.findElement(By.id("display"));
        yourMessage.isDisplayed();

        Assert.assertEquals(yourMessage.getText() , "Hello World" , "Bulunmadi");

    }
}
