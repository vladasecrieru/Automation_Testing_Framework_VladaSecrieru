package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;

public class WebDriverManager {
    public WebDriverManager(String browserType) {
        this.browserType = browserType;
    }

    private WebDriver webDriver;

    private String browserType;

    private void initializeDriver() {
        if (browserType.toUpperCase(Locale.ROOT).equals("CHROME")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
            webDriver = new ChromeDriver();
        } else if (browserType.toUpperCase(Locale.ROOT).equals("FIREFOX")) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");
            webDriver = new FirefoxDriver();
        } else {
            System.out.println("Nu exista un astfel de browser implementat!");
        }
    }

    public WebDriver getWebDriver() {
        if (webDriver == null) {
            System.out.println("Se initializeaza browser-ul dorit");
            initializeDriver();
        }
        return this.webDriver;
    }
}
