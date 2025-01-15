package com.vaadin.testbenchexample;
import javax.swing.*;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

import com.vaadin.flow.component.html.testbench.SpanElement;
import com.vaadin.flow.component.icon.testbench.IconElement;
import com.vaadin.flow.component.select.testbench.SelectElement;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.annotations.Attribute;
import com.vaadin.testbench.elementsbase.Element;


@Element( "NAVI-MENU" )
//@Attribute(name="class",value="navi-item page-item")
public class NaviMenuView extends TestBenchElement {

	protected TestBenchElement getAddresses() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 5 );
	}

	protected TestBenchElement getSuspense() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 25 );
	}
	protected TestBenchElement getApplication() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 1 );
	}
	protected TestBenchElement beneficiaries() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 11 );
	}

	protected TestBenchElement getDocument() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 18 );
	}
//SPDA
	protected TestBenchElement getDocumentSPDA() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 13 );
	}

	protected TestBenchElement getNewBusiness() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 30 );
	}

	protected TestBenchElement getBankInformation() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 4 );
	}

	protected TestBenchElement getFamily() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).last();
	}

	protected TestBenchElement checkIGO() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 25 );
	}
	//SPDA
	protected TestBenchElement checkSpdaIGO() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 20 );
	}
	protected TestBenchElement suspenseSpda() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 18 );
	}

	protected TestBenchElement suspense() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 23 );
	}

	protected TestBenchElement transactionsFPDR() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 43 );
	}
	protected TestBenchElement transactionsSPIA() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 27 );
	}
	protected TestBenchElement transactionsWL() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 32 );
	}
	protected TestBenchElement transactionsSPDA() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 33 );
	}
	protected TestBenchElement transactionsLoan() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 38 );
	}

	protected TestBenchElement getReport() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 7 );
	}
	protected TestBenchElement getResult() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 5 );
	}
	protected TestBenchElement getPolicy() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).first();
	}
}
