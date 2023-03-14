package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
   Senaryo :
   https://chercher.tech/practice/frames sitesine gidiniz
   Ekranda gözüken ilk kutucuğa Türkiye yazınız.
   Daha sonra animals dan seçeneklerinden avatar ı seçiniz.
 */

public class _02_IFramelerGecis extends BaseDriver {

    @Test
    public void Test(){
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement input = driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys("Türkiye");

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement webSelect = driver.findElement(By.cssSelector("select[id='animals']"));
        Select ddMenu = new Select(webSelect);
        ddMenu.selectByVisibleText("Avatar");

        BekleKapat();
    }
}
