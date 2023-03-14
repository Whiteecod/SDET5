package SeleniumSorular2;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html](https://testpages.herokuapp.com/styled/index.html)
        Search'e tıklayınız.
        Başlığı yazdırınız.
        Search button'una tıklayınız.
        URL'i yazdırınız.

 */
public class Soru_04 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement search = driver.findElement(By.id("searchtest"));
        search.click();

        WebElement text = driver.findElement(By.xpath("//*[text()='The \"Selenium Simplified\" Search Engine']"));

        System.out.println("text = " + text.getText());

        WebElement submitSearch = driver.findElement(By.xpath("//input[@type='submit']"));
        submitSearch.click();

        System.out.println(driver.getCurrentUrl());
    }
}
