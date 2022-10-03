package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        System.out.println(driver.getWindowHandle());  // CDwindow-6422A079AE03A626E61C09B97A98537E
        // Farkli pencereler arasinda gezinebilmek icin getWindowHandle() methodunu kullaniriz

    }
}
