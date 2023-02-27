package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector extends BaseDriver {
    public static void main(String[] args) {
//     1- açılan sayfdaki kutucuğa mesajınızı yazınız.
        // 2- butonu tıklatınız
        // 3- butona basıldığında mesajınızın sayfada göründüğünü test ediniz.

         driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

         String mesajim="merhaba selenium";
         WebElement txtBox=driver.findElement(By.cssSelector("input[id='user-message']"));
         txtBox.sendKeys(mesajim);

         WebElement click=driver.findElement(By.cssSelector("[onclick='showInput();']"));
         click.click();

         WebElement msg=driver.findElement(By.cssSelector("[id='display']"));

         if (msg.getText().equals(mesajim))
             System.out.println("Test Passed");
         else
             System.out.println("test fail");

        BekleKapat();
    }
}
