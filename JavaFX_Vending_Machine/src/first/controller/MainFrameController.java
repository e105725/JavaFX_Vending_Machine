package first.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import first.system.constant.FXMLFileName;

public class MainFrameController extends ControllerAbstract {
	@FXML private AnchorPane commodityPaneBase;
	@FXML private AnchorPane paymentPaneBase;
	@FXML private AnchorPane historyPaneBase;
	
	public MainFrameController() {
		super(FXMLFileName.MAIN_FRAME);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
}