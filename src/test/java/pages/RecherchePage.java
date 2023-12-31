package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepsDefinition.Hooks;

public class RecherchePage {
	WebDriver driver = Hooks.driver;
	By locatesearch = By.xpath("//p-tabpanel[@header='Evaluations']//input[@placeholder='Recherche']");
	By checksearch = By.xpath("//body[1]/app-root[1]/app-admin[1]/app-sessiondetails[1]/div[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[3]/div[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]");
	By checksearchModule =By.xpath("//body[1]/app-root[1]/app-admin[1]/app-sessiondetails[1]/div[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[3]/div[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]");
	By checksearchEvaluation= By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]");
	public RecherchePage(WebDriver driver) {
		this.driver = driver;
	}
	public void locatesearch() {
		driver.findElement(locatesearch).click();
	}
	public void writeslecon() {
		driver.findElement(locatesearch).sendKeys("Tester les APIs REST");
	}
	public void checksearch() {
		driver.findElement(checksearch).isDisplayed();
	}
	public void clearsearch() {
		driver.findElement(locatesearch).clear();
	}
	public void writesModule	() {
		driver.findElement(locatesearch).sendKeys("notions avancées");
	}
	public void checksearchModule() {
		driver.findElement(checksearchModule).isDisplayed();
	}
	public void writesscoreEvaluation () {
		driver.findElement(locatesearch).sendKeys("5votes");
	}
	public void checksearchscoreEvaluation () {
		driver.findElement(checksearchEvaluation).isDisplayed();
	}
	
	}
	


