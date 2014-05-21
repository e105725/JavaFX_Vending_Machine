package first.controller.commodity;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import first.controller.ControllerAbstract;
import first.system.constant.FXMLFileName;

public class CommodityPaneController extends ControllerAbstract {

	@FXML private GridPane root;
	
	public CommodityPaneController() {
		super(FXMLFileName.COMMODITY_PANE);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.root.setStyle("-fx-background-color:red;");
	}
}