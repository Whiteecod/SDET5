package SeleniumSorular2;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
Bu siteye gidiniz.  https://testpages.herokuapp.com/styled/index.html
        Fake Alerts'e tıklayınız.
        Show modal dialog buttonuna tıklayınız.
        Ok'a tıklayınız.
        Alert kapanmalıdır.

 */
public class Soru_07 extends BaseDriver {
    @Test
            public void test1() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlerts = driver.findElement(By.id("fakealerttest"));
        fakeAlerts.click();

        WebElement showModalDialog = driver.findElement(By.id("modaldialog"));
        showModalDialog.click();

        WebElement modalButton = driver.findElement(By.id("dialog-ok"));
        modalButton.click();
    }
}
