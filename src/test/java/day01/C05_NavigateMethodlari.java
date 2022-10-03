package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com"); // Sayfada ileri geri yapacaksak kullanilir.
        // driver.get() methodu gibi bizi istedigimiz Url'ye goturur

        driver.navigate().to("https://www.techproeducation.com");

        // Tekrar amazon sayfasina gidelim
        Thread.sleep(3000);  // 3 sn beklettik
        driver.navigate().back();

        // Tekrar techproedeucation sayfasina gidelim
        Thread.sleep(3000);  // 3 sn beklettik
        driver.navigate().forward();

        // Techproedeucation sayfasina yenileyelim

        Thread.sleep(3000);  // 3 sn beklettik
        driver.navigate().refresh();

        // Son olarak sayfayi kapatiniz
        driver.close();








    }
}
