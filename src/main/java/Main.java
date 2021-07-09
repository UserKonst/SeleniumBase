import settings.FrameworkSettings;
import settings.RunSettings;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

        String url = FrameworkSettings.runSettings.googlePageUrl;

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        

        driver.get(url);
        Thread.sleep(1000);

        driver.quit();

    }

}
