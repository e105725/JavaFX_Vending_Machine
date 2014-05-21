package first.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import first.system.constant.FXMLFileName;

public class DrinkButtonController extends ControllerAbstract {
	@FXML private Button nameButton;
	@FXML private RadioButton priceRadio;
	
	protected DrinkButtonController() {
		super(FXMLFileName.DRINK_BUTTON);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
}