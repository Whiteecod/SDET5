package SeleniumSorular2;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/*
Bu web sitesine gidiniz.   http://demo.seleniumeasy.com/basic-select-dropdown-demo.html
        Select a day dropdown'ından rastgele bir seçenek seçiniz.
        5 kere wednesday seçtikten sonra döngüyü durdurun.
        Kaç kere Wednesday seçtiğinizi yazdırınız.
        Sonuç 5 olmalıdır.

 */
public class Soru_11 extends BaseDriver {
    @Test
    public void test() {
        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        WebElement selectDay = driver.findElement(By.id("select-demo"));
        Select days = new Select(selectDay);
        int count = 0;
        while (count < 5) {
            int optionsCount = days.getOptions().size();
            int randomIndex = (int) (Math.random() * (optionsCount - 1)) + 1;
            days.selectByIndex(randomIndex);

            String selectedOption = days.getFirstSelectedOption().getText();

            if (selectedOption.equals("Wednesday")) {
                count++;
                System.out.println("selectedOption = " + selectedOption);
            }
        }

        BekleKapat();
    }

}
