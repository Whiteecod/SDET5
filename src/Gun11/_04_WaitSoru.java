package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */

public class _04_WaitSoru extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://www.demoblaze.com/index.html");

        WebElement samsung = driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
        samsung.click();

        WebElement addToCart = driver.findElement(By.xpath("//a[@onclick='addToCart(1)']"));
        addToCart.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent()); // Alert çıkana kadar bekle

        driver.switchTo().alert().accept();

        WebElement anaSayfa = driver.findElement(By.id("nava"));
        anaSayfa.click();



    }
}
