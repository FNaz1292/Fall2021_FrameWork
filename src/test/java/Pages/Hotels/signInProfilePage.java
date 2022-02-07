package Pages.Hotels;

import Pages.WebCommands;
import org.openqa.selenium.By;

public class signInProfilePage extends WebCommands{

    By signInOnProfilePageLocator = By.id("sign-in-button");
    By signInOnProfilePageEmailLocator = By.id("sign-in-email");
    By signInOnProfilePagePasswordLocator = By.id("sign-in-password");
    By errorMessageDisplayedLocator= By.linkText("We don’t recognize the email and password combination you’ve entered. Please try again, or if you’ve ");

    public void signInProfileEmailBox() {
        switchToHandle("www.hotels.com/profile/signin.html");
        type(signInOnProfilePageEmailLocator, "f2sg@2h");
    }

    public void signInProfilePagePasswordBox() {
        type(signInOnProfilePagePasswordLocator, "sg1sgd");
    }

    public void clickOnSignIn() {
        clickThis(signInOnProfilePageLocator);
    }

   public boolean errorMessageDisplayed() {
       isWebElementDisplayed(errorMessageDisplayedLocator);
       return true;
   }

}

