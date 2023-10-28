package POM;

import org.openqa.selenium.*;

public class RegisterPage {

    private final WebDriver driver;

    //Field
    private By firstNameField = By.id("firstname");
    private By middleNameField = By.id("middlename");
    private By lastNameField = By.id("lastname");
    private By emailField = By.id("email_address");
    private By passwordField = By.id("password");
    private By confirmPasswordField = By.id("confirmation");


    //Constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    //Method
    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterMiddleName(String middleName) {
        driver.findElement(middleNameField).sendKeys(middleName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void enterConfirmPass(String confirmPass) {
        driver.findElement(confirmPasswordField).sendKeys(confirmPass);
    }
}
