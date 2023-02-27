package Gun06;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert;

public class _01_CssSelector_2 extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String mesajim = "merhaba selenium";
        WebElement txtBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        txtBox.sendKeys(mesajim);

        WebElement btn = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

        WebElement msg = driver.findElement(By.cssSelector("[id='display']"));

        Assert.assertTrue("Aranılan mesaj bulunamadı", msg.getText().equals(mesajim)); // verilen değeri TRUE mu ?
        // Hata yok ise yani içindeki değer TRUE ise hiç bilgi vermez.
        // false ise eğer hata verir

        // main i kaldırdığımız da ise public void test1 yazdık ve üstüne sen bir artık
        // testsin dedik ve çalışma durumu başarılı olunca test passed diyor.
        // hatalı olduğunda ise Tests Failed diyor ve failed test sayısını söylüyor.

        BekleKapat();
    }
}
