package com.vaadin.testbenchexample;

import java.awt.*;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.formlayout.testbench.FormLayoutElement;
import com.vaadin.flow.component.html.testbench.DivElement;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import com.vaadin.testbench.IPAddress;
import com.vaadin.testbench.TestBenchElement;

public class AddFamilyIT extends BaseLoginTest {
	
	
	





	@Test

	public void addFamily() {

	//	getDriver().get( "http://localhost:8080/navy_webui/familyInsured" );
	//	getDriver().get( "http://" + IPAddress.findSiteLocalAddress() + ":8080/navy_webui/familyInsured");
		getDriver().get( "https://test.navymutual.calcfocus.net/policyadmin/familyInsured/" );
	//	getDriver().get("https://master.navymutual.calcfocus.net/policyadmin/familyInsured");
		AddFamilyView family = $( AddFamilyView.class ).first();
		family.addFamily(  );
		family.getGender().selectItemByIndex( 0 );
		family.getDateOfBirth().setDate( LocalDate.of( 1960, 10, 15 ) );
		family.getTobaccoUse().selectByText( "Tobacco" );
		family.getMilitaryStatus().selectItemByIndex( 1 );
		family.getMilitaryBranch().selectItemByIndex( 3 );
		family.getMilitaryRank().selectByText( "Major" );
		family.getMilitaryMemberStatus().selectItemByIndex( 1 );
		family.getVipStatus().click();
		family.getVaultDocuments().click();
		family.getEdelivery().click();
		family.getPhoneType1().selectItemByIndex( 1 );
		family.getPhoneType2().selectItemByIndex( 2 );
		family.getReturnedMail().click();
		family.getReceiveMarketing().click();
		family.getDateOfDeath().setDate( LocalDate.of( 2024,04,25 ) );
		family.getLastContactDate().setDate( LocalDate.of( 2024,03,25 ) );

		Assertions.assertEquals( "David", family.getFirstName().getValue() );
		Assertions.assertEquals( "Palmer", family.getLastName().getValue() );
		Assertions.assertEquals( "Male", family.getGender().getSelectedText() );
		Assertions.assertEquals( "10/15/1960", family.getDateOfBirth().getInputValue() );
//		family.getSaveButton().click();
	}

	@Test
	public void addSpouse (){

		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 5 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Palmer" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Palmer" ).click();

		ScenarioView addMember= $(ScenarioView.class).first();
		addMember.addMemberButton().click();
		AddFamilyView family = $( AddFamilyView.class ).first();
		family.getRelationship().selectByText( "Spouse/Partner" );
		family.addSpouse(  );
		family.getGender().selectItemByIndex( 1 );
		family.getDateOfBirth().setDate( LocalDate.of( 1965, 01, 05 ) );
		family.getNonTobacco().doubleClick();
		family.getMilitaryStatus().selectItemByIndex( 2 );
		family.getMilitaryBranch().selectItemByIndex( 2 );
		family.getMilitaryRank().selectByText( "General" );
		family.getMilitaryMemberStatus().selectItemByIndex( 2 );
		family.getVipStatus().click();
		family.getVaultDocuments().click();
		family.getEdelivery().click();
		family.getPhoneType1().selectItemByIndex( 2 );
		family.getPhoneType2().selectItemByIndex( 1 );
		family.getReturnedMail().click();
		family.getReceiveMarketing().click();
		Assertions.assertEquals( "Emma", family.getFirstName().getValue() );
		Assertions.assertEquals( "Spouse", family.getLastName().getValue() );
		Assertions.assertEquals( "Female", family.getGender().getSelectedText() );
		Assertions.assertEquals( "1/5/1965", family.getDateOfBirth().getInputValue() );
		family.getSaveButton().click();
		family.FamilyButton().click();
	//	NaviMenuView getFamilybutton = $( NaviMenuView.class ).first();
	//	getFamilybutton.getFamily().click();
		ScenarioView deleteMember= $(ScenarioView.class).first();
		deleteMember.getDeleteSpouseButton().click();
		VaadinConfirmDialogView deleteSpouse = $(VaadinConfirmDialogView.class).first();
		deleteSpouse.getSaveButton().click();

	}

	@Test
	public void addBank() throws InterruptedException {

		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 5 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Palmer" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Palmer" ).click();
		ScenarioView editMember= $(ScenarioView.class).first();
		editMember.getEditFamilyButton().click();
		NaviMenuView getBank = $( NaviMenuView.class ).first();
		getBank.getBankInformation().click();
		AddFamilyView addBankAccount = $(AddFamilyView.class).first();
		addBankAccount.addBankButton().click();
		EntryDialogContent bankAccount =$(EntryDialogContent.class).first();
		bankAccount.addAccount( "Bank of America","David","Palmer","1234566789","051000017" );
        bankAccount.getPartyType().selectByText( "Individual" );
		bankAccount.getAccountType().selectByText( "Checking" );
		Assertions.assertEquals( "Bank of America",bankAccount.getFinancialInstitutionName().getValue() );
		Assertions.assertEquals( "**********",bankAccount.getAccountNumber().getValue() );
		Assertions.assertEquals( "051000017",bankAccount.getRoutingNumber().getValue() );
		Assertions.assertEquals( "Individual",bankAccount.getPartyType().getSelectedText() );
		Assertions.assertEquals( "Checking",bankAccount.getAccountType().getSelectedText() );
		bankAccount.okButton().click();

		AddFamilyView saveButton = $ (AddFamilyView.class).first();
		saveButton.getSaveButton().click();
//		EntryDialogContent confirm =$(EntryDialogContent.class).first();
//		confirm.closeButton().click();
		addBankAccount.deleteBankButton().click();
		saveButton.getSaveButton().click();
//		EntryDialogContent close =$(EntryDialogContent.class).first();
//		close.closeButton().click();
	}

	@Test

	public void familyAddress() throws InterruptedException {
	VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
    getSelectButton.getSelectItem().selectItemByIndex( 5 );
	SearchComponentView getFamily = $( SearchComponentView.class ).first();
	getFamily.searchByName().sendKeys( "Palmer" );
	getFamily.searchButton().click();
	getFamily.family().getCell( "Palmer" ).click();
	NaviMenuView getAddress = $(NaviMenuView.class).first();
    getAddress.getAddresses().click();
	ScenarioView addAddress = $(ScenarioView.class).first();
	addAddress.getAddButton().click();
	AddressView setAddress=$ (AddressView.class).first();
	setAddress.getCountry().selectByText( "USA" );
	setAddress.address( "74 River Street","25 Main Street","Norfolk","23503" );
	setAddress.getState().selectByText( "VA" );
	setAddress.getAddressType().selectItemByIndex( 1 );
	Assertions.assertEquals( "Mailing",setAddress.getAddressType().getSelectedText() );
	setAddress.getDefaultMailing().click();
//	setAddress.getDefaultBilling().click();
//	setAddress.getDefaultResidence().click();
	Assertions.assertEquals( "VA", setAddress.getState().getSelectedText());
	Assertions.assertEquals( "74 River Street", setAddress.getLine1().getValue());
	Assertions.assertEquals( "25 Main Street", setAddress.getLine2().getValue());
	Assertions.assertTrue( setAddress.getDefaultMailing().isChecked() );
//	Assertions.assertTrue( setAddress.getDefaultBilling().isChecked() );
//	Assertions.assertTrue( setAddress.getDefaultResidence().isChecked() );
	setAddress.getOkButton().click();
	addAddress.getSaveButton().click();
	addAddress.getDeleteButton().click();
	addAddress.getSaveButton().click();


}
	@Test

	public void editAddress() throws InterruptedException {

		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 5 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Palmer" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Palmer" ).click();
		NaviMenuView getAddress = $( NaviMenuView.class ).first();
		getAddress.getAddresses().click();
		ScenarioView edit = $( ScenarioView.class ).first();
		edit.getEditAddressButton().click();
		AddressView setAddress = $( AddressView.class ).first();
		setAddress.clearAddress();
		setAddress.address( "111 Main Street", "234 Street", "Norfolk", "23503" );
		setAddress.getState().selectByText( "VA" );
		setAddress.getDefaultBilling().click();
		setAddress.getDefaultResidence().click();
		Assertions.assertEquals( "VA", setAddress.getState().getSelectedText() );
		Assertions.assertEquals( "111 Main Street", setAddress.getLine1().getValue() );
		Assertions.assertEquals( "234 Street", setAddress.getLine2().getValue() );
		Assertions.assertTrue( setAddress.getDefaultBilling().isChecked() );
		Assertions.assertEquals( "23503",setAddress.getZip().getValue() );
		setAddress.getCancelButton().click();
	//	setAddress.getEditOkButton().click();
	//	edit.getSaveButton().click();

	}

	@Test
	public void addBeneficiary() throws InterruptedException {
		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 6 );
		SearchComponentView getPolicy = $( SearchComponentView.class ).first();
		getPolicy.searchByPolicy().sendKeys( "07671665" );
		getPolicy.searchButton().click();
		getPolicy.family().getCell( "07671665" ).click();
		NaviMenuView getBeneficiaries = $( NaviMenuView.class ).first();
		getBeneficiaries.beneficiaries().click();
		Thread.sleep( 3_000 );
		ScenarioView addBeneficiary = $(ScenarioView.class).first();
		addBeneficiary.getAddBeneButton().click();
		EntryDialogContent bene = $(EntryDialogContent.class).first();
		bene.selectBene().selectByText("Add New");
		bene.okButton().click();
		Thread.sleep( 3_000 );
		EntryDialogContent newBeneficiary =$(EntryDialogContent.class).first();
		newBeneficiary.addBeneficiary("Harry","Potter","253446453","test@yahoo.com","1234567890","987654321","test2@yahoo.com");
		newBeneficiary.dob().setDate( LocalDate.of( 1980, 8, 25 ) );
		newBeneficiary.gender().selectByText("Male");
		newBeneficiary.phoneType1().selectByText("Mobile");
		newBeneficiary.phoneType2().selectByText("Business");
		Assertions.assertEquals("Potter",newBeneficiary.lastName().getValue());
		Assertions.assertEquals("8/25/1980",newBeneficiary.dob().getInputValue());
		Assertions.assertEquals("253446453",newBeneficiary.ssn().getValue());
		Assertions.assertEquals("test@yahoo.com",newBeneficiary.email().getValue());
		Assertions.assertEquals("987654321",newBeneficiary.phone2().getValue());
		Assertions.assertEquals("Mobile",newBeneficiary.phoneType1().getSelectedText());
		newBeneficiary.okButton().click();
		ScenarioView beneficiary = $(ScenarioView.class).first();
		beneficiary.getSaveButton().click();
		Thread.sleep( 3_000 );
		VaadinConfirmDialogView confirm = $ (VaadinConfirmDialogView.class).first();
		confirm.getDeleteButton().click();
		ScenarioView deleteBeneficiary = $(ScenarioView.class).first();
		deleteBeneficiary.getDeleteBeneButton().click();
		deleteBeneficiary.getSaveButton().click();
		Thread.sleep( 3_000 );
		VaadinConfirmDialogView confirmDelete = $ (VaadinConfirmDialogView.class).first();
		confirmDelete.getDeleteButton().click();
		NaviMenuView family = $( NaviMenuView.class ).first();
		family.getFamily().click();
		ScenarioView getBeneficiary = $(ScenarioView.class).first();
		Assertions.assertTrue(getBeneficiary.family().getCell("Potter").isDisplayed());
		getBeneficiary.getDeleteFamilyBeneButton().click();
		VaadinConfirmDialogView delete = $(VaadinConfirmDialogView.class).first();
		delete.getSaveButton().click();
/*		getBeneficiary.policyNumber().getCell("07671665").click();

		family.beneficiaries().click();
		ScenarioView deleteBene =$(ScenarioView.class).first();
		deleteBene.getDeleteBeneButton().click();
		deleteBene.getSaveButton().click();
		Thread.sleep( 3_000 );
		VaadinConfirmDialogView ok = $ (VaadinConfirmDialogView.class).first();
		ok.getDeleteButton().click();
		ScenarioView deleteBene =$(ScenarioView.class).first();
		deleteBene.getDeleteBeneButton().click();


	}

	@Test
	public void addBeneficiaryMaster() throws InterruptedException {
		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 6 );
		SearchComponentView getPolicy = $( SearchComponentView.class ).first();
		getPolicy.searchByPolicy().sendKeys("424000006");
		getPolicy.searchButton().click();
		getPolicy.family().getCell("424000006").click();
		NaviMenuView getBeneficiaries = $( NaviMenuView.class ).first();
		getBeneficiaries.beneficiaries().click();
		Thread.sleep( 3_000 );
		ScenarioView addBeneficiary = $(ScenarioView.class).first();
		addBeneficiary.getAddBeneButton().click();
		EntryDialogContent bene = $(EntryDialogContent.class).first();
		bene.selectBene().selectByText("Add New");
		bene.okButton().click();
		Thread.sleep( 3_000 );
		EntryDialogContent newBeneficiary =$(EntryDialogContent.class).first();
		newBeneficiary.addBeneficiary("Harry","Potter","253446453","test@yahoo.com","1234567890","987654321","test2@yahoo.com");
		newBeneficiary.dob().setDate( LocalDate.of( 1980, 8, 25 ) );
		newBeneficiary.gender().selectByText("Male");
		newBeneficiary.phoneType1().selectByText("Mobile");
		newBeneficiary.phoneType2().selectByText("Business");
		Assertions.assertEquals("Potter",newBeneficiary.lastName().getValue());
		Assertions.assertEquals("8/25/1980",newBeneficiary.dob().getInputValue());
		Assertions.assertEquals("253446453",newBeneficiary.ssn().getValue());
		Assertions.assertEquals("test@yahoo.com",newBeneficiary.email().getValue());
		Assertions.assertEquals("987654321",newBeneficiary.phone2().getValue());
		Assertions.assertEquals("Mobile",newBeneficiary.phoneType1().getSelectedText());
		newBeneficiary.okButton().click();
		ScenarioView beneficiary = $(ScenarioView.class).first();
		beneficiary.getSaveButton().click();
		Thread.sleep( 3_000 );
		VaadinConfirmDialogView confirm = $ (VaadinConfirmDialogView.class).first();
		confirm.getDeleteButton().click();
		NaviMenuView family = $( NaviMenuView.class ).first();
		family.getFamily().click();
		ScenarioView getBeneficiary = $(ScenarioView.class).first();
		Assertions.assertTrue(getBeneficiary.family().getCell("Potter").isDisplayed());
		getBeneficiary.getDeleteFamilyBeneButton().click();
		VaadinConfirmDialogView delete = $(VaadinConfirmDialogView.class).first();
		delete.getSaveButton().click();
		getBeneficiary.policyNumber().getCell("424000006").click();
		family.beneficiaries().click();
		ScenarioView deleteBene =$(ScenarioView.class).first();
		deleteBene.getDeleteBeneButtonMaster().click();
		deleteBene.getSaveButton().click();
		Thread.sleep( 3_000 );
		VaadinConfirmDialogView ok = $ (VaadinConfirmDialogView.class).first();
		ok.getDeleteButton().click();
//		ScenarioView deleteBene =$(ScenarioView.class).first();
//		deleteBene.getDeleteBeneButton().click();
	}

/*
	@Test

	public void deleteAddress() {


		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 4 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Mouse" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Mouse" ).click();
		NaviMenuView getAddress = $( NaviMenuView.class ).first();
		getAddress.getAddresses().click();
		ScenarioView delete = $( ScenarioView.class ).first();
		delete.getDeleteButton().click();
		delete.getSaveButton().click();
	}
*/
}





