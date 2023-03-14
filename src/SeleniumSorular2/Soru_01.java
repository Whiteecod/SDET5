package SeleniumSorular2;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*
Bu web sitesine gidin   [https://testpages.herokuapp.com/styled/index.html]
        Alerts e tıklayınız
        URL'i yazdırınız.

 */

public class Soru_01 extends BaseDriver {
    @Test
    public void test1() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement aletrs = driver.findElement(By.cssSelector("a[id='alerts']"));
        aletrs.click();

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
    }
}
