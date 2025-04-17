package com.vaadin.testbenchexample;
import com.vaadin.flow.component.datepicker.testbench.DatePickerElement;
import com.vaadin.flow.component.select.testbench.SelectElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLTableSectionElement;

import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.grid.testbench.GridElement;
import com.vaadin.flow.component.progressbar.testbench.ProgressBarElement;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.elementsbase.Element;

import javassist.bytecode.stackmap.TypeData;

@Element( "scenario-view" )

public class ScenarioView extends TestBenchElement {

	// addButtons

	protected ButtonElement getAddButton() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "saveable-page" ).first().$( TestBenchElement.class ).id( "S1" ).$( TestBenchElement.class ).id( "FamilyAddressTable" ).$( ButtonElement.class ).first();

	}
	protected ButtonElement getAddBeneButton() {

		return $(TestBenchElement.class).id("viewContent").$("scenario-component").first().$(TestBenchElement.class).id("fieldLayout").$("saveable-page").first().$(TestBenchElement.class).id("S0").$(TestBenchElement.class).id("BeneficiaryTable").$(ButtonElement.class).get(1);

	}
	protected ButtonElement addMemberButton() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "family-member-page" ).first().$( TestBenchElement.class ).id( "Members" ).$( ButtonElement.class ).first();
	}
	protected ButtonElement getAddOtherRolesButton() {

		return $(TestBenchElement.class).id("viewContent").$("scenario-component").first().$(TestBenchElement.class).id("fieldLayout").$("saveable-page").first().$(TestBenchElement.class).id("S0").$(TestBenchElement.class).id("RoleTable").$(ButtonElement.class).first();

	}
	protected ButtonElement getSaveButton() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "saveable-page" ).first().$( ButtonElement.class ).first();

	}
	protected ButtonElement getEditAddressButton() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "saveable-page" ).first().$( TestBenchElement.class ).id( "S1" ).$( TestBenchElement.class ).id( "FamilyAddressTable" ).$( ButtonElement.class ).get( 1 );
	}
	protected ButtonElement getEditFamilyButton() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "family-member-page" ).first().$( TestBenchElement.class ).id( "Members" ).$( TestBenchElement.class ).id( "section" ).$( "search-component" ).first().$( ButtonElement.class ).first();
	}

	// DeleteButtons

	protected ButtonElement getDeleteSpouseButton() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "family-member-page" ).first().$( TestBenchElement.class ).id( "Members" ).$( TestBenchElement.class ).id( "section" ).$( "search-component" ).first().$( ButtonElement.class ).get( 4 );
	}
	protected ButtonElement getDeleteBeneButton() {

		return $(TestBenchElement.class).id("viewContent").$("scenario-component").first().$(TestBenchElement.class).id("fieldLayout").$("saveable-page").first().$(TestBenchElement.class).id("S0").$(TestBenchElement.class).id("BeneficiaryTable").$(TestBenchElement.class).id("grid").$(ButtonElement.class).get(7);
	}
	protected ButtonElement getDeleteBeneButtonMaster() {

		return $(TestBenchElement.class).id("viewContent").$("scenario-component").first().$(TestBenchElement.class).id("fieldLayout").$("saveable-page").first().$(TestBenchElement.class).id("S0").$(TestBenchElement.class).id("BeneficiaryTable").$(TestBenchElement.class).id("grid").$(ButtonElement.class).get(3);
	}
	protected ButtonElement getDeleteButton() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "saveable-page" ).first().$( TestBenchElement.class ).id( "S1" ).$( TestBenchElement.class ).id( "FamilyAddressTable" ).$( ButtonElement.class ).get( 2 );
	}
	protected ButtonElement getDeleteFamilyOwner() {

		return $(TestBenchElement.class).id("viewContent").$("scenario-component").first().$(TestBenchElement.class).id("fieldLayout").$("family-member-page").first().$(TestBenchElement.class).id("membersDiv").$(TestBenchElement.class).id("Members").$(TestBenchElement.class).id("section").$("search-component").first().$(ButtonElement.class).get(4);
	}
	protected ButtonElement getDeleteRoleButton() {

		return $(TestBenchElement.class).id("viewContent").$("scenario-component").first().$(TestBenchElement.class).id("fieldLayout").$("saveable-page").first().$(TestBenchElement.class).id("S0").$(TestBenchElement.class).id("RoleTable").$(TestBenchElement.class).id("grid").$(ButtonElement.class).get(2);
	}
	protected ButtonElement getDeleteFamilyOther() {

		return $(TestBenchElement.class).id("viewContent").$("scenario-component").first().$(TestBenchElement.class).id("fieldLayout").$("family-member-page").first().$(TestBenchElement.class).id("membersDiv").$(TestBenchElement.class).id("Members").$(TestBenchElement.class).id("section").$("search-component").first().$(ButtonElement.class).get(7);
	}
	protected ButtonElement getDeleteFamilyBeneButton() {

		return $(TestBenchElement.class).id("viewContent").$("scenario-component").first().$(TestBenchElement.class).id("fieldLayout").$("family-member-page").first().$(TestBenchElement.class).id("membersDiv").$(TestBenchElement.class).id("Members").$(TestBenchElement.class).id("section").$("search-component").first().$(ButtonElement.class).get(4);
	}




	// Transactions

	protected DatePickerElement date (){
		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$("transactions-view-page").first().$(DatePickerElement.class).first();
	}
	protected ButtonElement cycle (){
		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$("transactions-view-page").first().$(ButtonElement.class).last();
	}
	protected ButtonElement processActivateTransactionButton() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "transactions-view-page" ).first().$( TestBenchElement.class ).id( "content" ).$( "search-component" ).first().$( ButtonElement.class ).get( 6 );
	}
	protected ButtonElement processSuspenseTransactionButton() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "transactions-view-page" ).first().$( TestBenchElement.class ).id( "content" ).$( "search-component" ).first().$( ButtonElement.class ).get( 6 );
	}
	protected ButtonElement processInitialPremiumTransactionButton() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "transactions-view-page" ).first().$( TestBenchElement.class ).id( "content" ).$( "search-component" ).first().$( ButtonElement.class ).get( 2 );
	}
	protected  ProgressBarElement progressBar() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "transactions-view-page" ).first().$( ProgressBarElement.class ).first();
	}
	protected ButtonElement reverseActivateTransactionButtonFPRA(){
		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "transactions-view-page" ).first().$( TestBenchElement.class ).id( "content" ).$( "search-component" ).first().$( ButtonElement.class ).get( 3 );
	}
	protected ButtonElement reverseActivateTransactionButtonSPIA(){
		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "transactions-view-page" ).first().$( TestBenchElement.class ).id( "content" ).$( "search-component" ).first().$( ButtonElement.class ).get( 3 );
	}
	protected WebElement policyStatus() { return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "titleLayout").$( TestBenchElement.class).id( "summaryTable").$( TestBenchElement.class).id( "componentContent" ).findElements( By.className( "summary-column-value" )).get( 3 );
	}
	protected WebElement policyPaidToDate() {
		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "titleLayout").$( TestBenchElement.class).id( "summaryTable").$( TestBenchElement.class).id( "componentContent" ).findElements( By.className( "summary-column-value" )).get( 8 );
	}
	protected ButtonElement addTransactionButton(){
		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "transactions-view-page").first().$(TestBenchElement.class).id( "toolbar" ).$(ButtonElement.class).first();
	}
	protected ButtonElement reverseAddRiderTransactionButton(){
		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "transactions-view-page" ).first().$( TestBenchElement.class ).id( "content" ).$( "search-component" ).first().$( ButtonElement.class ).get( 1 );
	}
	protected WebElement modalPremium() {
		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "titleLayout").$( TestBenchElement.class).id( "summaryTable").$( TestBenchElement.class).id( "componentContent" ).findElements( By.className( "summary-column-value" )).get( 7 );
	}

	// FamilyPage

	protected GridElement applicationNumber() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "family-member-page" ).first().$( TestBenchElement.class ).id( "applicationsDiv" ).$( TestBenchElement.class ).id( "Members" ).$( TestBenchElement.class ).id( "section" ).$( "search-component" ).first().$( GridElement.class ).first();
	}
	protected GridElement illustrationNumber() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "family-member-page" ).first().$( TestBenchElement.class ).id( "illustrationsDiv" ).$( TestBenchElement.class ).id( "Members" ).$( TestBenchElement.class ).id( "section" ).$( "search-component" ).first().$( GridElement.class ).first();
	}

	protected GridElement policyNumber() {

		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "family-member-page" ).first().$( TestBenchElement.class ).id( "policiesDiv" ).$( TestBenchElement.class ).id( "Members" ).$( TestBenchElement.class ).id( "section" ).$( "search-component" ).first().$( GridElement.class ).first();
	}

	protected GridElement family (){
		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "family-member-page" ).first().$( TestBenchElement.class ).id( "membersDiv" ).$( TestBenchElement.class ).id( "Members" ).$( TestBenchElement.class ).id( "section" ).$( "search-component" ).first().$(GridElement.class).first();
	}



	//loan
	protected ButtonElement viewLoanTransactionButton(){
		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "transactions-view-page" ).first().$( TestBenchElement.class ).id( "content" ).$( "search-component" ).first().$( ButtonElement.class ).get( 2 );
	}
	protected TextFieldElement loanBalance (){
		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$(TestBenchElement.class).id( "ValuesSection" ).$(TextFieldElement.class).id( "LoanBalance" );
	}
	protected ButtonElement deleteLoanTransactionButton(){
		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "transactions-view-page" ).first().$( TestBenchElement.class ).id( "content" ).$( "search-component" ).first().$( ButtonElement.class ).get( 3 );
	}
	protected ButtonElement reverseLoanTransactionButton(){
		return $( TestBenchElement.class ).id( "viewContent" ).$( "scenario-component" ).first().$( TestBenchElement.class ).id( "fieldLayout" ).$( "transactions-view-page" ).first().$( TestBenchElement.class ).id( "content" ).$( "search-component" ).first().$( ButtonElement.class ).get( 1 );
	}






	//owner
	protected ButtonElement newOwner() {
		return $(TestBenchElement.class).id("viewContent").$("scenario-component").first().$(TestBenchElement.class).id("fieldLayout").$("saveable-page").first().$(TestBenchElement.class).id("OwnerSection").$(TestBenchElement.class).id("OwnerDialog").$(ButtonElement.class).first();
	}
	protected SelectElement ownerGUID() {
		return $(TestBenchElement.class).id("viewContent").$("scenario-component").first().$(TestBenchElement.class).id("fieldLayout").$("saveable-page").first().$(TestBenchElement.class).id("OwnerSection").$(SelectElement.class).id("OwnerGUID");
	}
}



