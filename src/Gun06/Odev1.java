package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev1 extends BaseDriver {
    // 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
    // 2- Business i çekleyin.
    // 3- discover XYZ ye tıklatın ve online Advertising i seçin
    // 4- Every day i seçin
    // 5- Good u seçin
    // 6- using XYZ yi tıklatın ve 3.seçeneği seçin
    // css selector

    @Test
    public void Test() {


        driver.get("https://formsmarts.com/form/yu?mode=h5");
        MyFunc.Bekle(2);
        WebElement business=driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        business.click();

        MyFunc.Bekle(2);
        WebElement advertising=driver.findElement(By.cssSelector("[aria-required='true'] > [value='Online Advertising']"));
        advertising.click();

        MyFunc.Bekle(2);
        WebElement every=driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        every.click();

        MyFunc.Bekle(2);
        WebElement good=driver.findElement(By.cssSelector("input[type='radio'][value='Good']"));
        good.click();

        MyFunc.Bekle(2);
        WebElement xyz=driver.findElement(By.cssSelector("select[id$='_4597'] > :nth-child(4)"));
        xyz.click();

        MyFunc.Bekle(2);
        good.click();



        BekleKapat();
    }
}
