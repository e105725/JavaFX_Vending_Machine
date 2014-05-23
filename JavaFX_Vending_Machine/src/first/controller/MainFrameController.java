package first.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import first.model.Deposit;
import first.model.History;
import first.system.constant.FXMLFileName;
import first.system.tool.FileTool;
import first.system.tool.node.NodeTool;

public class MainFrameController extends ControllerAbstract {
	@FXML private AnchorPane commodityPaneBase;
	@FXML private AnchorPane paymentPaneBase;
	@FXML private AnchorPane historyPaneBase;
	
	public MainFrameController() {
		super(FXMLFileName.MAIN_FRAME);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		History history = new History();
		Deposit deposit = new Deposit();
		GridPane commodityPane = (GridPane) FileTool.fxmlLoad(new CommodityPaneController(deposit, history));
		BorderPane paymentPane = (BorderPane) FileTool.fxmlLoad(new PaymentPaneController(deposit));
		BorderPane historyPane = (BorderPane) FileTool.fxmlLoad(new HistoryPaneController(history));
		
		NodeTool.fitToParent(commodityPane);
		this.commodityPaneBase.getChildren().add(commodityPane);
		
		NodeTool.fitToParent(paymentPane);
		this.paymentPaneBase.getChildren().add(paymentPane);
		
		NodeTool.fitToParent(historyPane);
		this.historyPaneBase.getChildren().add(historyPane);
	}
}