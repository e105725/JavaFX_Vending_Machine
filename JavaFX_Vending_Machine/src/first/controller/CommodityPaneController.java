package first.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.geometry.HPos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import first.model.Deposit;
import first.model.Drink;
import first.model.History;
import first.system.constant.ConstantValue;
import first.system.constant.FXMLFileName;
import first.system.tool.FileTool;
import first.system.tool.node.GridPaneTool;

public final class CommodityPaneController extends ControllerAbstract {
	@FXML private GridPane root;
	private final Deposit deposit;
	private final History history;
	
	public CommodityPaneController(Deposit _deposit, History _history) {
		super(FXMLFileName.COMMODITY_PANE);
		this.deposit = _deposit;
		this.history = _history;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		int drinkNum = ConstantValue.DRINK_NUM;
		int drinkColumnMax = ConstantValue.DRINK_GRID_COLUMN_MAX;
		int rowSize = drinkNum / drinkColumnMax;
		GridPaneTool.initColumnConstraints(this.root, drinkColumnMax);
		GridPaneTool.initRowConstraints(this.root, rowSize);
		
		for (int index = 0; index < drinkNum; index++) {
			Drink drink = new Drink();
			DrinkButtonController controller = new DrinkButtonController(drink, this.deposit, this.history);
			Button drinkButton = (Button) FileTool.fxmlLoad(controller);
			GridPane.setHalignment(drinkButton, HPos.CENTER);
			this.root.add(drinkButton, index % drinkColumnMax, index / drinkColumnMax);
		}
	}
}