package first.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import first.system.constant.FXMLFileName;
import first.system.tool.FileTool;
import first.system.tool.SceneBuilderTool;

public class MainFrameController extends ControllerAbstract {
	@FXML private AnchorPane commodityPaneBase;
	@FXML private AnchorPane paymentPaneBase;
	@FXML private AnchorPane historyPaneBase;
	
	public MainFrameController() {
		super(FXMLFileName.MAIN_FRAME);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		GridPane commodityPane = (GridPane) FileTool.fxmlLoad(new CommodityPaneController());
		BorderPane paymentPane = (BorderPane) FileTool.fxmlLoad(new PaymentPaneController());
		BorderPane historyPane = (BorderPane) FileTool.fxmlLoad(new HistoryPaneController());
		
		SceneBuilderTool.fitToParent(commodityPane);
		this.commodityPaneBase.getChildren().add(commodityPane);
		
		SceneBuilderTool.fitToParent(paymentPane);
		this.paymentPaneBase.getChildren().add(paymentPane);
		
		SceneBuilderTool.fitToParent(historyPane);
		this.historyPaneBase.getChildren().add(historyPane);
	}
}