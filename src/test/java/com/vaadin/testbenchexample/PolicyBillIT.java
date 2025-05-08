package com.vaadin.testbenchexample;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

public class PolicyBillIT extends BaseLoginTest{
    protected LocalDate initialPaidToDate;
    protected final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy", Locale.ENGLISH);

    @Test
    public void payPAC() {

        VaadinSelectView getSelectButton = $(VaadinSelectView.class).first();
        getSelectButton.getSelectItem().selectByText("Search Policy");

        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        getPolicy.searchByPolicy().sendKeys("07659314");
        getPolicy.searchButton().click();
        getPolicy.family().getCell("07659314").click();

        NaviMenuView transaction = $(NaviMenuView.class).first();
        transaction.policyTransactions().click();

        ScenarioView payPremium = $(ScenarioView.class).first();

        //flexible parser
        String originalDateText = payPremium.policyPaidToDate().getText();
        initialPaidToDate = parseFlexibleDate(originalDateText);


        LocalDate originalDate = parseFlexibleDate(originalDateText);
        LocalDate newDate = originalDate.plusDays(1);
        if (newDate.getDayOfWeek() == DayOfWeek.SATURDAY) {
            newDate = newDate.plusDays(2);
        } else if (newDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
            newDate = newDate.plusDays(1);
        }
        payPremium.date().setDate(newDate);

        payPremium.cycle().click();
        VaadinConfirmDialogView cycleUp = $(VaadinConfirmDialogView.class).first();
        cycleUp.getSaveButton().click();
        waitUntil(driver -> !payPremium.progressBar().isDisplayed(), 80);
        String updatedText = payPremium.policyPaidToDate().getText();

        LocalDate updatedDate = LocalDate.parse(updatedText, formatter);

        Assertions.assertEquals(initialPaidToDate.plusMonths(1), updatedDate);

    }

    protected LocalDate parseFlexibleDate(String dateString) {
        dateString = dateString.trim(); // 🔑 trims extra spaces

        List<DateTimeFormatter> formatters = List.of(
                DateTimeFormatter.ofPattern("MMM d, yyyy", Locale.ENGLISH),   // "Sep 1, 2025"
                DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH),  // "September 1, 2025"
                DateTimeFormatter.ofPattern("M/d/yyyy")                       // "4/1/2025"
        );

        for (DateTimeFormatter f : formatters) {
            try {
                return LocalDate.parse(dateString, f);
            } catch (Exception ignored) {}
        }

        throw new IllegalArgumentException("Could not parse date: " + dateString);
    }
    @Test
    public void payDirectBill() {
        VaadinSelectView getSelectButton = $(VaadinSelectView.class).first();
        getSelectButton.getSelectItem().selectByText("Search Policy");
        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        getPolicy.searchByPolicy().sendKeys("07659295");
        getPolicy.searchButton().click();
        getPolicy.family().getCell("07659295").click();
        NaviMenuView transaction = $(NaviMenuView.class).first();
        transaction.policyTransactions().click();
        ScenarioView premiumTransaction = $(ScenarioView.class).first();
        String originalDateText = premiumTransaction.policyPaidToDate().getText();
        initialPaidToDate = LocalDate.parse(originalDateText, formatter);
        premiumTransaction.addTransactionButton().click();
        TransactionPopUpPageView selectTransaction = $(TransactionPopUpPageView.class).first();
        selectTransaction.transactionType().selectByText("Premium");
        EntryDialogContent premium = $(EntryDialogContent.class).first();
		premium.premiumAmount().sendKeys(Keys.chord(Keys.CONTROL, "a"), "114.45");
        TransactionPopUpPageView notes = $(TransactionPopUpPageView.class).first();
        notes.note().sendKeys( "123" );
//		premium.billingMonths().sendKeys(Keys.chord(Keys.CONTROL, "a"), "3");
        premium.okButton().click();
        ScenarioView processPremiumTransaction = $(ScenarioView.class).first();
        processPremiumTransaction.processInitialPremiumTransactionButton().click();
        VaadinConfirmDialogView confirm = $(VaadinConfirmDialogView.class).first();
        confirm.getSaveButton().click();
        ScenarioView transactionsPage = $(ScenarioView.class).first();

        waitUntil(driver -> !transactionsPage.progressBar().isDisplayed(), 80);
        //       ScenarioView paidToDate = $(ScenarioView.class).first();
        String updatedText = transactionsPage.policyPaidToDate().getText();
        LocalDate updatedDate = LocalDate.parse(updatedText, formatter);

        Assertions.assertEquals(initialPaidToDate.plusMonths(3), updatedDate);
        ScenarioView deleteTransaction = $(ScenarioView.class).first();
        deleteTransaction.reverseAddRiderTransactionButton().click();
        VaadinConfirmDialogView ok = $(VaadinConfirmDialogView.class).first();
        ok.getSaveButton().click();
        ScenarioView deleteLoanTransaction = $(ScenarioView.class).first();
        waitUntil(driver -> !deleteTransaction.progressBar().isDisplayed(), 80);

//		ScenarioView deleteLoanTransaction = $(ScenarioView.class).first();
        deleteLoanTransaction.deleteLoanTransactionButton().click();
        VaadinConfirmDialogView confirmation = $(VaadinConfirmDialogView.class).first();
        confirmation.getSaveButton().click();

    }
}
