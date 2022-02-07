package StepDefinition.Hotels;

import Pages.Hotels.LaunchPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalenderDatesVerificationSD {
    LaunchPage launchPage=new LaunchPage();

    @When ("^I Click on Check in Calender$")
    public void clickCheckIn(){
        launchPage.clickOnCheckIn();
    }
    @Then("^I Go to current month if not displayed$")
     public void CurrentMonthIsDisplayed(){
        launchPage.CurrentMonthDisplayed();
    }
    @Then("^I Verify For current month that past dates(if any)are disabled$")
    public  void pastDateDisabled(){
        launchPage.dateDisabled();
    }
    @Then("^I Verify For current month back button on current month is disabled$")
    public void backButton(){
        launchPage.backButtonDisplayed();

    }


}
