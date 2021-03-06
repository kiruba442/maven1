package test;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import library.Basetest;
import pom.Googlepo;
import pom.Searchpo;
public class Test1 extends Basetest {
	public static WebDriverWait wait;
	@Test(priority=1)
	public void testFacebookHome() {
   wait=new WebDriverWait(driver, 20);
	driver.get("https://www.google.com/");
	Googlepo g=new Googlepo(driver);
	g.searchTxtBx().sendKeys(("facebook")+Keys.ENTER);
	Searchpo s= new Searchpo(driver);
	s.verifyElement(s.facebookLink());
	s.facebookLink().click();
	System.out.println(driver.getTitle());
	String eTitle = "Facebook � log in or sign up1";
	wait.until(ExpectedConditions.titleContains(eTitle));
    String aTitle = driver.getTitle();
    Reporter.log("title is displayed "+aTitle,true);
	Assert.assertEquals(aTitle,eTitle);
		}
	@Test(priority=2)
	public void testinstagramHome() {
   wait=new WebDriverWait(driver, 20);
	driver.get("https://www.google.com/");
	Googlepo g=new Googlepo(driver);
	g.searchTxtBx().sendKeys(("instagram")+Keys.ENTER);
	Searchpo s= new Searchpo(driver);
    s.verifyElement(s.instaLink());
	s.instaLink().click();
	System.out.println(driver.getTitle());
	String eTitle = "Instagram1";
	wait.until(ExpectedConditions.titleContains(eTitle));
    String aTitle = driver.getTitle();
    Reporter.log("title is displayed "+aTitle,true);
	Assert.assertEquals(aTitle,eTitle);
		}
	@Test(priority=3)
	public void testtwitterHome() {
   wait=new WebDriverWait(driver, 20);
	driver.get("https://www.google.com/");
	Googlepo g=new Googlepo(driver);
	g.searchTxtBx().sendKeys(("twitter")+Keys.ENTER);
	Searchpo s= new Searchpo(driver);
	System.out.println(driver.getTitle());
	String eTitle = "Login on Twitter1";
	wait.until(ExpectedConditions.titleContains(eTitle));
    String aTitle = driver.getTitle();
    Reporter.log("title is displayed "+aTitle,true);
	Assert.assertEquals(aTitle,eTitle);
	}
	@Test(priority=4)
	public void testlinkedinHome() {
   wait=new WebDriverWait(driver, 20);
	driver.get("https://www.google.com/");
	Googlepo g=new Googlepo(driver);
	g.searchTxtBx().sendKeys(("linkedin")+Keys.ENTER);
	Searchpo s= new Searchpo(driver);
	s.verifyElement(s.linkedinLink());
	s.linkedinLink().click();
	System.out.println(driver.getTitle());
	String eTitle = "Sign Up | LinkedIn3";
	wait.until(ExpectedConditions.titleContains(eTitle));
    String aTitle = driver.getTitle();
    Reporter.log("title is displayed "+aTitle,true);
	Assert.assertEquals(aTitle,eTitle);
	}
}
	

