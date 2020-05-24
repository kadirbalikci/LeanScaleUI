package com.LeanScale.pages;

import com.LeanScale.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    public MyAccountPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[text()='Thank you for registering with Main Website Store.']")
    public WebElement successMessage;

    public String getSuccessMessage() {
        return successMessage.getText();
    }

    @FindBy(xpath = "(//*[@class='box-content'])[1]/p")
    public WebElement accountInfo;

    @FindBy(xpath = "//*[@class='message-error error message']")
    public WebElement errorMessage;


    public String getErrorMessage(){
        return errorMessage.getText();
    }
}