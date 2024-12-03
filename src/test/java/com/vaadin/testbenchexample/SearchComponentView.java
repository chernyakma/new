package com.vaadin.testbenchexample;
import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.grid.testbench.GridColumnElement;
import com.vaadin.flow.component.grid.testbench.GridElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.elementsbase.Element;

@Element( "search-component" )
public class SearchComponentView extends TestBenchElement {

	protected TextFieldElement searchByName() {

		return $( TestBenchElement.class ).id( "Search" ).$( TextFieldElement.class ).id( "LastName" );

	}
	protected TextFieldElement searchByPolicy(){
		return $( TestBenchElement.class ).id( "Search" ).$( TextFieldElement.class ).id( "PolicyNumber" );
	}
	protected ButtonElement searchButton (){
		return $(ButtonElement.class).first();
	}
	protected GridElement family (){ return $(GridElement.class).first(); }


}


