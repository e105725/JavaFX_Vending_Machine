package first.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import first.component.HistoryTable;
import first.system.constant.FXMLFileName;

public class HistoryPaneController extends ControllerAbstract {
	private final String HISTORY_LABEL_TEXT = "購入履歴";
	@FXML private BorderPane root;
	
	public HistoryPaneController() {
		super(FXMLFileName.HISTORY_PANE);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Label label = new Label(this.HISTORY_LABEL_TEXT);
		HistoryTable table = new HistoryTable();
		this.root.setTop(label);
		this.root.setCenter(table);
	}
}