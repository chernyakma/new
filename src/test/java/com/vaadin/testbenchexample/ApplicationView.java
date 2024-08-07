package com.vaadin.testbenchexample;
import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.combobox.testbench.ComboBoxElement;
import com.vaadin.flow.component.datepicker.testbench.DatePickerElement;
import com.vaadin.flow.component.grid.testbench.GridElement;
import com.vaadin.flow.component.radiobutton.testbench.RadioButtonGroupElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.elementsbase.Element;
import java.util.Random;

@Element( "application-view" )
public class ApplicationView extends TestBenchElement {

	protected RadioButtonGroupElement applicationReceived(){
		return $(TestBenchElement.class).id( "viewContent" ).$( "scenario-component" ).first().$(TestBenchElement.class).id("fieldLayout").$( "saveable-page" ).first().$(TestBenchElement.class).id("Application").$(RadioButtonGroupElement.class).id( "ApplicationReceivedIndicator" );
	}
	protected DatePickerElement applicationReceivedDate(){
		return $(TestBenchElement.class).id( "viewContent" ).$( "scenario-component" ).first().$(TestBenchElement.class).id("fieldLayout").$( "saveable-page" ).first().$(TestBenchElement.class).id("Application").$(DatePickerElement.class).id( "ApplicationReceivedDate" );

	}
	protected DatePickerElement applicationSignedDate(){
		return $(TestBenchElement.class).id( "viewContent" ).$( "scenario-component" ).first().$(TestBenchElement.class).id("fieldLayout").$( "saveable-page" ).first().$(TestBenchElement.class).id("Application").$(DatePickerElement.class).id( "ApplicationSignedDate" );

	}
	protected ButtonElement saveButton (){
		return $(TestBenchElement.class).id( "viewContent" ).$( "scenario-component" ).first().$(TestBenchElement.class).id("fieldLayout").$( "saveable-page" ).first().$(ButtonElement.class).first();
	}
	protected RadioButtonGroupElement applicationFundsReceived(){
		return $(TestBenchElement.class).id( "viewContent" ).$( "scenario-component" ).first().$(TestBenchElement.class).id("fieldLayout").$( "saveable-page" ).first().$(TestBenchElement.class).id("InitialPayment").$(RadioButtonGroupElement.class).id( "ApplicationFundsReceivedIndicator" );
	}
	protected RadioButtonGroupElement cashWithApplication(){
		return $(TestBenchElement.class).id( "viewContent" ).$( "scenario-component" ).first().$(TestBenchElement.class).id("fieldLayout").$( "saveable-page" ).first().$(TestBenchElement.class).id("InitialPayment").$(RadioButtonGroupElement.class).id( "CashReceivedWithApplicationIndicator" );
	}
	protected DatePickerElement cashWithApplicationReceivedDate(){
		return $(TestBenchElement.class).id( "viewContent" ).$( "scenario-component" ).first().$(TestBenchElement.class).id("fieldLayout").$( "saveable-page" ).first().$(TestBenchElement.class).id("InitialPayment").$(DatePickerElement.class).id( "CashWithApplicationReceivedDate" );

	}
	protected ButtonElement threeDotsButton (){
		return $(TestBenchElement.class).id( "viewContent" ).$( "scenario-component" ).first().$(TestBenchElement.class).id("annotate").$(ButtonElement.class).first();
	}
	protected ButtonElement addSuspense (){
		return $(TestBenchElement.class).id( "viewContent" ).$( "scenario-component" ).first().$(TestBenchElement.class).id("fieldLayout").$("suspense-page").first().$(ButtonElement.class).first();
	}
	protected ButtonElement issueButton (){
		return $(TestBenchElement.class).id( "viewContent" ).$( "scenario-component" ).first().$(ButtonElement.class).last();
	}

	protected GridElement missingRequiredDocument() { return $(TestBenchElement.class).id( "viewContent" ).$( "scenario-component" ).first().$(TestBenchElement.class).id("fieldLayout").$("igo-check-page").first().$(TestBenchElement.class).id("pageContent").$(GridElement.class).first();}

	//WL
	protected ComboBoxElement getAgentNumber(){
		return $(TestBenchElement.class).id( "viewContent" ).$( "scenario-component" ).first().$(TestBenchElement.class).id("fieldLayout").$("saveable-page").first().$(TestBenchElement.class).id("Agent").$(TestBenchElement.class).id( "section" ).$( ComboBoxElement.class ).first();
	}
	protected TextFieldElement getCaseNumber(){
		return $(TestBenchElement.class).id( "viewContent" ).$( "scenario-component" ).first().$(TestBenchElement.class).id("fieldLayout").$( "saveable-page" ).first().$(TestBenchElement.class).id("Application").$(TestBenchElement.class).id( "section" ).$(TextFieldElement.class).id( "PolicyNumber" );
	}


	public void addRundomCaseNumber (){
		Random random = new Random();
		int randomNumber = 100000000 + random.nextInt(900000000);  // Generate a random number between 100000000 and 900000000
		getCaseNumber().sendKeys( String.valueOf(randomNumber) );
	}
}
