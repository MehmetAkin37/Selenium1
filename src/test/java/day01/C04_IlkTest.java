package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // 1- Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");


        //2- Başlığın "Amazon" içerdiğini test ediniz
        String actualTitle = driver.getTitle();
        String istenenKelime = "Amazon";

        if (actualTitle.contains(istenenKelime)) {
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");


        //3- Url'nin amazon içerdiğini test ediniz
        String actualUrl = driver.getCurrentUrl();
        String arananKleime = "amazon";

        if (actualUrl.contains(arananKleime)) {
            System.out.println("Url Testi PASSED");
        } else System.out.println("Url Testi FAILED");


        //4- Sayfayı kapatınız

        driver.close();


    }
}
