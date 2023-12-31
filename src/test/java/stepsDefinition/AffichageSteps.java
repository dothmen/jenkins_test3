package stepsDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AffichagePage;

public class AffichageSteps {
	WebDriver driver = Hooks.driver;
	AffichagePage display = new AffichagePage(driver);

	@Given("the administrator click on connexion icon")
	public void the_administrator_click_on_connexion_icon() {
		driver.navigate().to("http://10.4.1.137/frontend/");
		display.clickonconnexionIcon();
	}

	@Given("^enters(.*)and(.*)$")
	public void enters_email_and_password_email_and_password(String email, String password ) {
		display.entersUsername(email);
		display.entersPassword(password);
		
	}

	@Given("clicks on identify button")
	public void clicks_on_identify_button() {
		display.clickonidentifybutton();
	}

	@When("clicks on the details icon")
	public void clicks_on_the_details_icon() {
	    display.clickondetailIcon();
	}

	@When("clicks on Evalution icon")
	public void clicks_on_evalution_icon() {
		display.clickonEvalutionIcon();
	}

	@Then("check that evalutions are displayed")
	public void check_that_evalutions_are_displayed() {
		display.checkEvaluation();
	}

}