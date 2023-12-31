package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepsDefinition.Hooks;

public class AffichagePage {
	WebDriver driver = Hooks.driver;
	
    
	By connexionIcon = By.xpath("//span[normalize-space()='CONNEXION']");
	By textUsername = By.xpath("//input[@id='email']");
	By textPassword = By.xpath("//input[@id='password']");
	By identifyButton = By.xpath("//button[@class='p-element w-full p-button p-component']");
	By detailIcon = By.xpath("//body[1]/app-root[1]/app-admin[1]/app-dashboard-admin[1]/div[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/p-button[1]/button[1]/span[1]");
	By EvalutionIcon = By.xpath("//span[normalize-space()='Evaluations']");
	By checkEvaluation = By.xpath("//body[1]/app-root[1]/app-admin[1]/app-sessiondetails[1]/div[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[3]/div[1]/p-table[1]/div[1]/div[2]/table[1]/thead[1]/tr[1]/th[3]");

	public AffichagePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickonconnexionIcon() {
		driver.findElement(connexionIcon).click();
	}

	public void entersUsername(String email) {
		driver.findElement(textUsername).sendKeys(email);
	
	}
	public void entersPassword(String password) {
		driver.findElement(textPassword).sendKeys(password);
	}

	public void clickonidentifybutton() {
		driver.findElement(identifyButton).click();

	}

	public void clickondetailIcon() {
		driver.findElement(detailIcon).click();
	}

	public void clickonEvalutionIcon() {
		driver.findElement(EvalutionIcon).click();
	}

	public void checkEvaluation() {
		driver.findElement(checkEvaluation).isDisplayed();
	}
}
