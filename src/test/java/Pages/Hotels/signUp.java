package Pages.Hotels;

import Pages.WebCommands;
import org.openqa.selenium.By;

public class signUp extends WebCommands {

    By signUpLocator= By.xpath("//a[contains(text(),'Sign up')]");
    public void goToSignUp(){
        clickThis(signUpLocator);
    }

}
