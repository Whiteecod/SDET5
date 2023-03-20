package SeleniumSorular2;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
Bu websitesine gidiniz. http://demo.seleniumeasy.com/basic-first-form-demo.html
        List box'a tıklayınız.
        Bootstrap List Box'a tıklayınız.(http://demo.seleniumeasy.com/bootstrap-dual-list-box-demo.html)
        **bootstrap-duallist**'e tıklayınız. Sonra sağ ok (>)'a tıklayınız.
        **Dapibus ac facilisis in'**e tıklayınız ve sağ ok (>)'a tıklayınız.
        Sağa gönderilen elemanların üstüne bir kere daha tıklayıp beyaz hale getiriniz.
        **Cras husto odio**'a tıklayınız ve sol ok(<)'a tıklayınız.
        **Dapibus ac facilisis in**'a tıklayınız ve sol ok(<)'a tıklayınız.
        Sol kutu bu şekilde olmalıdır.
        - Morbi leo risus
        - Porta ac consectetur ac
        - Vestibulum at eros
        - Cras justo odio
        - Dapibus ac facilisis in
        Sağ kutu bu şekilde olmalıdır.
        - Morbi leo risus
        - Porta ac consectetur ac
        - Vestibulum at eros
        - bootstrap-duallist
        - Dapibus ac facilisis in

 */
public class Soru_13 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement listBox = driver.findElement(By.xpath("//*[text()='List Box']"));
        listBox.click();

        WebElement bootstrapList = driver.findElement(By.linkText("Bootstrap List Box"));
        bootstrapList.click();

        WebElement bootstrap = driver.findElement(By.xpath("//*[text()='bootstrap-duallist ']"));
        bootstrap.click();

        WebElement rightClick = driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm move-right']"));
        rightClick.click();


    }
}
