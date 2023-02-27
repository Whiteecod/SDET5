package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingByld {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jotform.com/221934510376353");

        WebElement isimKutusu=driver.findElement(By.id("first_8")); // elemanı ID ile bul
        isimKutusu.sendKeys("ismet"); // kutucuklara yazı gönderme

        WebElement soyadKutusu=driver.findElement(By.id("last_8"));
        soyadKutusu.sendKeys("temur");

        MyFunc.Bekle(2);
//        isimKutusu.clear();
//        soyadKutusu.clear();

        // Chrome ctrl+f ye basıldığında inspect bölümünde
        // first_name yazarsak bütün kelimelerde arar
        // #first_name yazarsak bütün ID paramtrelerinde arar

        WebElement labelFirstName=driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelFirstName = " + labelFirstName.getText());

        WebElement labelLastName=driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelLastName = " + labelLastName.getText());

        WebElement submitButton=driver.findElement(By.id("input_2"));
        submitButton.click();

        MyFunc.Bekle(3);
        driver.quit();
    }
}
