package com.LeanScale.pages;

import com.LeanScale.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath="(//*[text()='Create an Account'])[1]")
    public WebElement createAccountButton;

    @FindBy(id = "search")
    public WebElement searchBox;

    @FindBy (xpath = "(//*[@class='authorization-link'])[1]")
    public WebElement signInTitle;

    @FindBy (name = "login[username]")
    public WebElement username;

    @FindBy(name = "login[password]")
    public WebElement password;

    @FindBy(xpath = "//*[@class='action login primary']")
    public WebElement signInButton;

    @FindBy(xpath = "(//*[text()='Welcome, nusret harputlu!'])[1]")
    public WebElement loggedInUser;



    //Product elements
    @FindBy(xpath = "//*[@class='product-image-photo']")
    public WebElement productPhoto;

    @FindBy(id = "option-label-size-150-item-5596")
    public WebElement sizeM;

    @FindBy (id = "option-label-color-93-item-5479")
    public WebElement colorGrey;

    @FindBy (xpath="//*[@title='Add to Cart']")
    public WebElement AddToCartButton;

//    @FindBy (xpath = "(//*[text()='My Cart'])[1]")
//    public WebElement myCartButton;

    @FindBy (xpath = "//*[text()='shopping cart']")
    public WebElement myCartButton;

}