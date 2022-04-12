import managers.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunner {
    public static void main(String[] args) {

        WebDriverManager webDriverManagerObject = new WebDriverManager("Chrome");
        webDriverManagerObject.getWebDriver().get("https://www.google.com/");
        webDriverManagerObject.getWebDriver().close();

        WebDriverManager fireFoxDriveManager = new WebDriverManager("FireFox");
        fireFoxDriveManager.getWebDriver().get("https://www.google.com/");
        fireFoxDriveManager.getWebDriver().close();

    }
}
