package first.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import first.system.constant.FXMLFileName;

public class PaymentPaneController extends ControllerAbstract {

	@FXML private BorderPane root;
	
	public PaymentPaneController() {
		super(FXMLFileName.PAYMENT_PANE);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
}