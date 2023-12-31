package stepsDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginationPage;

public class PaginationSteps {

	WebDriver driver = Hooks.driver;

	PaginationPage Pagination = new PaginationPage(driver);

	@When("click on next icon page")
	public void click_on_next_icon_page() {
		Pagination.clickonPaginationIcon2();
	}

	@Then("verify that the next page  is displayed")
	public void verify_that_the_next_page_is_displayed() {
		Pagination.checktextpage2();
	}

	@When("click on filter {int}")
	public void click_on_filter(Integer int1) {
		Pagination.clickonfilterIcon();
	}

	@Then("check that the page only contains the selected number of evalutions")
	public void check_that_the_page_only_contains_the_selected_number_of_evalutions() {
		Pagination.checkfilterpage();
	}

	@When("click on the left icon to return to the previous page")
	public void click_on_the_left_icon_to_return_to_the_previous_page() {
		Pagination.clickonleftIcon();
	}

	@Then("check that the previous page is display")
	public void check_that_the_previous_page_is_display() {
		Pagination.textcheckpreviouspage();
	}

	@When("click on the right icon to go to the next page")
	public void click_on_the_right_icon_to_go_to_the_next_page() {
		Pagination.clickonrightIcon();
	}

	@Then("check that the next page is display")
	public void check_that_the_next_page_is_display() {
		Pagination.textchecknextpage();
	}

}