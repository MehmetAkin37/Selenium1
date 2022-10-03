package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08_Odev4 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    //   1.Yeni bir class olusturalim(Homework)
    //   2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title)“facebook”
    //   oldugunu dogrulayin (verify), degilse dogru basligiyazdirin.
        driver.get("https://www.facebook.com/");



    //   3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual”URL’i
    //   yazdirin.


    //   4.https://www.walmart.com/ sayfasinagidin.


    //   5.Sayfa basliginin “Walmart.com” icerdiginidogrulayin.


    //   6.Tekrar “facebook” sayfasinadonun


    //   7.Sayfayi yenileyin


    //   8.Sayfayi tam sayfa (maximize) yapin 9.Browser’ikapatin









    }
}
