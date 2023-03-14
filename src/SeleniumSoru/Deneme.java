package SeleniumSoru;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Deneme extends BaseDriver {
    @Test
    public void test1(){
        // YouTube ana sayfasına git
        driver.get("https://www.youtube.com/");

        // YouTube arama kutusuna "Selenium" yazın ve Enter tuşuna basın
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("Selenium");
        searchBox.sendKeys(Keys.RETURN);

        // "Filtre" düğmesine tıkla
        WebElement filterButton = driver.findElement(By.xpath("//*[@id=container]/ytd-toggle-button-renderer/a"));
        filterButton.click();

        // "Uzunluk" seçeneklerinden "20 dakika" seçeneğini seçin
        WebElement lengthFilter = driver.findElement(By.xpath("//*[@id=container]/ytd-menu-renderer/yt-multi-page-menu-renderer[1]/div[2]/yt-multi-page-menu-section-renderer[1]/div[2]/ytd-toggle-button-renderer[3]/a"));
        lengthFilter.click();

        // Sayfa yüklenene kadar bekleyin
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Sayfanın altına kaydırın ve videoları yükle
        for (int i = 0; i < 2; i++) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.documentElement.scrollHeight);");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

        // Son videonun başlığını alın
        WebElement lastVideoTitle = driver.findElements(By.xpath("//*[@id=\"video-title\"]"))
                .get(driver.findElements(By.xpath("//*[@id=\"video-title\"]")).size() - 1);
        String lastVideoTitleText = lastVideoTitle.getAttribute("title");
        System.out.println("Son video başlığı: " + lastVideoTitleText);

        // "Selenium" kelimesinin başlıkta olduğunu doğrulayın
        assert lastVideoTitleText.contains("Selenium");

        // Tarayıcıyı kapat
        BekleKapat();
    }
}


