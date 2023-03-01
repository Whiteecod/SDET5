package Gun08;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClassGiris extends BaseDriver {

    @Test
    public void Test1(){

        driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.com/");
        driver.manage().deleteAllCookies(); 

        WebElement webMenu = driver.findElement(By.id("searchDropdownBox"));

        // bu element select tag i ile başlıyor ise sen bunu SELECT e cast yap ve öyle kullan.

        Select ddMenu=new Select(webMenu); // elementi daha rahat kullanabilir SELECT nesnesi haline dönüştürdü.
        ddMenu.selectByIndex(2); // ister bu şekilde seçebilirsin
        //ddMenu.selectByValue("value değerini"); // ister bu şekilde seçebilirsin
        //ddMenu.selectByVisibleText("Görünen textini yazabiliyorsun"); // ister bu şekilde seçebilirsin

        System.out.println("ddMenu.getOptions().size() = " + ddMenu.getOptions().size());

        BekleKapat();
    }
}
