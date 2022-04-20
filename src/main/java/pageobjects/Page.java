package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
    public Page (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="//*[@id=\"top-links\"]/ul/li[2]/a/i" )
    private WebElement myAccountIcon;

    @FindBy(xpath ="//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
    private WebElement registerBtn;

    public void navigateToRegisterPage(){
        myAccountIcon.click();
        registerBtn.click();
    }
}
