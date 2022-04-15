import managers.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.HomePage;
import pageobjects.RegisterPage;

public class TestRunner {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager webDriverManagerObject = new WebDriverManager("Chrome");
        webDriverManagerObject.getWebDriver().get("https://demo.opencart.com/");

        HomePage homePage = new HomePage(webDriverManagerObject.getWebDriver());
        homePage.navigateToRegisterPage();

        RegisterPage registerPage = new RegisterPage(webDriverManagerObject.getWebDriver());
        registerPage.populateRegisterFromWithData ("Chloe","Johnson","chloejohnson@gmail.com","+15847390400","password12345","password12345");
        registerPage.clickContinueBtn();

        webDriverManagerObject.getWebDriver().close();
        webDriverManagerObject.getWebDriver().quit();
    }
}
