import managers.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.HomePage;
import pageobjects.RegisterPage;

public class JunitTest {
    WebDriverManager webDriverManagerObject = new WebDriverManager("Chrome");

    @BeforeEach
    public void configurePrecondition(){
        webDriverManagerObject.getWebDriver().get("https://demo.opencart.com/");
    }
    @AfterEach
    public void tearDownActivities(){
        webDriverManagerObject.getWebDriver().close();
    }

    @Test
    @DisplayName("The registration can be accesed from navigation bar")
    public void registerPageIsOpened() {
        HomePage homePage = new HomePage(webDriverManagerObject.getWebDriver());
        homePage.navigateToRegisterPage();

        boolean urlIsValid = webDriverManagerObject.getWebDriver().getCurrentUrl().contains("index.php?route=account/register");
        Assertions.assertTrue(urlIsValid, "Invalid url address");
    }



        @Test
        @DisplayName("Correct error message is displayed when trying to create a user without checking tge Privacy Policy")
        public void CreatingAnAccountWithoutAcceptingThePrivacyPolicy(){
            HomePage homePage = new HomePage(webDriverManagerObject.getWebDriver());
            homePage.navigateToRegisterPage();

            RegisterPage registerPage = new RegisterPage(webDriverManagerObject.getWebDriver());
            registerPage.populateRegisterFromWithData("Oliver", "Peters","oliverpeters@gmail.com","+384584953","password12345", "password12345");
            registerPage.clickContinueBtn();

            WebElement errorMessageForPrivacyPolicy = webDriverManagerObject.getWebDriver().findElement(By.xpath("//*[@id=\"account-register\"]/div[1]"));
            String expectedErrorText= "Warning: You must agree to the Privacy Policy!";
            boolean errorMessageContainsTheExpectedText = errorMessageForPrivacyPolicy.getText().equals(expectedErrorText);

            Assertions.assertTrue(errorMessageContainsTheExpectedText,"The error message is not correct.");
        }
    }


