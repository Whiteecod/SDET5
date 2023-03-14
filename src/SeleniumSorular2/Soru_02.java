package SeleniumSorular2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*
Bu web sitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html](https://testpages.herokuapp.com/styled/index.html)
        Alerts'e tıklayınız.
        URL'i yazdırınız.
        Geri gidin.
        URL'i yazıdırnız.
        Basic Ajax'a tıklayınız.
        URL'i yazdırınız.
 */

public class Soru_02 extends BaseDriver {
    @Test
    public void test1() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement aletrs = driver.findElement(By.cssSelector("a[id='alerts']"));
        aletrs.click();

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.navigate().back();

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        MyFunc.Bekle(3);

        WebElement basicAjax = driver.findElement(By.cssSelector("a[id='basicajax']"));
        basicAjax.click();

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

       BekleKapat();
    }
}
