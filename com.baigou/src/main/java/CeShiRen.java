import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class CeShiRen {
    static WebDriver driver; //创建变量

    @BeforeAll
    public static void init() {
        driver = new ChromeDriver(); //对创建的变量进行初始化
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void searchTest() {
        try {
            String url = "https://ceshiren.com/";
            driver.get(url);
            driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);//隐式等待
            driver.findElement(By.id("search-button")).click();
            driver.findElement(By.id("search-term")).click();
            driver.findElement(By.id("search-term")).sendKeys("微信小程序自动化");
            driver.findElements(By.xpath("//span[text()='微信小程序自动化']")).get(1).click();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
