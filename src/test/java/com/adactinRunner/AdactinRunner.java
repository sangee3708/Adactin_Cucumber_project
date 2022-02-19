package com.adactinRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseClass_Adactin.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactinFeatures\\adactinFile.feature", 
                     glue = "com\\adactinStepDefinition", 
               monochrome = true,
                   plugin = {"html:Report/AdactinReport",
                		   "pretty",
                		   "json:JsonReport/Adactin.json",
                		   "com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/AdactinExtentReport.html"}                   )

public class AdactinRunner extends BaseClass {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {

		driver = BaseClass.browserLaunch("chrome");

	}

	@AfterClass
	public static void tearDown() {

		BaseClass.quit();
	}
}
