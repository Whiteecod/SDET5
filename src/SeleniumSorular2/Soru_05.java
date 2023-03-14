package SeleniumSorular2;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*
Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html](https://testpages.herokuapp.com/styled/index.html)
        Calculate'e tıklayınız.
        İlk input'a herhangi bir sayı giriniz.
        İkinci input'a herhangi bir sayı giriniz.
        Calculate button'una tıklayınız.
        Sonucu alınız.
        Sonucu yazdırınız.
 */

public class Soru_05 extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculate = driver.findElement(By.id("calculatetest"));
        calculate.click();

        WebElement number1 = driver.findElement(By.id("number1"));
        number1.sendKeys("20");

        WebElement number2 = driver.findElement(By.id("number2"));
        number2.sendKeys("40");

        WebElement calculateButton = driver.findElement(By.cssSelector("[class='styled-click-button']"));
        calculateButton.click();

        WebElement answer = driver.findElement(By.id("answer"));

        System.out.println("answer.getText() = " + answer.getText());

    }
}
