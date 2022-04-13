import managers.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunner {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager webDriverManagerObject = new WebDriverManager("Chrome");
        webDriverManagerObject.getWebDriver().get("https://demo.opencart.com/");

        WebElement myAccountIcon = webDriverManagerObject.getWebDriver().findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i"));
        myAccountIcon.click();

        WebElement registerBtn = webDriverManagerObject.getWebDriver().findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
        registerBtn.click();

        WebElement firtNameImputField = webDriverManagerObject.getWebDriver().findElement(By.id("input-firstname"));
        WebElement lastNameImputField = webDriverManagerObject.getWebDriver().findElement(By.id("input-lastname"));
        WebElement emailImputField = webDriverManagerObject.getWebDriver().findElement(By.id("input-email"));
        WebElement telephoneInputField = webDriverManagerObject.getWebDriver().findElement(By.cssSelector("#input-telephone"));
        WebElement passwordInput = webDriverManagerObject.getWebDriver().findElement(By.id("input-password"));
        WebElement confirmPassword = webDriverManagerObject.getWebDriver().findElement(By.id("input-confirm"));
        WebElement privacyPolicy = webDriverManagerObject.getWebDriver().findElement(By.xpath("//*[@id=\"content\"]/form/div/div/a/b"));
        WebElement checkBox = webDriverManagerObject.getWebDriver().findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
        WebElement contiunueBtn = webDriverManagerObject.getWebDriver().findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));

        firtNameImputField.sendKeys("Chloe");
        lastNameImputField.sendKeys("Johnson");
        emailImputField.sendKeys("chloejohnson@gmail.com");
        telephoneInputField.sendKeys("+15847390400");
        passwordInput.sendKeys("password12345");
        confirmPassword.sendKeys("password12345");

        privacyPolicy.click();
        checkBox.click();
        contiunueBtn.click();

        webDriverManagerObject.getWebDriver().quit();

    }
}
