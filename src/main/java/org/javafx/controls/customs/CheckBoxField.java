package org.javafx.controls.customs;

import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class CheckBoxField extends CheckBox {
	
	public CheckBoxField(){
		super();
		initComponents();
	}	
	
	@SuppressWarnings("restriction")
	private void initComponents() {		     
		this.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event) {				
				if(event.getCode() == KeyCode.ENTER) {
					
				}
			}
		});
	}	
}
