import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public  class test01 {
    static WebDriver driver;

    @BeforeAll //初始化全部变量的方法
    public static void init(){

        // chromedriver.exe的位置变量
        String driverPath = "D:\\MyDevelopment\\Python\\Scripts\\chromedriver.exe";
        //chromedriver所在路径 系统变量
        System.setProperty("webdriver.chrome.driver",driverPath);
    }
//    @AfterAll
//    public static void time() {
//      //  driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }
    @Test
    public void searchTest() {

        driver.get("https://work.weixin.qq.com/");
        driver.findElement(By.xpath("//*[@id=\"indexTop\"]/div[2]/aside/a[1]")).click();
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}




