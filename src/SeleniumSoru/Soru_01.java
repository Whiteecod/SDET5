package SeleniumSoru;

import Utility.BaseDriver;
import Utility.MyFunc;
import com.sun.xml.internal.ws.encoding.policy.MtomPolicyMapConfigurator;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/*
Senaryo
        1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
        2- random 100 e kadar 2 sayı üretiniz.
        3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
        4- Sonuçları Assert ile kontrol ediniz.
        5- Yukarıdaki işlemi 5 kez tekrar ettiriniz
 */
public class Soru_01 extends BaseDriver {

    @AfterClass
    public void close() {
        BekleKapat();
    }
    @Test
    public void Test1() {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        MyFunc.Bekle(5);
        for (int i = 0; i < 5 ; i++) {
            MyFunc.Bekle(5);
            int randomSayi1 = (int) (Math.random() * 100);
            int randomSayi2 = (int) (Math.random() * 100);

            // Çıkarma işlemleri
            WebElement firstNumber = driver.findElement(By.name("number1"));
            firstNumber.clear();
            firstNumber.sendKeys(Integer.toString(randomSayi1));

            WebElement secondNumber = driver.findElement(By.name("number2"));
            secondNumber.clear();
            secondNumber.sendKeys(Integer.toString(randomSayi2));

            WebElement addButton = driver.findElement(By.id("selectOperationDropdown"));
            Select sc = new Select(addButton);
            sc.selectByVisibleText("Subtract");

            WebElement calculate = driver.findElement(By.id("calculateButton"));
            calculate.click();

            WebElement result = driver.findElement(By.id("numberAnswerField"));
            int cikarma = randomSayi1 - randomSayi2;
            int sonuc = Integer.parseInt(result.getAttribute("value"));
            System.out.println("sonuc = " + sonuc);
            Assert.assertEquals(cikarma, sonuc);
            System.out.println(randomSayi1 + "-" + randomSayi2 + " = " + sonuc);

            MyFunc.Bekle(5);
            // Çarpma işlemleri
            firstNumber.clear();
            firstNumber.sendKeys(Integer.toString(randomSayi1));
            secondNumber.clear();
            secondNumber.sendKeys(Integer.toString(randomSayi2));

            WebElement addButton2 = driver.findElement(By.id("selectOperationDropdown"));
            Select sc2 = new Select(addButton2);
            sc.selectByVisibleText("Multiply");

            WebElement calculate2 = driver.findElement(By.id("calculateButton"));
            calculate2.click();

            WebElement result2 = driver.findElement(By.id("numberAnswerField"));
            int carpma = 1;
            carpma = randomSayi1 * randomSayi2;
            int carpimsonuc = Integer.parseInt(result2.getAttribute("value"));
            Assert.assertEquals(carpma, carpimsonuc);
            System.out.println(randomSayi1 + " + " + randomSayi2 + "=" + carpimsonuc);

        }


           BekleKapat();

    }
}
