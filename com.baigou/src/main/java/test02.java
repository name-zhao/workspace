import com.sun.corba.se.impl.oa.poa.ActiveObjectMap;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class test02 {
    static WebDriver  driver;

    @BeforeAll
    public static void init(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void login(){
        String url="https://work.weixin.qq.com/";
        driver.get(url);
        driver.findElement(By.xpath("//*[@id=\"indexTop\"]/div[2]/aside/a[1]")).click();
    }
    //获取cookie
    @Test
    public void loginTest(){

            driver.get("https://work.weixin.qq.com/wework_admin/frame");



    }
    @AfterAll
    public static void tearDown(){
        driver.quit();
    }



}
