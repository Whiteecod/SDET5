package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);

        WebElement element=driver.findElement(By.id("alerttest"));
//        WebElement element2=driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();
        MyFunc.Bekle(2);

        System.out.println(driver.getCurrentUrl()); // o anda bulunduğu URL'yi verir

        driver.navigate().back(); // tarayıcı history sinden geri geldim
        MyFunc.Bekle(2);

        System.out.println(driver.getCurrentUrl()); // o anda bulunduğu URL'yi verir

        driver.navigate().forward(); // tarayıcı historyde ileri gittim
        MyFunc.Bekle(2);

        System.out.println(driver.getCurrentUrl()); // o anda bulunduğu URL'yi verir

        BekleKapat(); // gapattım
    }
}
