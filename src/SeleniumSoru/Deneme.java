package SeleniumSoru;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.tools.Tool;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Deneme extends BaseDriver {
    @Test
    public void test1(){
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        Actions actions = new Actions(driver);
        List<WebElement> cities = driver.findElements(By.cssSelector("#answerDiv > .dragDropSmallBox"));

        for (WebElement city : cities) {
            String num = city.getAttribute("id");
            num = num.substring(1);

            String cssSelector = "#questionDiv > .dragDropSmallBox[id='q" + num + "']";
            WebElement targetBox = driver.findElement(By.cssSelector(cssSelector));

            actions.clickAndHold(city).perform();
            MyFunc.Bekle(2);
            actions.moveToElement(targetBox).release().perform();
        }
        BekleKapat();
    }
}


