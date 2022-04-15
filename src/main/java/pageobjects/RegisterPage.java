package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Page{
    public RegisterPage (WebDriver driver){
        super(driver);
    }

    @FindBy(id = "input-firstname")
    private WebElement firtNameImputField;

    @FindBy (id = "input-lastname")
    private WebElement lastNameImputField;

    @FindBy (xpath = "//*[@id=\"input-email\"]")
    private WebElement emailImputField;

    @FindBy (css = "#input-telephone")
    private WebElement telephoneInputField;

    @FindBy (id = "input-password")
    private WebElement passwordInput;

    @FindBy (id = "input-confirm")
    private WebElement confirmPasswordInputField;

    @FindBy (xpath = "//*[@id=\"content\"]/form/div/div/input[2]")
    private WebElement contiunueBtn;

    public void populateRegisterFromWithData (String firstName, String lastName, String email, String telephone, String password, String confirmPassword) {
        firtNameImputField.sendKeys(firstName);
        lastNameImputField.sendKeys(lastName);
        emailImputField.sendKeys(email);
        telephoneInputField.sendKeys(telephone);
        passwordInput.sendKeys(password);
        confirmPasswordInputField.sendKeys(confirmPassword);
    }
        public void clickContinueBtn(){
            contiunueBtn.click();
        }
    }

