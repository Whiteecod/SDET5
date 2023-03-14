package SeleniumSorular2;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
Bu web sitesine gidiniz. http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html
        Normal success message'a tıklayınız.
        Açılan yeşil penceredeki x buttonuna tıklayınız

 */
public class Soru_08 extends BaseDriver {
    @Test
    public void test1() {
        driver.get("http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html");

        WebElement normalSuccessMessage = driver.findElement(By.id("normal-btn-success"));
        normalSuccessMessage.click();

        WebElement messageDisplayed = driver.findElement(By.cssSelector("div[class='alert alert-success alert-normal-success']"));
        messageDisplayed.isDisplayed();
        WebElement closeButton = driver.findElement(By.cssSelector("button[type='button'][class='close']"));
        closeButton.click();




    }
}
