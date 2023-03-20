package SeleniumSorular2;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
Bu web sitesine gidiniz. [http://demo.seleniumeasy.com/basic-first-form-demo.html](http://demo.seleniumeasy.com/basic-first-form-demo.html)
        "Enter a" ya bir değer giriniz.
        "Enter b" ye bir değer giriniz.
        Get Total'a basınız.
        Web sitesindeki sonucu yazdırınız.

 */
public class Soru_15 extends BaseDriver {
    @Test
    public void test1() {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement enterA = driver.findElement(By.cssSelector("input[id='sum1']"));
        enterA.sendKeys("23");

        WebElement enterB = driver.findElement(By.cssSelector("input[id='sum2']"));
        enterB.sendKeys("25");

        WebElement getTotal = driver.findElement(By.cssSelector("button[onclick='return total()']"));
        getTotal.click();

        WebElement totalValue = driver.findElement(By.id("displayvalue"));
        System.out.println("totalValue.getText() = " + totalValue.getText());
    }
}
