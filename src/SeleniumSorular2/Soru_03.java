package SeleniumSorular2;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.AbstractList;
/*
Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html](https://testpages.herokuapp.com/styled/index.html)
        [Find By Playground'a tıklayınız.](https://testpages.herokuapp.com/find_by_playground.php)
        5. text'i bulunuz.
 */

public class Soru_03 extends BaseDriver {
    @Test
    public void test1() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement findByPlayground = driver.findElement(By.xpath("//*[text()='Find By Playground']"));
        findByPlayground.click();


    }
}
