package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_GetCssValue extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement inputValEnter=driver.findElement(By.id("inputValEnter"));

//        <input autocomplete="off" name="keyword" type="text" class="col-xs-20 searchformInput keyword"
//        id="inputValEnter" onkeypress="clickGo(event, this)" placeholder=""
//        value="" strtindx="" endindx="">

        System.out.println("inputValEnter.getAttiibute(class) = "
                + inputValEnter.getAttribute("class"));

        // class ın karşığı olan CSS-şekillendirme değerlerini almak için getCssValue kullanılır
        System.out.println("inputValEnter.getCssValue(font-size)"
                + inputValEnter.getCssValue("font-size"));
        System.out.println("inputValEnter.getCssValue(color)"
                + inputValEnter.getCssValue("color"));
        System.out.println("inputValEnter.getCssValue(bankground)"
                + inputValEnter.getCssValue("background"));


        BekleKapat();
    }
}
