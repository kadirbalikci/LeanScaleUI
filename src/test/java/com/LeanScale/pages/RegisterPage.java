package com.LeanScale.pages;

import com.LeanScale.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public RegisterPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="firstname")
    public WebElement firstName;

    @FindBy(id="lastname")
    public WebElement lastName;

    @FindBy(id="email_address")
    public WebElement email;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(name = "password_confirmation")
    public WebElement confirmPassword;

    @FindBy(xpath = "//*[@title='Create an Account']")
    public WebElement submitButton;

}