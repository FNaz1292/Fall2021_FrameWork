package Tests.Hotels;

import Pages.Hotels.LaunchPage;
import Web.UseDriver;
import org.testng.annotations.Test;

public class monthVerification {
    @Test
    public void monthVerification(){
        UseDriver.openUrl("https://www.hotels.com/");
        LaunchPage lp = new LaunchPage();

    }
}
