package Pages.Hotels;

import Pages.WebCommands;
import org.openqa.selenium.By;
import org.testng.Assert;

public class createAccount extends WebCommands {
    By emailAddressLocator= By.id("email-error");
    By emailErrorLocator=By.linkText("'Please check your email address'");
    By passwordErrorLocator=By.id("password-error'");
    By passwordBoxLocator= By.id("sign-up-password");
    By firstNameInputLocator=By.id("sign-up-first-name");
    By wrongInputFirstNameLocator=By.id("firstName-error");
    By lastNameInputLocator=By.id("sign-up-last-name");
    By wrongInputLastNameLocator=By.id("lastName-error");
    By emailLoginBoxLocator= By.id("sign-up-email");
    By emailBoxCheckMarkLocator=By.name("email");
    By tickMarkLocator=By.xpath("//div[@class='form-element valid']\")");






    public void emailAddress(){
        type(emailAddressLocator,"#!@###");
    }
     public boolean emailErrorDisplayed(){
     getText(emailErrorLocator);
           return true;
     }
     public void passwordBox(){
        type(passwordBoxLocator,"as12");
    }
    public boolean passwordError(){
        getText(passwordErrorLocator);
        return true;
    }
    public void inputFirstName(){
        type(firstNameInputLocator,"1234");
    }
    public boolean errorMessageFirstName(){
        getText(wrongInputFirstNameLocator);
        return true;
    }
    public void inputLastName(){
        type(lastNameInputLocator,"123");
    }
    public boolean wrongInputLastName(){
        getText(wrongInputLastNameLocator);
        return true;
    }
    public void enterEmail(){
        type(emailLoginBoxLocator,"abs@fgh.com");
    }

    public boolean checkMarkDisplayed(){
        getElement(tickMarkLocator);
        checkTrue(checkMarkDisplayed(),"Check Mark not displayed.");
        return true;
    }
    public void passwordInput(){
        type(passwordBoxLocator,"acv123");
    }

    public void inputValidFirstName(){
        type(firstNameInputLocator,"fairy");
    }
    public void inputValidLastName(){
        type(lastNameInputLocator,"light");
    }
}
