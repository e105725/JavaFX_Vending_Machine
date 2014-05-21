package first.controller.history;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import first.controller.ControllerAbstract;
import first.system.constant.FXMLFileName;

public class HistoryPaneController extends ControllerAbstract {

	@FXML private BorderPane root;
	public HistoryPaneController() {
		super(FXMLFileName.HISTORY_PANE);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.root.setStyle("-fx-background-color:blue");
	}

}
