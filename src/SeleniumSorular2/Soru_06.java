package SeleniumSorular2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html](https://testpages.herokuapp.com/styled/index.html)
        Fake Alerts' tıklayınız.
        Show Alert Box'a tıklayınız.
        Ok'a tıklayınız.
        Alert kapanmalıdır.

 */
public class Soru_06 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlerts = driver.findElement(By.id("fakealerttest"));
        fakeAlerts.click();

        WebElement showAlertBox = driver.findElement(By.id("fakealert"));
        showAlertBox.click();

        WebElement alertsButton = driver.findElement(By.id("dialog-ok"));
        alertsButton.click();
    }
}
