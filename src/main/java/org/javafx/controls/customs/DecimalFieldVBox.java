package org.javafx.controls.customs;



import java.math.BigDecimal;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class DecimalFieldVBox extends GridCustom{
	public static char COMPONENT_HORIZONTAL='H';
	public static char COMPONENT_VERTICAL='V';
	
	private int maxValue = 255;
	private String text = "";
	private String promptText = "";
	private DecimalField field;
	private char typePosition;
	
	public DecimalFieldVBox() {
		super();	
		initComponents();
	}
	
	private void initComponents() {				
		this.field = new DecimalField();
		field.setMaxValue(maxValue);
		field.setText(text);
		field.setPromptText(promptText);
		addRow(1, lbl);
		addRow(2, field);
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
		this.field.setText(text);
	}

	public String getPromptText() {
		return promptText;
	}

	public void setPromptText(String promptText) {
		this.promptText = promptText;
		this.field.setPromptText(promptText);
	}

	public DecimalField getField() {
		return field;
	}

	public void setField(DecimalField field) {
		this.field = field;
	}
	
	public BigDecimal getValue() {		
		return field.getValue();
	}

	public void setValue(int value) {
		field.setValue(String.valueOf(value));
	}
	
	public void setValue(String value) {		
		field.setValue(value);
	}
	
	public void setValue(BigDecimal value) {		
		field.setValue(value);
	}
	
	public void addAction(EventHandler<ActionEvent> event){		
		this.field.addEventHandler(ActionEvent.ACTION, event);
	}
	
	@Override
	public void requestFocus() {
		super.requestFocus();
		this.field.requestFocus();
	}
	
	public char getTypePosition() {
		return typePosition;
	}

	public void setTypePosition(char typePosition) {
		this.typePosition = typePosition;
		getChildren().clear();
		if(typePosition == 'H'){
			addColumn(1, lbl);
			addColumn(2, field);	
		}
		if(typePosition == 'V'){
			addRow(1, lbl);
			addRow(2, field);	
		}
	}
}
