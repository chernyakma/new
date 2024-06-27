
package com.vaadin.testbenchexample;
import java.time.Duration;

	import org.atmosphere.config.service.Get;
	import org.jsoup.nodes.Element;
	import org.junit.Assert;
	import org.junit.jupiter.api.AfterEach;
	import org.junit.jupiter.api.Assertions;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.platform.commons.function.Try;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.StaleElementReferenceException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import com.vaadin.flow.component.button.testbench.ButtonElement;
	import com.vaadin.flow.component.html.Div;
	import com.vaadin.flow.component.html.testbench.LabelElement;
	import com.vaadin.flow.component.orderedlayout.testbench.VerticalLayoutElement;
	import com.vaadin.flow.component.textfield.testbench.PasswordFieldElement;
	import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
	import com.vaadin.flow.dom.ShadowRoot;
	import com.vaadin.testbench.BrowserTest;
    import com.vaadin.testbench.BrowserTestBase;
	import com.vaadin.testbench.TestBenchElement;
	import com.vaadin.testbench.TestBenchTestCase;
	import com.vaadin.testbench.annotations.Attribute;

	import static org.junit.jupiter.api.Assertions.assertEquals;
	import java.time.Duration;
	import java.util.List;
	import org.openqa.selenium.JavascriptExecutor;


	public class SimpleIT extends BrowserTestBase {

		//	private Element ByShadow;

		@BrowserTest

		public void Login() throws InterruptedException {

			getDriver().get( "http://localhost:8080/navy_webui" );

			WebElement usernameFieldElement = findElement( By.id( "input-vaadin-text-field-6" ) );
			//	TextFieldElement getUsernameField = ( TextFieldElement )findElement( By.id( "input-vaadin-text-field-6" ) );
			usernameFieldElement.click();
			//	WebDriverWait wait = new WebDriverWait( getDriver(), Duration.ofSeconds( 10 ) );
			usernameFieldElement.sendKeys( "jBondProcessor" );
			//	WebDriverWait wait = new WebDriverWait( getDriver(), Duration.ofSeconds( 10 ) );
			WebElement passwordFieldElement = findElement( By.id( "input-vaadin-password-field-7" ) );
			passwordFieldElement.click();
			passwordFieldElement.sendKeys( "JBond007" );

			TestBenchElement loginButton = ( TestBenchElement )findElement( By.xpath( "//*[@part='vaadin-login-submit']" ) );
			loginButton.click();

			//JavascriptExecutor js = ( JavascriptExecutor )getDriver();

			//		try {
			// Navigate to the desired page
			//	getDriver().get( "http://localhost:8080/navy_webui/familyInsured" );

			getDriver().get( "http://localhost:8080/navy_webui/test" );
			WebElement lastNameFieldElement = findElement( By.id( "LastName" ) );
		//	WebDriverWait wait = new WebDriverWait( getDriver(), Duration.ofSeconds( 10 ) );
			lastNameFieldElement.click();
			lastNameFieldElement.sendKeys( "Brown" );
			//  WebDriverWait wait = new WebDriverWait( getDriver(), Duration.ofSeconds( 10 ) );
		//	Assertions.assertEquals( "Brown", lastNameFieldElement.getText() );

			WebElement firstNameFieldElement = findElement( By.id( "FirstName" ) );
			//	WebDriverWait wait = new WebDriverWait( getDriver(), Duration.ofSeconds( 10 ) );
			firstNameFieldElement.click();
			firstNameFieldElement.sendKeys( "Anna" );
		//	WebDriverWait wait = new WebDriverWait( getDriver(), Duration.ofSeconds( 10 ) );
		//	Assertions.assertEquals( "Anna", firstNameFieldElement.getText() );

			WebElement genderFieldElement = findElement( By.id( "Gender" ) );
			//	WebDriverWait wait = new WebDriverWait( getDriver(), Duration.ofSeconds( 10 ) );
			genderFieldElement.click();
			WebElement female = findElement( By.xpath( "//vaadin-select-item[@value='3']" ) );
			female.click();

			WebElement tobaccoUse = findElement( By.id( "TobaccoUse" ) );
			//	WebDriverWait wait = new WebDriverWait( getDriver(), Duration.ofSeconds( 10 ) );
			tobaccoUse.click();
			WebElement nonTobacco = findElement( By.xpath( "//vaadin-select-list-box//vaadin-select-item[@value='3']" ) );
			nonTobacco.click();
			WebDriverWait wait = new WebDriverWait( getDriver(), Duration.ofSeconds( 10 ) );
		//	Assertions.assertEquals( "Non-Tobacco", tobaccoUse.getText() );

			WebElement maritalStatus = findElement( By.id( "MaritalStatus" ) );
			//	WebDriverWait wait = new WebDriverWait( getDriver(), Duration.ofSeconds( 10 ) );
			maritalStatus.click();
			WebElement married = findElement( By.xpath( "//vaadin-select-list-box//vaadin-select-item[@value='2']" ) );
			married.click();
			//	WebDriverWait wait = new WebDriverWait( getDriver(), Duration.ofSeconds( 10 ) );
			Assertions.assertEquals( "Married", married.getText() );
		}}

			//	TextFieldElement getUsernameField = ( TextFieldElement )findElement( By.id( "input-vaadin-text-field-6" ) );
			//		WebDriverWait wait = new WebDriverWait( getDriver(), Duration.ofSeconds( 10 ) );
			//	usernameFieldElement.click();
			//	WebDriverWait wait = new WebDriverWait( getDriver(), Duration.ofSeconds( 10 ) );
			//	usernameFieldElement.sendKeys( "Anna" );

		//	try {
		//		WebElement firstName = findElement( By.id( "FirstName" ) );
		//		firstName.click();  // Example interaction
		//			} catch( StaleElementReferenceException e ) {
		//		// Retry finding the element
		//		WebElement firstName = findElement( By.id( "FirstName" ) );
		//		firstName.click();
			//	firstName.sendKeys( "Anna" );
			//	Assertions.assertEquals( "", firstName.getText() );

				//	try {
				//		WebElement lastName = findElement( By.id( "LastName" ) );
				//		lastName.click();  // Example interaction
				//	} catch( StaleElementReferenceException e ) {
				// Retry finding the element
				//		WebElement lastName = findElement( By.id( "LastName" ) );
				//		lastName.click();
				//		lastName.sendKeys( "Brown" );
				//		Assertions.assertEquals( "Brown", lastName.getText() );
				//	}

				//	JavascriptExecutor js = ( JavascriptExecutor )getDriver();
				//	WebElement shadowHost = waitUntil( ExpectedConditions.visibilityOfElementLocated( By.tagName( "family-insured-view" ) ) );

				//	WebElement shadowHost = findElement( By.tagName( "family-insured-view" ) );

				//		System.out.println( "Shadow host tag: " + shadowHost.getTagName() ); // Check if it's the right element

				//	Object shadowRootObject = js.executeScript( "return arguments[0].shadowRoot;", shadowHost );

				//	if (shadowRootObject == null) {
				//		throw new RuntimeException( "ShadowRoot not found." );
				//	}

				// 1. Initialize JavascriptExecutor

				//	if (shadowRootObject != null) {
				// 4. Locate the inner shadow host within the outer ShadowRoot
				//		Object innerShadowHost = js.executeScript("return arguments[0].querySelector('#scenarioComponent');", shadowRootObject);

				//		if (innerShadowHost != null) {
				// 5. Retrieve the inner ShadowRoot
				//			Object innerShadowRoot = js.executeScript("return arguments[0].shadowRoot;", innerShadowHost);

				//			if (innerShadowRoot != null) {
				// 6. Find and interact with elements inside the inner ShadowRoot
				//				Object targetElement = js.executeScript("return arguments[0].querySelector('#S0');", innerShadowRoot);

				//				if (targetElement instanceof WebElement) {
				//					WebElement webElement = (WebElement) targetElement;
				//					webElement.click(); // Example action
				//				} else {
				//					System.out.println("Target element not found.");
				//				}
				//			} else {
				//				System.out.println("Inner ShadowRoot not found.");
				//			}
				//		} else {
				//			System.out.println("Inner shadow host not found.");
				//		}
				//	} else {
				//		System.out.println("Outer ShadowRoot not found.");
				//	}

				//	WebElement shadowHost2 = findElement(By.xpath("/html/body/div[1]/flow-container-navywebui-1225767666/vaadin-app-layout/family-insured-view//div/scenario-component"));
				//	System.out.println( "Shadow host tag: " + shadowHost2.getTagName() );
				//	Object shadowRoot2 = js.executeScript("return arguments[0].shadowRoot;", shadowHost2);
				//	if (shadowRootObject instanceof WebElement) {
				//		WebElement shadowRoot = (WebElement) shadowRootObject;

				// Use JavaScript to query for elements inside the ShadowRoot
				//		Object rawElement = js.executeScript("return arguments[0].querySelector('#scenarioComponent');", shadowRoot);

				//	if (shadowRootObject instanceof Object) {
				// Query an element within the ShadowRoot
				//		Object innerElement = js.executeScript("return arguments[0].querySelector('[id=viewContent]');", shadowRootObject);

				//		if (innerElement instanceof WebElement) {
				//			WebElement webElement = (WebElement) innerElement;
				// Perform actions on the WebElement
				//	webElement.click(); // Example: click the element
				//		} else {
				//			System.out.println("Element not found in the ShadowRoot.");
				//		}
				//	} else {
				//		System.out.println("Invalid ShadowRoot type.");
				//	}

				//   WebElement shadowDom= findElement(By.id( "scenarioComponent" ));
				//	if (shadowRootObject != null) {
				// Get an element from within the ShadowRoot
				//		Object innerElement = js.executeScript("return arguments[0].querySelector('#scenarioComponent');", shadowRootObject);

				//		if (innerElement != null) {
				// Do something with the inner element
				//			WebElement webElement = (WebElement) innerElement;
				//			System.out.println("Inner element found: " + webElement.getText());
				//		} else {
				//			System.out.println("Inner element not found.");
				//		}
				//	} else {
				//		System.out.println("ShadowRoot not found.");
				//	}

				//	if( shadowRoot != null ) {
				// Example: Print the outer HTML of the ShadowRoot
				//	String shadowRootHTML = (String )js.executeScript( "return arguments[0].innerHTML;", shadowRoot );
				//	System.out.println( "ShadowRoot HTML: " + shadowRootHTML );

				// Example: Print all elements within the ShadowRoot
				//		List<Object> allElements = ( List<Object> )js.executeScript( "return arguments[0].querySelectorAll('*');", shadowRoot );

				//		for( Object element : allElements ) {
				//			WebElement webElement = ( WebElement )element;
				//			System.out.println( "Element: " + webElement.getTagName() + " | Text: " + webElement.getText() );
				//		}
				//	}  {
				//		System.out.println( "ShadowRoot not found." );
				//	}
				//}

				//		firstName.click();
				//		firstName.sendKeys( "Harry" );
				//		String inputValue = firstName.getAttribute( "value" ); // Retrieves the 'value' attribute

				// Assert that the text was successfully entered
				//	Assert.assertEquals( "The input field should contain the text 'Harry'", "Harry", inputValue );
				//	 wait =WebDriverWait new WebDriverWait( getDriver(), Duration.ofSeconds( 20 ) );

				//		WebElement middleName = findElement( By.id( "vaadin-text-input-field-48" ) );
				//		middleName.click();
				//		middleName.sendKeys( "A" );
				//		String inputValue2 = middleName.getAttribute( "value" ); // Retrieves the 'value' attribute

				// Assert that the text was successfully entered
				//		Assert.assertEquals( "A", "A", inputValue );

				//		WebElement lastName = findElement( By.id( "vaadin-text-input-field-49" ) ); // Locate an element within the Shadow DOM

				// Example interaction: Clicking a button inside the Shadow DOM
				//		firstName.click();
				//		firstName.sendKeys( "Potter" );
				//		String inputValue3 = lastName.getAttribute( "value" ); // Retrieves the 'value' attribute

				// Assert that the text was successfully entered
				//		Assert.assertEquals( "The input field should contain the text 'Potter'", "Potter", inputValue );

				//WebElement saveIcon = findElement(By.name("Save")); // Example: locating by ID
				//	TestBenchElement saveButton = ( TestBenchElement )findElement( By.xpath( "//vaadin-button[@name='Save']") ) ;
				// Assert that the "Save" icon is displayed
				//	Assert.assertTrue( "The 'Save' should be displayed", saveButton.isDisplayed());
				//}

				//	String expectedLoginPageUrl = "http://localhost:8080/navy_webui/familyInsured";
				//	String currentUrl = getDriver().getCurrentUrl();
				//	WebDriverWait wait = new WebDriverWait( getDriver(), Duration.ofSeconds( 10 ) );
				//Thread.sleep(3000);
				//	try {
				// Wait for at least one text field to be visible
				//		waitUntil( ExpectedConditions.visibilityOfElementLocated( By.id( "id=DateOfDeath") ) );
				//		System.out.println( "Page loaded. Proceeding with element location." );

				//		getDriver().quit(); // Cleanup
				//	}
				//}

				//	waitUntil( ExpectedConditions.visibilityOfElementLocated( By.className( "v-textfield" ) ) ); // Example class for text fields
				//	List<TextFieldElement> textFields = $( TextFieldElement.class ).all();
				//	if( textFields.isEmpty() ) {
				//		System.out.println( "No text fields found on the page." );
				//	} else {

				// Get the field's attributes
				//		for( TextFieldElement textField : textFields ) {
				//			String fieldId = textField.getAttribute( "id" ); // Get the field's ID
				//			String fieldName = textField.getAttribute( "name" ); // Get the field's name
				//			String fieldClass = textField.getAttribute( "class" ); // Get the field's CSS class
				//
				//						System.out.println( "Text Field Locator:" );
				//						System.out.println( "ID: " + ( fieldId != null ? fieldId : "Not set" ) );
				//						System.out.println( "Name: " + ( fieldName != null ? fieldName : "Not set" ) );
				//						System.out.println( "Class: " + ( fieldClass != null ? fieldClass : "Not set" ) );
				//						System.out.println( "---" );
				//					}
				//				}
				//			} finally {
				//				getDriver().quit(); // Cleanup
				//			}
				//		}
				//	}

				//	TextFieldElement firstName = $(TextFieldElement.class).id("FirstName");
				//	WebElement usernameNameFieldElement = findElement( By.name( "FirstName" ) );
				//	WebElement usernameNameFieldElement = findElement( By.id( "FirstName" ) );
				//   usernameNameFieldElement.click();
				//	usernameFieldElement.sendKeys( "Harry" );

				//	loginButton.click();
				//	WebElement selectFieldElement = findElement( By.xpath( "//div[@class='jumper']" ) );
				//	selectFieldElement.click();

				//	WebElement selectAddFamilyButton =(TestBenchElement ) findElement( By.xpath( "//vaadin-select-item[@value='3']" ) );
				//	WebDriverWait wait = new WebDriverWait( getDriver(), Duration.ofSeconds( 20 ) );
				//	waitUntil( ExpectedConditions.presenceOfElementLocated( By.xpath( "//vaadin-select-item[@value='3']")));

				//WebElement selectAddFamilyButton =(TestBenchElement ) findElement( By.xpath( "//vaadin-select-item[@value='3']" ) );
				//	WebElement selectAddFamilyButton =(TestBenchElement ) findElement( By.cssSelector( "vaadin-select-item[value='3'] div div" ) );
				//	selectAddFamilyButton.click();

				//		String currentUrl = getDriver().getCurrentUrl();

				//		String expectedLoginPageUrl = "http://localhost:8080/navy_webui/home";
				//			TestBenchElement microsoft = ( TestBenchElement )findElement(By.xpath( "//*[@class='logo']"));
				//	Assertions.assertEquals("microsoft", );
				//	assertEquals( expectedLoginPageUrl, currentUrl );

				//	private void assertEquals( String expectedLoginPageUrl, String currentUrl ) {




