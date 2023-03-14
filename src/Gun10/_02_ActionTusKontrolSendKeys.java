package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demoqa.com/auto-complete");

        WebElement element=driver.findElement(By.id("autoCompleteSingleInput"));
        // element.sendKeys("Ahmet")
        // Shift a shift i bıraktım hmet -> Ahmet yazmak için

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar
                .moveToElement(element) // kutucuğa gel
                        .click()             // içine tıklat
                              .keyDown(Keys.SHIFT) // shift e bas
                                        .sendKeys("a")   // shift+a - > A yaz
                                                 .keyUp(Keys.SHIFT)  // Shift i bırak
                                                        .build();     // aksiyonu inşa et
        // Aksiyon hazırlandı
        MyFunc.Bekle(2);
        aksiyon.perform(); // burada ise gerçekleştirdi.


        BekleKapat();
    }
}
