package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_YonTuslariSecim extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://demoqa.com/auto-complete");

        WebElement txtBox = driver.findElement(By.id("autoCompleteSingleInput"));
        Actions aksiyonlar = new Actions(driver);
        // elemente git, içine tıklat, b tuşuna bas
        Action aksiyon = aksiyonlar
                .moveToElement(txtBox)
                .click()
                .sendKeys("b")
                .build();
        aksiyon.perform();
        MyFunc.Bekle(2);

        aksiyon = aksiyonlar
                .sendKeys(Keys.DOWN)
                        .sendKeys(Keys.ENTER)
                                .build();
        aksiyon.perform();


                BekleKapat();
    }
}
