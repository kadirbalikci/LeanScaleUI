package com.LeanScale.step_definitions;

import com.LeanScale.pages.*;
import com.LeanScale.utilities.ConfigurationReader;
import com.LeanScale.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;

public class LeanScaleAssignmentStepDefs {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    WebDriverWait wait;

    Faker faker = new Faker();
    String fakerName = faker.name().firstName();
    String fakerLastname = faker.name().lastName();
    String fakerEmail = fakerName.concat(fakerLastname).toLowerCase().concat("@mail.com");

    @Given("the user is on the Lean Scale home page")
    public void the_user_is_on_the_Lean_Scale_home_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @Given("the user navigates to the register page")
    public void the_user_navigates_to_the_register_page() {
        homePage.createAccountButton.click();
    }

    @When("User enters valid register information")
    public void user_enters_valid_register_information() {
        String name = ConfigurationReader.get("LS_name");
        String lastName = ConfigurationReader.get("LS_surname");
        String email = ConfigurationReader.get("LS_email");
        String password = ConfigurationReader.get("LS_password");
        String confirmPassword = ConfigurationReader.get("LS_confirmPassword");

        registerPage.firstName.sendKeys(name);
        registerPage.lastName.sendKeys(lastName);
        registerPage.email.sendKeys(email);
        registerPage.password.sendKeys(password);
        registerPage.confirmPassword.sendKeys(password);
        registerPage.submitButton.click();

    }

    @Then("User should create an account successfully")
    public void user_should_create_an_account_successfully() {
        String actualMessage = myAccountPage.getSuccessMessage();
        String expectedMessage = "Thank you for registering with Main Website Store.";
        assertEquals(expectedMessage, actualMessage);

        String accountInfo = myAccountPage.accountInfo.getText();

        assertTrue(accountInfo.contains(ConfigurationReader.get("LS_email")));
    }

    @When("User enters invalid register information")
    public void user_enters_invalid_register_information() {
        String name = ConfigurationReader.get("LS_name");
        String lastName = ConfigurationReader.get("LS_surname");
        String email = ConfigurationReader.get("LS_invalidEmail");
        String password = ConfigurationReader.get("LS_password");
        String confirmPassword = ConfigurationReader.get("LS_password");

        registerPage.firstName.sendKeys(name);
        registerPage.lastName.sendKeys(lastName);
        registerPage.email.sendKeys(email);
        registerPage.password.sendKeys(password);
        registerPage.confirmPassword.sendKeys(confirmPassword);
        registerPage.submitButton.click();

    }

    @Then("User should get an error message")
    public void user_should_get_an_error_message() {

        String actualMessage = myAccountPage.getErrorMessage();
        String expectedMessage = "There is already an account with this email address.";

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Given("the user makes a search the product with {string} stock number")
    public void the_user_makes_a_search_the_product_with_stock_number(String stockNum) {
        stockNum = "MT07";
        WebElement searchBox = homePage.searchBox;
        homePage.searchBox.sendKeys(stockNum, Keys.ENTER);

    }

    @When("User configures the attributes of the product and add to the cart")
    public void user_configures_the_attributes_of_the_product_and_add_to_the_cart() {

        homePage.sizeM.click();
        homePage.colorGrey.click();
        homePage.AddToCartButton.click();

    }

    @Then("User should the product in the cart section")
    public void user_should_the_product_in_the_cart_section() {
        homePage.myCartButton.click();
        WebElement size = Driver.get().findElement(By.xpath("(//*[@class='item-options'])[3]/dd[1]"));
        String actualSize = size.getText();
        String expectedSize = "M";
        assertEquals(expectedSize, actualSize);
        WebElement color = Driver.get().findElement(By.xpath("(//*[@class='item-options'])[3]/dd[2]"));
        String actualColor = color.getText();
        String expectedColor = "Gray";
        assertEquals(expectedColor, actualColor);

    }

    @Given("User logins with the valid credentials")
    public void user_logins_with_the_valid_credentials() {
        homePage.signInTitle.click();
        homePage.username.sendKeys(ConfigurationReader.get("LS_email"));
        homePage.password.sendKeys(ConfigurationReader.get("LS_password"));
        homePage.signInButton.click();
    }
    @Then("Username should be displayed at the right top corner")
    public void username_should_be_displayed_at_the_right_top_corner() {
        String name = ConfigurationReader.get("LS_name");
        String lastName = ConfigurationReader.get("LS_surname");
        String actualMessage = homePage.loggedInUser.getText();
        System.out.println("actualMessage = " + actualMessage);
        String expectedLoginMessage = "Welcome, " +name +" "+ lastName + "!";
        assertEquals(expectedLoginMessage, actualMessage);
    }

    @When("System generates random {string} {string} and {string} register data")
    public void system_generates_random_and_register_data(String fakerName, String fakerLastname, String email) {

        String password = ConfigurationReader.get("LS_password");

        registerPage.firstName.sendKeys(fakerName);
        registerPage.lastName.sendKeys(fakerLastname);
        registerPage.email.sendKeys(email);
        registerPage.password.sendKeys(password);
        registerPage.confirmPassword.sendKeys(password);
        registerPage.submitButton.click();

    }

    @Then("User should create an account with the generated {string} successfully")
    public void user_should_create_an_account_with_the_generated_successfully(String email) {
        email = fakerEmail;
        String actualMessage = myAccountPage.getSuccessMessage();
        String expectedMessage = "Thank you for registering with Main Website Store.";
        assertEquals(expectedMessage, actualMessage);
        String accountInfo = myAccountPage.accountInfo.getText();
        assertTrue(accountInfo.contains(email));


    }
    @When("System generates random name, lastname and email register data")
    public void system_generates_random_name_lastname_and_email_register_data() {
        String password = ConfigurationReader.get("LS_password");
        registerPage.firstName.sendKeys(fakerName);
        registerPage.lastName.sendKeys(fakerLastname);
        registerPage.email.sendKeys(fakerEmail);
        registerPage.password.sendKeys(password);
        registerPage.confirmPassword.sendKeys(password);
        registerPage.submitButton.click();
    }

    @Then("User should create an account with the generated email successfully")
    public void user_should_create_an_account_with_the_generated_email_successfully() {
        String actualMessage = myAccountPage.getSuccessMessage();
        String expectedMessage = "Thank you for registering with Main Website Store.";
        assertEquals(expectedMessage, actualMessage);
        String accountInfo = myAccountPage.accountInfo.getText();
        assertTrue(accountInfo.contains(fakerEmail));
    }

}