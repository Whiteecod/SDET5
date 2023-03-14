package SeleniumSorular2;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
/*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/basic-first-form-demo.html
        Input forms'a tıklayınız.
        Ajax from Submit'e tıklayınız.
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        Yazıyı yazdırınız.
 */

public class Soru_12 extends BaseDriver {
    @Test
    public void test() {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        //Actions aksiyonlar = new Actions(driver);
        WebElement inputForms = driver.findElement(By.xpath("//*[text()='Input Forms']"));
        inputForms.click();

        WebElement ajaxFrom = driver.findElement(By.linkText("Ajax Form Submit"));
        ajaxFrom.click();

        WebElement nameTitle = driver.findElement(By.id("title"));
        nameTitle.sendKeys("Kubilay");

        WebElement comment = driver.findElement(By.id("description"));
        comment.sendKeys("TechnoStudy Selenium - Testng");

        WebElement submit = driver.findElement(By.id("btn-submit"));
        submit.click();

        WebElement successfully = driver.findElement(By.xpath("//*[text()='Form submited Successfully!']"));

        Assert.assertTrue(successfully.isDisplayed(), " Bulunmadı");
        System.out.println("successfully.getText() = " + successfully.getText());
        }
}
