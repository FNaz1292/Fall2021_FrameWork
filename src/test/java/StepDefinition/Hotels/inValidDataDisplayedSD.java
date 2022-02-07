package StepDefinition.Hotels;

import Pages.Hotels.LaunchPage;
import cucumber.api.java.en.When;

public class inValidDataDisplayedSD {
    LaunchPage launchPage=new LaunchPage();
    @When("^Click on SignIn link$")
    public void signUp(){
        launchPage.signUp();
    }

}
