package SIOT.Samsung.Test;


import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageTest extends BaseClass{
  public WebDriver driver;
  
  @Given("^user open SIOT Application$")
  public void user_open_SIOT_Application() throws Throwable {
      // Write code here that turns the phrase above into concrete actions
	  BaseClass.setUp();
  }
  @Then("^verify current URL$")
  public void verify_current_URL() throws Throwable {
	  homepage.getURL();
  }
	
@When("^user navigates to landing Screen and verify screen with below scenerios$")
	public void usernavigatestolandingScreen() throws Throwable {
	homepage.user_navigates_to_landing_Screen();
    
	}

@Then("^Verify food pillar$")
public void verifyfoodpillar() throws Throwable{
	homepage.verify_Food_Pillar();
}

@Then("^Verify fun pillar$")
public void verifyfunpillar() throws Throwable {
	homepage.verify_Fun_Pillar();

}

@Then("^verify family pillar$")
public void verify_family_pillar() throws Throwable {
	homepage.verify_Family_Pillar();
}
@And("^verify the Title of the page$")
public void verify_the_Title_of_the_page() throws Throwable {
	homepage.appTitle();

}



}
