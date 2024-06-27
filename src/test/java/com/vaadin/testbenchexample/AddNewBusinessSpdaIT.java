package com.vaadin.testbenchexample;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.vaadin.testbench.screenshot.ImageFileUtil;

public class AddNewBusinessSpdaIT extends BaseLoginTest {

	@Test
	public void addIllustration() throws InterruptedException {

		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 4 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Mouse" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Mouse" ).click();
		NaviMenuView newBusiness = $( NaviMenuView.class ).first();
		newBusiness.getNewBusiness().click();
		NewIllustrationView addNewBusiness = $( NewIllustrationView.class ).first();
		addNewBusiness.getProductType().selectByText( "Deferred Annuity" );
		addNewBusiness.getProduct().selectByText( "Single Premium Deferred Annuity" );
		addNewBusiness.getDepositAmount().sendKeys( Keys.chord( Keys.CONTROL, "a" ), "50000" );
		addNewBusiness.getRateLockPeriod().selectByText( "Seven Years" );
		addNewBusiness.getOkButton().click();
		IllustrationView illustration = $( IllustrationView.class ).first();
		illustration.getAgentNumber().openPopup();
		illustration.getAgentNumber().sendKeys( Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN );
		illustration.getAgentNumber().sendKeys( Keys.ENTER );
		Assertions.assertEquals( "NM001 - Navy Mutual Default Agent", illustration.getAgentNumber().getSelectedText() );
		//	illustration.getSaveButton().click();

	}

	@Test
	public void addApplication1() throws IOException {

		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 4 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Mouse" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Mouse" ).click();
		ScenarioView getApplication = $( ScenarioView.class ).first();
		getApplication.illustrationNumber().getCell( "424000190" ).click();
		NaviMenuView getReport = $( NaviMenuView.class ).first();
		getReport.getResult().click();
		IllustrationView apply = $( IllustrationView.class ).first();
		apply.getSaveButtonResult().click();
		apply.getApplyButtonResult().click();
		VaadinConfirmDialogView confirm = $( VaadinConfirmDialogView.class ).first();
		confirm.getDeleteButton().click();

	}

	@Test
	public void addApplication2() throws IOException, InterruptedException {

		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 4 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Mouse" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Mouse" ).click();
		ScenarioView getApplication = $( ScenarioView.class ).first();
		getApplication.applicationNumber().getCell( "424000190" ).click();
		ApplicationView application = $( ApplicationView.class ).first();
		application.applicationReceived().selectByText( "Yes" );
		Assertions.assertEquals( "Yes", application.applicationReceived().getSelectedText() );
		application.applicationReceivedDate().setDate( LocalDate.now() );
		application.applicationSignedDate().setDate( LocalDate.now() );
		application.applicationFundsReceived().selectByText( "Yes" );
		Assertions.assertEquals( "Yes", application.applicationFundsReceived().getSelectedText() );
		application.cashWithApplication().selectByText( "Yes" );
		Assertions.assertEquals( "Yes", application.cashWithApplication().getSelectedText() );
		application.cashWithApplicationReceivedDate().setDate( LocalDate.now() );
		NaviMenuView iGO = $( NaviMenuView.class ).first();
		iGO.checkIGO().click();
		Assert.assertTrue( testBench().compareScreen( ImageFileUtil.getReferenceScreenshotFile(
			"Screenshot 2024-05-31 162418.png" ) ) );
	}

	@Test
	public void uploadDocs() throws IOException, InterruptedException {

		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 4 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Mouse" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Mouse" ).click();
		ScenarioView getApplication = $( ScenarioView.class ).first();
		getApplication.applicationNumber().getCell( "424000190" ).click();
		ApplicationView application = $( ApplicationView.class ).first();
		application.threeDotsButton().click();
		WebElement noteList = findElement( By.xpath( "//*[@class='vaadin-menu-item']" ) );
		noteList.click();
		Thread.sleep( 3_000 );
		EntryDialogContent addNote = $( EntryDialogContent.class ).first();
		addNote.addNoteButton().click();
		addNote.noteText().setValue( "document 1" );
		addNote.expiresDate().setDate( LocalDate.of( 2024, 12, 12 ) );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Annuity Owner Questionnaire" );
		addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Documents\\correspondence_CondolenceLetterDeferredAnnuity_20240524172728195.pdf" ) );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Final Application" );
		addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Documents\\correspondence_CondolenceLetterDeferredAnnuity_20240524172728195.pdf" ) );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Sales Representative Disclosure" );
		addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Documents\\correspondence_CondolenceLetterDeferredAnnuity_20240524172728195.pdf" ) );
		addNote.attachButton().click();
		addNote.okButton().click();
		addNote.closeButton().click();
		NaviMenuView iGO = $( NaviMenuView.class ).first();
		iGO.checkSpdaIGO().click();
		Thread.sleep( 3_000 );
		Assert.assertTrue( testBench().compareScreen( ImageFileUtil.getReferenceScreenshotFile(
			"Screenshot 2024-06-17 132439.png" ) ) );
		ApplicationView note = $( ApplicationView.class ).first();
		note.threeDotsButton().doubleClick();
		WebElement noteMenu = findElement( By.xpath( "//*[@class='vaadin-menu-item']" ) );
		noteMenu.click();
		Thread.sleep( 3_000 );
		EntryDialogContent deleteNote = $( EntryDialogContent.class ).first();
		deleteNote.DeleteNoteButton().click();
		VaadinConfirmDialogView getDeleteButton = $( VaadinConfirmDialogView.class ).first();
		getDeleteButton.getSaveButton().click();
		EntryDialogContent closeNote = $( EntryDialogContent.class ).first();
		closeNote.closeButton().click();

	}
/*
	@Test
	public void addSuspense() {

		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 4 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Mouse" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Mouse" ).click();
		ScenarioView getApplication = $( ScenarioView.class ).first();
		getApplication.applicationNumber().getCell( "424000189" ).click();
		NaviMenuView addSuspense = $( NaviMenuView.class ).first();
		addSuspense.suspenseSpda().click();
		ApplicationView addSuspenseButton = $( ApplicationView.class ).first();
		addSuspenseButton.addSuspense().click();
		EntryDialogContent suspenseSource = $( EntryDialogContent.class ).first();
		suspenseSource.suspenseAmount().sendKeys( "50000" );
		suspenseSource.suspenseSource().selectByText( "Check" );
		suspenseSource.processButton().click();

	}

	@Test
	public void issuePolicy() {

		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 4 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Mouse" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Mouse" ).click();
		ScenarioView getApplication = $( ScenarioView.class ).first();
		getApplication.applicationNumber().getCell( "424000189" ).click();
		NaviMenuView iGO = $( NaviMenuView.class ).first();
		iGO.checkSpdaIGO().click();
		ApplicationView issue = $( ApplicationView.class ).first();
		issue.issueButton().click();
		VaadinConfirmDialogView confirm = $( VaadinConfirmDialogView.class ).first();
		confirm.getSaveButton().click();
	}
*/
	@Test
	public void activatePolicy() throws InterruptedException, IOException {

		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 4 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Mouse" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Mouse" ).click();
		ScenarioView getPolicy = $( ScenarioView.class ).first();
		getPolicy.policyNumber().getCell( "424000189" ).click();
		NaviMenuView getTransactions = $( NaviMenuView.class ).first();
		getTransactions.transactionsSPDA().click();
		ScenarioView transaction = $( ScenarioView.class ).first();
		transaction.processActivateTransactionButton().click();
		VaadinConfirmDialogView confirmButton = $( VaadinConfirmDialogView.class ).first();
		confirmButton.getSaveButton().click();
		Thread.sleep( 5_000 );
		transaction.processInitialPremiumTransactionButton().click();
		VaadinConfirmDialogView okButton = $( VaadinConfirmDialogView.class ).first();
		okButton.getSaveButton().click();
		Thread.sleep( 5_000 );
		Assert.assertTrue( testBench().compareScreen( ImageFileUtil.getReferenceScreenshotFile(
			"Screenshot 2024-06-17 140500.png" ) ) );
		transaction.reverseActivateTransactionButtonSPIA().click();
		VaadinConfirmDialogView undoButton = $( VaadinConfirmDialogView.class ).first();
		undoButton.getSaveButton().click();

	}

	@Test
	public void addNewBusiness() throws InterruptedException {
		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 4 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Mouse" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Mouse" ).click();
		NaviMenuView newBusiness = $( NaviMenuView.class ).first();
		newBusiness.getNewBusiness().click();
		NewIllustrationView addNewBusiness = $( NewIllustrationView.class ).first();
		addNewBusiness.getProductType().selectByText( "Deferred Annuity" );
		addNewBusiness.getProduct().selectByText( "Single Premium Deferred Annuity" );
		addNewBusiness.getDepositAmount().sendKeys( Keys.chord( Keys.CONTROL, "a" ), "50000" );
		addNewBusiness.getRateLockPeriod().selectByText( "Seven Years" );
		addNewBusiness.getOkButton().click();
		IllustrationView illustration = $( IllustrationView.class ).first();
		illustration.getAgentNumber().openPopup();
		illustration.getAgentNumber().sendKeys( Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN );
		illustration.getAgentNumber().sendKeys( Keys.ENTER );
		Assertions.assertEquals( "NM001 - Navy Mutual Default Agent", illustration.getAgentNumber().getSelectedText() );
		illustration.getSaveButton().click();
		NaviMenuView getReport = $( NaviMenuView.class ).first();
		getReport.getResult().click();
		IllustrationView apply = $( IllustrationView.class ).first();
		apply.getSaveButtonResult().click();
		apply.getApplyButtonResult().click();
		VaadinConfirmDialogView confirm = $( VaadinConfirmDialogView.class ).first();
		confirm.getSaveButton().click();
		ApplicationView application = $( ApplicationView.class ).first();
		application.applicationReceived().selectByText( "Yes" );
		Assertions.assertEquals( "Yes", application.applicationReceived().getSelectedText() );
		application.applicationReceivedDate().setDate( LocalDate.now() );
		application.applicationSignedDate().setDate( LocalDate.now() );
		application.applicationFundsReceived().selectByText( "Yes" );
		Assertions.assertEquals( "Yes", application.applicationFundsReceived().getSelectedText() );
		application.cashWithApplication().selectByText( "Yes" );
		Assertions.assertEquals( "Yes", application.cashWithApplication().getSelectedText() );
		application.cashWithApplicationReceivedDate().setDate( LocalDate.now() );
		application.threeDotsButton().click();
		WebElement noteList = findElement( By.xpath( "//*[@class='vaadin-menu-item']" ) );
		noteList.click();
		Thread.sleep( 3_000 );
		EntryDialogContent addNote = $( EntryDialogContent.class ).first();
		addNote.addNoteButton().click();
		addNote.noteText().setValue( "document 1" );
		addNote.expiresDate().setDate( LocalDate.of( 2024, 12, 12 ) );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Annuity Owner Questionnaire" );
		addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Documents\\correspondence_CondolenceLetterDeferredAnnuity_20240524172728195.pdf" ) );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Final Application" );
		addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Documents\\correspondence_CondolenceLetterDeferredAnnuity_20240524172728195.pdf" ) );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Sales Representative Disclosure" );
		addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Documents\\correspondence_CondolenceLetterDeferredAnnuity_20240524172728195.pdf" ) );
		addNote.attachButton().click();
		addNote.okButton().click();
		addNote.closeButton().click();
		NaviMenuView addSuspense = $( NaviMenuView.class ).first();
		addSuspense.suspenseSpda().click();
		ApplicationView addSuspenseButton = $( ApplicationView.class ).first();
		addSuspenseButton.addSuspense().click();
		EntryDialogContent suspenseSource = $( EntryDialogContent.class ).first();
		suspenseSource.suspenseAmount().sendKeys( "50000" );
		suspenseSource.suspenseSource().selectByText( "Check" );
		suspenseSource.processButton().click();
		NaviMenuView iGO = $( NaviMenuView.class ).first();
		iGO.checkSpdaIGO().click();
		ApplicationView issue = $( ApplicationView.class ).first();
		issue.issueButton().click();
		VaadinConfirmDialogView confirmDialog = $( VaadinConfirmDialogView.class ).first();
		confirmDialog.getSaveButton().click();
		NaviMenuView getTransactions = $( NaviMenuView.class ).first();
		getTransactions.transactionsSPDA().click();
		ScenarioView transaction = $( ScenarioView.class ).first();
		transaction.processActivateTransactionButton().click();
		VaadinConfirmDialogView confirmButton = $( VaadinConfirmDialogView.class ).first();
		confirmButton.getSaveButton().click();
		Thread.sleep( 5_000 );
		transaction.processInitialPremiumTransactionButton().click();
		VaadinConfirmDialogView okButton = $( VaadinConfirmDialogView.class ).first();
		okButton.getSaveButton().click();


	}
}
