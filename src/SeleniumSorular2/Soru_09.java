package SeleniumSorular2;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
/*
Bu web sitesine gidiniz. http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html
        Normal success message'a tıklayınız.
        Açılan penceredeki x buttonuna tıklayınız.
        Mesaj görünmemelidir.
 */
public class Soru_09 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html");

        WebElement normalSuccessMessage = driver.findElement(By.id("normal-btn-success"));
        normalSuccessMessage.click();

        WebElement closeButton = driver.findElement(By.cssSelector("button[type='button'][class='close']"));
        closeButton.click();

        WebElement messageDisplayed = driver.findElement(By.cssSelector("div[class='alert alert-success alert-normal-success']"));

        Assert.assertTrue(messageDisplayed.isEnabled(), " Mesaj gözüktü");
    }
}
