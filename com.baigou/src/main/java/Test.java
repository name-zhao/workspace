import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {
    public static void main(String[] args) {
//        String driverPath = "D:\\ny_software_install\\chromedriver.exe";
        String driverPath = "D:\\MyDevelopment\\Python\\Scripts\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath); //chromedriver所在路径 系统变量

//        ChromeOptions options = new ChromeOptions();
////        options.addArguments("--headless"); //设置无头，谷歌浏览器就不会蹦出来影响你了
//        options.addArguments("--disable-gpu");
//        options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36");

        WebDriver driver = new ChromeDriver();

/*
        String url = "https://baidu.com/"; //注意要是完整的url，有http://xxx，不然会报错

        driver.get(url); //访问url*/
        String url = "https://ceshiren.com/";
        driver.get(url);
//            driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);//隐式等待
        driver.findElement(By.id("search-button")).click();
        driver.findElement(By.id("search-term")).click();
        driver.findElement(By.id("search-term")).sendKeys("微信小程序自动化");
        driver.findElements(By.xpath("//span[text()='微信小程序自动化']")).get(1).click();


//        driver.findElement(By.xpath("//*[@id=\"indexTop\"]/div[2]/aside/a[1]")).click();

//        driver.close();
        driver.quit();//quit方法就是直接退出并关闭所有关联的tab窗口
        driver.close();//close方法一般关闭一个tab


    }

}
