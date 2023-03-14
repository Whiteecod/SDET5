package Gun11;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_FillingFormTask extends BaseDriver {
    /*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
 */

    @Test
    public void Test1(){

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name= driver.findElement(By.id("title"));
        name.sendKeys("ismet");

        WebElement comment=driver.findElement(By.id("description"));
        comment.sendKeys("İsmet hoca soru sordu");

        WebElement submit=driver.findElement(By.id("btn-submit"));
        submit.click();

        WebDriverWait bekle=new WebDriverWait(driver, Duration.ofSeconds(30));
        bekle.until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submited Successfully!"));

        WebElement mesaj=driver.findElement(By.id("submit-control"));
        Assert.assertEquals("Form submited Successfully!" , mesaj.getText());
    }
}
