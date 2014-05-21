package first.controller.main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import first.controller.ControllerAbstract;
import first.controller.commodity.CommodityPaneController;
import first.controller.history.HistoryPaneController;
import first.controller.payment.PaymentPaneController;
import first.system.constant.FXMLFileName;
import first.system.tool.FileFunction;
import first.system.tool.SceneBuilderFunction;

public class MainFrameController extends ControllerAbstract {
	@FXML private AnchorPane commodityPaneBase;
	@FXML private AnchorPane paymentPaneBase;
	@FXML private AnchorPane historyPaneBase;
	
	public MainFrameController() {
		super(FXMLFileName.MAIN_FRAME);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		GridPane commodityPane = (GridPane) FileFunction.fxmlLoad(new CommodityPaneController());
		BorderPane paymentPane = (BorderPane) FileFunction.fxmlLoad(new PaymentPaneController());
		BorderPane historyPane = (BorderPane) FileFunction.fxmlLoad(new HistoryPaneController());
		
		SceneBuilderFunction.fitToParent(commodityPane);
		this.commodityPaneBase.getChildren().add(commodityPane);
		
		SceneBuilderFunction.fitToParent(paymentPane);
		this.paymentPaneBase.getChildren().add(paymentPane);
		
		SceneBuilderFunction.fitToParent(historyPane);
		this.historyPaneBase.getChildren().add(historyPane);
	}
}