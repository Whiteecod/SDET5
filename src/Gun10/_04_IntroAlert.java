package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
   Interview soruları
   Alertleri nasıl kullanırsın ?
   driver.switchTo().alert() -> alerte geçerim
   komutları:
   1- Accept : OK, TAMAM butonuna basmamız
   2- dismiss : CANCEL, HAYIR,
 */

public class _04_IntroAlert extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        clickMe1.click();

        MyFunc.Bekle(2);
        // alert açılıyor.
        driver.switchTo().alert().accept(); // alert kutusu OK a bas


        BekleKapat();
    }
}
