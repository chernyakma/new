package com.vaadin.testbenchexample;
import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.textfield.testbench.PasswordFieldElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import com.vaadin.testbench.HasStringValueProperty;
import com.vaadin.testbench.Parameters;
import com.vaadin.testbench.TestBenchTestCase;

import org.junit.After;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;

public abstract class BaseLoginTest extends TestBenchTestCase {


	@Before
	public void setUp() {
		setDriver(new ChromeDriver());  // Initialize the WebDriver
		performLogin();  // Perform login before each test
		Parameters.setScreenshotReferenceDirectory( "src/test/screenshots");
		Parameters.setScreenshotComparisonTolerance(1.0);
		driver.manage().window().setSize( new Dimension( 1024, 768));
		Parameters.setScreenshotRetryDelay(10);
		Parameters.setScreenshotComparisonCursorDetection(true);
	}


	@After
	public void tearDown() throws Exception {
		// close the browser instance when all tests are done
		getDriver().quit();
	}

	private void performLogin() {
		// Navigate to the login page
		getDriver().get("http://localhost:8080/navy_webui/");


		$( TextFieldElement.class).first().setValue( "jBond");  // Enter username
		$( PasswordFieldElement.class).first().setValue( "JBond007");  // Enter password
		$( ButtonElement.class).first().click();  // Click the login button
	}
}

