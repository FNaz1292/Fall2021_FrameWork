package Pages.Hotels;

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
     By signInLocator=By.tagName("a[@href=\"/profile/signup.html\"]");
     By helpButtonLocator=By.xpath("//span[contains(text(),'Help')]");
     By dropDownLink=By.xpath("//a[@href='mailto:userexperience@hotels.com?subject=Site+feedback%3A+HOME%7Cen_US%7CHCOM_US%7Cwww.hotels.com']");
     By clickOnCancellationLocator=By.xpath("//h3[contains(text(),'Free cancellation')]");
     By textBookWithHotelLocator=By.xpath("//h2[contains(text(),'Why book with Hotels.com?')]");
     By priceGuaranteeLocator= By.xpath("//h3[contains(text(),'Our price guarantee')]");
     By rewardNightLocator=By.xpath("//h3[contains(text(),'Get a reward night')]");
     By textPriceGuaranteeLocator= By.xpath("//font[contains(text(),'Price Guarantee')]");
     By goBackMainPageLocator= By.xpath("//a[@href='/?intlid=OTHER+%3A%3A+header_main_section']");
     By instantSavingLocator= By.xpath("//h1[contains(text(),'Instant savings. Reward* nights. And more ...')]");



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
        getElement(signUpLocator).click();
    }
    public void signIn(){
        getElement(signInLocator).click();
     }
     public  void clickHelp(){
        clickThis(helpButtonLocator);
    }
    public void clickLink(){
           clickThis(dropDownLink);
         }
    public boolean textBookHotel () {
        getElementWithScroll(textBookWithHotelLocator);
        Assert.assertTrue(textBookHotel(),"Text is not displayed");
        return false;
    }
    public boolean cancellationIsDisplayed(){
        isWebElementEnabled(clickOnCancellationLocator);
      Assert.assertTrue(cancellationIsDisplayed(),"Free cancellation is not Displayed");
        return false;
    }
    public boolean priceGuaranteeDisplayed(){
     isWebElementDisplayed(priceGuaranteeLocator);
     Assert.assertTrue(priceGuaranteeDisplayed(),"Text not displayed");
     return false;
    }

    public boolean nightRewardIsDisplayed(){
        isWebElementDisplayed(rewardNightLocator);
        Assert.assertTrue(nightRewardIsDisplayed(),"Text is displayed");
        return false;
    }
    public void clickPriceGuaranteeDisplayed() {
        clickThis(priceGuaranteeLocator);
    }
    public boolean textPriceGuaranteeDisplayed(){

        isWebElementDisplayed(textPriceGuaranteeLocator);
        Assert.assertTrue(textPriceGuaranteeDisplayed(),"Text not displayed");
    return false;

    }
      public void backToHotelsPage(){
        clickThis(goBackMainPageLocator);
        moveMouseToElement(textBookWithHotelLocator);
    }
    public void clickOnRewardNight(){
        clickThis(rewardNightLocator);
    }
    public boolean instantSavingDisplayed(){
        Assert.assertTrue(instantSavingDisplayed(),"Text not displayed");
        return false;
    }

    }