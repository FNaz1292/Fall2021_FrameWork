package StepDefinition.Hotels;

import Pages.Hotels.LaunchPage;
import Pages.Hotels.signInProfilePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ErrorDisplayedSD {
    LaunchPage launchPage=new LaunchPage();
    signInProfilePage signInProfilePage=new signInProfilePage();

    @When("^Click on “Sign in” link$")
    public void signIn(){
        launchPage.signUp();
    }
    @Then("^Enter invalid email address$")
    public void enterInvalidEmail(){
        signInProfilePage.signInProfileEmailBox();
    }

    @When("Click on Sign in button")
    public void clickSignIn(){
        signInProfilePage.clickOnSignIn();
    }

    @Then("^Enter invalid password$")
    public void enterInvalidPassword() {
        signInProfilePage.signInProfilePagePasswordBox();
    }


    @Then("^Verify Verification message is displayed\\.$")
    public void verifyVerificationMessageIsDisplayed() {
        signInProfilePage.errorMessageDisplayed();
    }
}
