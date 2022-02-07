package Pages.Hotels;

import Helper.Check;
import Pages.WebCommands;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LaunchPage extends WebCommands {

    By searchTabLocator = By.xpath("//button[contains(@data-stid, 'destination-menu')]");
    By searchBoxLocator = By.id("location-field-destination");
    By allSuggestionsLocator = By.xpath("//ul[contains(@data-stid, 'destination-results')]//strong");
    By disabledDateLocator= By.xpath("span[@class=is-visually-hidden]");
    By clickOnCheckInLocator=By.xpath("//body/div[@id='root']/main[@id='main']/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/span[2]/span[1]");
    By currentMonthDisplayedLocator= By.tagName("//span[contains(text(),'Sat, Feb 5')]");
    By backButtonLocator= By.id("Previous");
    By clickOnTravelerLocator=By.xpath("//span[contains(text(),'Guests')]");
    By noOfAdultsLocator=By.xpath("//label[contains(text(),'Adults:')]");
     By noOfChildrenLocator=By.name("q-room-0-children");
     By ageOfChild1Locator=By.name("q-room-0-child-0-age");
     By ageOfChild2Locator=By.name("q-room-0-child-1-age");
     By totalNumberOfGuest=By.xpath("//span[contains(text(),'1 room, 8 guests')]");
     By signUpLocator=By.xpath("//span[contains(text(),'Sign in')]");
     By signInMainPageLocator=By.xpath("//span[contains(text(),'Sign in')]");




    public void clickSearchTab() {
        clickThis(searchTabLocator);
    }

    public void enterSearchText(String searchText) {
        type(searchBoxLocator, searchText);
    }

    public void selectFromSearchSuggestions(String destinationName) {
        clickOneOfElementsUsingText(allSuggestionsLocator, destinationName);
    }
    public void dateDisabled(){
        clickThis(disabledDateLocator);
    }
    public void clickOnCheckIn(){
        clickThis(clickOnCheckInLocator);
    }
    public void CurrentMonthDisplayed(){
        isWebElementDisplayed(currentMonthDisplayedLocator);
    }
    public void backButtonDisplayed(){
        isWebElementEnabled(backButtonLocator);
    }
    public void clickOnTravelers(){
        clickThis(clickOnTravelerLocator);
    }
    public void noOfAdults(){
        type(noOfAdultsLocator, "06");
    }
    public void noOfChildren(){
        type(noOfChildrenLocator,"02");
    }
    public void AgeOfChild(){
        type(ageOfChild1Locator,"04");
    }
    public void AgeOfChild1(){
        type(ageOfChild2Locator, "01");
    }
    public boolean totalNumOfGuest(){
        getText(totalNumberOfGuest);
    checkTrue(totalNumOfGuest(),"total Guests are not equal to Guests Entered");
    return false;
    }
    public void signUp(){
        getElement(signUpLocator);
    }




}
