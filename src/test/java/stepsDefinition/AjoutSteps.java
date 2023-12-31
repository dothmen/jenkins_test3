package stepsDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AjouterPage;

public class AjoutSteps {
	WebDriver driver = Hooks.driver;
	AjouterPage Add = new AjouterPage(driver);

	@When("the administrator click on cursus Icon")
	public void the_administrator_click_on_cursus_icon() {
		Add = new AjouterPage(driver);
		Add.clickoncursusIcon();
	}

	@When("click on edit content")
	public void click_on_edit_content() {
		Add.clickoneditcontentIcon();
	}

	@When("click on ajouter button")
	public void click_on_ajouter_button() {
		Add.clickonajouterbutton();
	}

	@When("^complete the form(.*)and(.*)and(.*)and(.*)and(.*)and(.*)$")
	public void complete_the_form_Titre_and_Référence_and_Description_and_instruction_module_and_Type_and_Durée(String Titre, String Référence, String Description, String instruction_Module,
			String Type, String Durée) {
		Add.entersTitre(Titre);
		Add.entersRéférence(Référence);
		Add.entersDescription(Description);
		Add.entersinstructionmodule(instruction_Module);
		Add.entersType(Type);
		Add.entersDurée(Durée);
		
	}

	@When("click add button")
	public void click_add_button() {
		Add.clickonajouterButton();
	}

	@Then("check that the addition is made")
	public void check_that_the_addition_is_made() {
		Add.checkaddModule();
	}
}
