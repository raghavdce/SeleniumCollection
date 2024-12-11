package com.jktech.POM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
	
	WebDriver ldriver;
	
	public LoginPageClass(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.ID, using ="user-name")
	public WebElement userName;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(id="login-button")
	public WebElement loginButton;
	
	@FindBy(xpath="//span[contains(text(),'Products')]")
	public WebElement homepage;
	
	@FindBy(xpath="//h3[@data-test=\"error\"]")
	public WebElement errorText;
	
	
	
	
	public boolean errorMessage() {
		boolean flag = errorText.isDisplayed();
		return flag;
	}
	
	
	public void setUserName(String name) {
		userName.sendKeys(name);
	}
	
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	
	public String pageTitle() {
		String title = ldriver.getTitle();
		return title;
	}
	
	public boolean homepage() {
		boolean flag = homepage.isDisplayed();
		return flag;
	}
	



}
