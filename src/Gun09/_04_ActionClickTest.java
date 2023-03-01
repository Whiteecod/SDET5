package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class _04_ActionClickTest extends BaseDriver {

    @Test
    public void test1() {

        driver.get("https://demoqa.com/buttons");
        WebElement element=driver.findElement(By.xpath("//button[text()='Click Me']"));
        // element.click();

        Actions aksiyonlar=new Actions(driver); // web sayfası aksiyonları açıldı.

        Action aksiyon=aksiyonlar.moveToElement(element).click().build();
        // elementin üzerine click için git orda bekle.aksiyonu hazırla.
        System.out.println("Aksiyon hazırlandı");

        MyFunc.Bekle(2);
        aksiyon.perform(); // aksiyonu gerçekleştir, işleme al, uygula
        System.out.println("Aksiyon gerçekleştir");

        BekleKapat();
    }
}
