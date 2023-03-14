package Gun14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class _01_EkranKaydet extends BaseDriver {
    @Test
    public void Test1() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("İsmet");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("12345");

        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        // hata var ise çıkan element
        List<WebElement> hataMesaji = driver.findElements(By.cssSelector("div[role='alert']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        if (hataMesaji.size() > 0) { // hata var ise eğer burada ekran kaydı işlemi gerçekleştireceğiz
            System.out.println("Hata oluştu");

            TakesScreenshot ts= (TakesScreenshot) driver; // 1. Aşama ekran görüntüsü alma değişkeni tanımladım.
            File hafizadakiHali=ts.getScreenshotAs(OutputType.FILE); // 2. Aşama ekran görüntüsü alındı.
            // hafızadaki bu bilgiyi dosya olarak kaydet.
            // Now you can do whatever you need to do with it, for example copy somewhere
            FileUtils.copyFile(hafizadakiHali, new File("EkranGoruntuleri\\screenshot.png"));
        }
        // TODO : burada her hata da aynı dosyayı yeniliyor ve üzerine yazıyor.
        // biz istiyoruz ki her dosya ayrı olsun yani her kayıt ayrı olsun
        // bunu nasıl yaparsınız
        // LocalDateTime alıcaksın bilgileri
        // YılAyGunSaatDakikaSan -> 2022_10_07_1319_20.png

        MyFunc.Bekle(2);
        BekleKapat();
    }
}
