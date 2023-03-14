package SeleniumSorular2;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
Bu web sitesine gidiniz. http://demo.seleniumeasy.com/basic-checkbox-demo.html
        check all button'a tıklayınız.
        Uncheck All button'da " Uncheck All" yazısını yazdırınız.

 */
public class Soru_10 extends BaseDriver {
    @Test
    public void test() {
        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");

        WebElement checkAll = driver.findElement(By.id("check1"));
        checkAll.click();

        Assert.assertTrue(checkAll.getAttribute("value").contains("Uncheck All"));
        System.out.println("checkAll.getAttribute(\"value\") = " + checkAll.getAttribute("value"));

    }
}
