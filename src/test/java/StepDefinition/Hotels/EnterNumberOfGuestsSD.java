package StepDefinition.Hotels;

import Pages.Hotels.LaunchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class EnterNumberOfGuestsSD {
   @Given("^I Launch hotels.com$")
           public void openUrl(){
       LaunchPage launchPage=new LaunchPage();
   }

    LaunchPage launchPage= new LaunchPage();

    @Then("^I Click on Travelers$")
    public void clickTravelersTab(){
       launchPage.clickOnTravelers();
    }
    @And("^I Select Adults as 6$")
    public void noOfAdults(){
        launchPage.noOfAdults();
    }
    @And("^I Select “Children” as 2$")
    public void noOfChildren(){
        launchPage.noOfChildren();
    }
    @Then("^I Select first child age: 4$")
    public void ageOfChild1(){
        launchPage.AgeOfChild();
    }
    @Then("^I Select second child age: 1$")
    public void ageOfChild2(){
        launchPage.AgeOfChild1();
    }
    @And("^I Click Apply$")
    public void clickApply(){
        launchPage.clickSearchTab();
    }
    @Then("^Verify total number of guests in sum of adults and children as same as selected on step #3 and #4$")
    public void totalNumberOFGuests(){
        launchPage.totalNumOfGuest();
    }

}
