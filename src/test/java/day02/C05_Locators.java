package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Locators {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com");

        //Amazonda nutella aratınız
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER); // id uniqe olduğu bu sorunsuz çalışır

        // 2.YOL  : driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella" + Keys.ENTER);


        // name ile Nutella arattik :
        //WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
        //aramaKutusu.sendKeys("Nutella"+ Keys.ENTER); //name uniqe olduğu için sorunsuz çalışır


        // className ile Nutella arattik :
        //WebElement aramaKutusu = driver.findElement(By.className("nav-search-field "));
        //aramaKutusu.sendKeys("Nutella",Keys.ENTER); // + yerine virgul de kullanilabilir

        /*
        Bu locatar çalismadı. Locatar alırken gözümüzden kaçan detaylar olabilir
        aldığımız bir locatar çalışmazsa alternatif locatorlar denemeliyiz
         */

        Thread.sleep(4000);
        driver.findElement(By.partialLinkText("oducts on Amazon")).click(); // a tag'ındaki link isminden istediğimiz bir parçayla locate edebiliriz
        driver.findElement(By.linkText("Sell products on Amazon")).click();


    }

}
