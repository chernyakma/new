package com.vaadin.testbenchexample;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.time.LocalDate;

public class ClaimsIT extends BaseLoginTest{

/*
    @Test
    public void addClaim() throws InterruptedException, IOException {
        VaadinSelectView getSelectButton = $(VaadinSelectView.class).first();
        getSelectButton.getSelectItem().selectByText("Search Policy");
        waitUntil(driver -> $(SearchComponentView.class).exists(), 80);
        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        waitUntil(driver -> getPolicy.isDisplayed(), 20);
//        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        getPolicy.searchByPolicy().sendKeys("426000008");
        getPolicy.searchButton().click();
        getPolicy.family().getCell("426000008").click();
        NaviMenuView menu = $(NaviMenuView.class).first();
        menu.claims().click();
        ScenarioView claims = $(ScenarioView.class).first();
        claims.getAddClaimsButton().click();
        EntryDialogContent createClaim = $(EntryDialogContent.class).first();
 //       createClaim.addRundomCaseNumber();
 //       createClaim.getClaimType().selectByText("Death");
        createClaim.getSource().selectByText("Spouse");
        LocalDate currentDate = createClaim.getReceivedDate().getDate();
        LocalDate newDate = currentDate.minusMonths(1);
        createClaim.getIncurredDate().setDate(newDate);
        createClaim.getClaimCause().selectByText("Stroke");
        createClaim.getContact().selectItemByIndex(0);
        createClaim.saveAndOpenButton().click();


    }
    @Test
    public void processClaim() throws InterruptedException, IOException {
        VaadinSelectView getSelectButton = $(VaadinSelectView.class).first();
        getSelectButton.getSelectItem().selectByText("Search Policy");
        waitUntil(driver -> $(SearchComponentView.class).exists(), 120);
        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        waitUntil(driver -> getPolicy.isDisplayed(), 20);
//        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        getPolicy.searchByPolicy().sendKeys("426000008");
        getPolicy.searchButton().click();
        getPolicy.family().getCell("426000008").click();
        NaviMenuView menu = $(NaviMenuView.class).first();
        menu.claims().click();
        ScenarioView claims = $(ScenarioView.class).first();
        claims.getClaim().getCell("C100003027").click();
        menu.processClaim().click();
        EntryDialogContent event = $(EntryDialogContent.class).first();
        event.getEventType().selectByText("Decision");
        event.okButton().click();
    }
    @Test
    public void payClaim() throws InterruptedException, IOException {
        VaadinSelectView getSelectButton = $(VaadinSelectView.class).first();
        getSelectButton.getSelectItem().selectByText("Search Policy");
        waitUntil(driver -> $(SearchComponentView.class).exists(), 120);
        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        waitUntil(driver -> getPolicy.isDisplayed(), 20);
//        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        getPolicy.searchByPolicy().sendKeys("426000008");
        getPolicy.searchButton().click();
        getPolicy.family().getCell("426000008").click();
        NaviMenuView menu = $(NaviMenuView.class).first();
        menu.claims().click();
        ScenarioView claims = $(ScenarioView.class).first();
        claims.getClaim().getCell("C100003027").click();
        menu.makePayment().click();
        EntryDialogContent payment = $(EntryDialogContent.class).first();
        payment.getPayee().selectItemByIndex(0);
        payment.okButton().click();
        menu.policy().click();

    }
    @Test
    public void undoClaimPayment() throws InterruptedException, IOException {
        VaadinSelectView getSelectButton = $(VaadinSelectView.class).first();
        getSelectButton.getSelectItem().selectByText("Search Policy");
        waitUntil(driver -> $(SearchComponentView.class).exists(), 120);
        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        waitUntil(driver -> getPolicy.isDisplayed(), 20);
//        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        getPolicy.searchByPolicy().sendKeys("426000008");
        getPolicy.searchButton().click();
        getPolicy.family().getCell("426000008").click();
        NaviMenuView menu = $(NaviMenuView.class).first();
        menu.policyTransactions().click();
        ScenarioView transactions = $(ScenarioView.class).first();
        transactions.reverseSecondTransactionButton().click();
        waitUntil(driver -> $(VaadinConfirmDialogView.class).exists(), 120);
        VaadinConfirmDialogView confirm = $(VaadinConfirmDialogView.class).first();
        confirm.getSaveButton().click();
        waitUntil(driver -> !transactions.progressBar().isDisplayed(), 80);
        transactions.deleteFirstTransactionButton().click();
        waitUntil(driver -> $(VaadinConfirmDialogView.class).exists(), 120);
        VaadinConfirmDialogView confirmDelete = $(VaadinConfirmDialogView.class).first();
        confirmDelete.getSaveButton().click();
        waitUntil(driver -> !transactions.progressBar().isDisplayed(), 80);
        transactions.deleteFirstTransactionButton().click();
        waitUntil(driver -> $(VaadinConfirmDialogView.class).exists(), 120);
        VaadinConfirmDialogView secondDelete = $(VaadinConfirmDialogView.class).first();
        secondDelete.getSaveButton().click();
        waitUntil(driver -> !transactions.progressBar().isDisplayed(), 80);

    }
    @Test
    public void processDenyClaim() throws InterruptedException, IOException {
        VaadinSelectView getSelectButton = $(VaadinSelectView.class).first();
        getSelectButton.getSelectItem().selectByText("Search Policy");
        waitUntil(driver -> $(SearchComponentView.class).exists(), 120);
        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        waitUntil(driver -> getPolicy.isDisplayed(), 20);
//        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        getPolicy.searchByPolicy().sendKeys("426000008");
        getPolicy.searchButton().click();
        getPolicy.family().getCell("426000008").click();
        NaviMenuView menu = $(NaviMenuView.class).first();
        menu.claims().click();
        ScenarioView claims = $(ScenarioView.class).first();
        claims.getClaim().getCell("C100003027").click();
        menu.processClaim().click();
        EntryDialogContent event = $(EntryDialogContent.class).first();
        event.getEventType().selectByText("Decision");
        EntryDialogContent denyClaim = $(EntryDialogContent.class).first();
        denyClaim.editDecision().click();
        EntryDialogContent decision = $(EntryDialogContent.class).last();
        decision.getClaimDecision().selectByText("Deny");
        decision.okButton().click();
        event.getDenialClaimReason().selectByText("Marked Up In Error");
        event.okButton().click();
        ScenarioView claimStatus = $(ScenarioView.class).first();
        Assertions.assertEquals("Denied", claimStatus.claimStatus().getText());

    }
*/
    @Test
    public void deathClaim() throws InterruptedException, IOException {
        VaadinSelectView getSelectButton = $(VaadinSelectView.class).first();
        getSelectButton.getSelectItem().selectByText("Search Policy");
        waitUntil(driver -> $(SearchComponentView.class).exists(), 80);
        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        waitUntil(driver -> getPolicy.isDisplayed(), 20);
//        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        getPolicy.searchByPolicy().sendKeys("426000008");
        getPolicy.searchButton().click();
        getPolicy.family().getCell("426000008").click();
        NaviMenuView menu = $(NaviMenuView.class).first();
        menu.claims().click();
        ScenarioView claims = $(ScenarioView.class).first();
        claims.getAddClaimsButton().click();
        EntryDialogContent createClaim = $(EntryDialogContent.class).first();
 //       createClaim.addRundomCaseNumber();
 //       createClaim.getClaimType().selectByText("Death");
        createClaim.getSource().selectByText("Spouse");
        LocalDate currentDate = createClaim.getReceivedDate().getDate();
        LocalDate newDate = currentDate.minusMonths(1);
        createClaim.getIncurredDate().setDate(newDate);
        createClaim.getClaimCause().selectByText("Stroke");
        createClaim.getContact().selectItemByIndex(0);
        createClaim.saveAndOpenButton().click();
        menu.processClaim().click();
        EntryDialogContent event = $(EntryDialogContent.class).first();
        event.getEventType().selectByText("Decision");
        event.okButton().click();
        menu.makePayment().click();
        EntryDialogContent payment = $(EntryDialogContent.class).first();
        payment.getPayee().selectItemByIndex(0);
        payment.okButton().click();
        menu.claimPolicy().click();
        menu.policyTransactions().click();
        ScenarioView transactions = $(ScenarioView.class).first();
        transactions.reverseSecondTransactionButton().click();
        waitUntil(driver -> $(VaadinConfirmDialogView.class).exists(), 120);
        VaadinConfirmDialogView confirm = $(VaadinConfirmDialogView.class).first();
        confirm.getSaveButton().click();
        waitUntil(driver -> !transactions.progressBar().isDisplayed(), 80);
        transactions.deleteFirstTransactionButton().click();
        waitUntil(driver -> $(VaadinConfirmDialogView.class).exists(), 120);
        VaadinConfirmDialogView confirmDelete = $(VaadinConfirmDialogView.class).first();
        confirmDelete.getSaveButton().click();
        waitUntil(driver -> !transactions.progressBar().isDisplayed(), 80);
        transactions.deleteFirstTransactionButton().click();
        VaadinConfirmDialogView delete = $(VaadinConfirmDialogView.class).first();
        delete.getSaveButton().click();
        waitUntil(driver -> !transactions.progressBar().isDisplayed(), 80);
        menu.claims().click();
        ScenarioView getClaims = $(ScenarioView.class).first();
        getClaims.getClaim().getCell("Approved").click();
        menu.processClaim().click();
        EntryDialogContent change = $(EntryDialogContent.class).first();
        change.getEventType().selectByText("Decision");
        EntryDialogContent denyClaim = $(EntryDialogContent.class).first();
        denyClaim.editDecision().click();
        EntryDialogContent decision = $(EntryDialogContent.class).last();
        decision.getClaimDecision().selectByText("Deny");
        decision.okButton().click();
        EntryDialogContent reason = $(EntryDialogContent.class).first();
        reason.getDenialClaimReason().selectByText("Marked Up In Error");
        reason.okButton().click();
        ScenarioView claimStatus = $(ScenarioView.class).first();
        Assertions.assertEquals("Denied", claimStatus.claimStatus().getText());
        Assertions.assertEquals("Active",claimStatus.policyClaimStatus().getText());

    }
    @Test
    public void terminalIllnessClaim() throws InterruptedException, IOException {
        VaadinSelectView getSelectButton = $(VaadinSelectView.class).first();
        getSelectButton.getSelectItem().selectByText("Search Policy");
        waitUntil(driver -> $(SearchComponentView.class).exists(), 80);
        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        waitUntil(driver -> getPolicy.isDisplayed(), 20);
//        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        getPolicy.searchByPolicy().sendKeys("06217685");
        getPolicy.searchButton().click();
        getPolicy.family().getCell("06217685").click();
        NaviMenuView menu = $(NaviMenuView.class).first();
        menu.claims().click();
        ScenarioView claims = $(ScenarioView.class).first();
        claims.getAddClaimsButton().click();
        EntryDialogContent createClaim = $(EntryDialogContent.class).first();
        //       createClaim.addRundomCaseNumber();
               createClaim.getTIClaimType().selectByText("Terminal Illness");
        createClaim.getSource().selectByText("Spouse");
        LocalDate currentDate = createClaim.getReceivedDate().getDate();
        LocalDate newDate = currentDate.minusMonths(1);
        createClaim.getIncurredDate().setDate(newDate);
        createClaim.getClaimCause().selectByText("Stroke");
        createClaim.getContact().selectItemByIndex(0);
        createClaim.saveAndOpenButton().click();

        menu.processTIClaim().click();
        EntryDialogContent event = $(EntryDialogContent.class).last();
        event.getEventType().selectByText("Approve");
        event.okButton().click();
        menu.makeTIPayment().click();
        EntryDialogContent payment = $(EntryDialogContent.class).last();
 //       payment.getPayee().selectItemByIndex(0);
        payment.okButton().click();
        menu.claimTIPolicy().click();
        menu.policyPermPlusTransactions().click();
        ScenarioView transactions = $(ScenarioView.class).first();
        transactions.reverseSecondTransactionButton().click();
        waitUntil(driver -> $(VaadinConfirmDialogView.class).exists(), 120);
        VaadinConfirmDialogView confirm = $(VaadinConfirmDialogView.class).first();
        confirm.getSaveButton().click();
        waitUntil(driver -> !transactions.progressBar().isDisplayed(), 80);
        transactions.deleteFirstTransactionButton().click();
        waitUntil(driver -> $(VaadinConfirmDialogView.class).exists(), 120);
        VaadinConfirmDialogView confirmDelete = $(VaadinConfirmDialogView.class).first();
        confirmDelete.getSaveButton().click();
        waitUntil(driver -> !transactions.progressBar().isDisplayed(), 80);
        transactions.deleteFirstTransactionButton().click();
        VaadinConfirmDialogView delete = $(VaadinConfirmDialogView.class).first();
        delete.getSaveButton().click();
        waitUntil(driver -> !transactions.progressBar().isDisplayed(), 80);
        menu.claims().click();
        ScenarioView getClaims = $(ScenarioView.class).first();
        getClaims.getClaim().getCell("Pending").click();
        menu.processTIClaim().click();
        EntryDialogContent change = $(EntryDialogContent.class).first();
        change.getEventType().selectByText("Denial");
  /*
        EntryDialogContent denyClaim = $(EntryDialogContent.class).first();
        denyClaim.editDecision().click();
        EntryDialogContent decision = $(EntryDialogContent.class).last();
        decision.getClaimDecision().selectByText("Deny");
        decision.okButton().click();
        EntryDialogContent reason = $(EntryDialogContent.class).first();

   */
        change.getDenialClaimReason().selectByText("Marked Up In Error");
        change.okButton().click();
        ScenarioView claimStatus = $(ScenarioView.class).first();
        Assertions.assertEquals("Denied", claimStatus.claimStatus().getText());
        Assertions.assertEquals("Active",claimStatus.policyClaimStatus().getText());

    }
    @Test
    public void LongTermCareClaim() throws InterruptedException, IOException {
        VaadinSelectView getSelectButton = $(VaadinSelectView.class).first();
        getSelectButton.getSelectItem().selectByText("Search Policy");
        waitUntil(driver -> $(SearchComponentView.class).exists(), 80);
        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        waitUntil(driver -> getPolicy.isDisplayed(), 20);
//        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        getPolicy.searchByPolicy().sendKeys("06211567");
        getPolicy.searchButton().click();
        getPolicy.family().getCell("06211567").click();
        NaviMenuView menu = $(NaviMenuView.class).first();
        menu.claims().click();
        ScenarioView claims = $(ScenarioView.class).first();
        claims.getAddClaimsButton().click();
        EntryDialogContent createClaim = $(EntryDialogContent.class).first();
        //       createClaim.addRundomCaseNumber();
        createClaim.getTIClaimType().selectByText("Long Term Care");
        createClaim.getSource().selectByText("Spouse");
        LocalDate currentDate = createClaim.getReceivedDate().getDate();
        LocalDate newDate = currentDate.minusMonths(4);
        createClaim.getIncurredDate().setDate(newDate);
        createClaim.getClaimCause().selectByText("Stroke");
        createClaim.getContact().selectItemByIndex(0);
        createClaim.saveAndOpenButton().click();

        menu.processTIClaim().click();
        EntryDialogContent event = $(EntryDialogContent.class).last();
        event.getEventType().selectByText("Approve");
        event.getBenefitPeriod().selectItemByIndex(0);
        event.okButton().click();
        menu.makeTIPayment().click();
        EntryDialogContent payment = $(EntryDialogContent.class).last();
        //       payment.getPayee().selectItemByIndex(0);
        payment.okButton().click();
        menu.claimTIPolicy().click();
        menu.policyTransactions().click();
        ScenarioView transactions = $(ScenarioView.class).first();
        transactions.reverseThirdTransactionButton().click();
        waitUntil(driver -> $(VaadinConfirmDialogView.class).exists(), 120);
        VaadinConfirmDialogView confirm = $(VaadinConfirmDialogView.class).first();
        confirm.getSaveButton().click();
        waitUntil(driver -> !transactions.progressBar().isDisplayed(), 80);
        transactions.deleteFirstTransactionButton().click();
        waitUntil(driver -> $(VaadinConfirmDialogView.class).exists(), 120);
        VaadinConfirmDialogView confirmDelete = $(VaadinConfirmDialogView.class).first();
        confirmDelete.getSaveButton().click();
        waitUntil(driver -> !transactions.progressBar().isDisplayed(), 80);
        transactions.deleteFirstTransactionButton().click();
        VaadinConfirmDialogView delete = $(VaadinConfirmDialogView.class).first();
        delete.getSaveButton().click();
        waitUntil(driver -> !transactions.progressBar().isDisplayed(), 80);
        transactions.deleteFirstTransactionButton().click();
        waitUntil(driver -> $(VaadinConfirmDialogView.class).exists(), 120);
        VaadinConfirmDialogView confirmDelete2 = $(VaadinConfirmDialogView.class).first();
        confirmDelete2.getSaveButton().click();
        waitUntil(driver -> !transactions.progressBar().isDisplayed(), 80);
        menu.claims().click();
        ScenarioView getClaims = $(ScenarioView.class).first();
        getClaims.getClaim().getCell("Pending").click();
        menu.processTIClaim().click();
        EntryDialogContent change = $(EntryDialogContent.class).first();
        change.getEventType().selectByText("Denial");

        change.getDenialClaimReason().selectByText("Marked Up In Error");
        change.okButton().click();
        ScenarioView claimStatus = $(ScenarioView.class).first();
        Assertions.assertEquals("Denied", claimStatus.claimStatus().getText());
        Assertions.assertEquals("Active",claimStatus.policyClaimStatus().getText());

    }

}
