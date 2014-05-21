package first.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import first.model.Drink;
import first.model.History;
import first.system.constant.ConstantText;
import first.system.constant.FXMLFileName;

public class HistoryPaneController extends ControllerAbstract {
	@FXML private BorderPane root;
	@FXML private Label tableNameLabel;
	@FXML private TableView<Drink> historyTable;
	@FXML private TableColumn<Drink, String> nameColumn;
	@FXML private TableColumn<Drink, Integer> priceColumn;
	
	private final History history;
	public HistoryPaneController(History _history) {
		super(FXMLFileName.HISTORY_PANE);
		this.history = _history;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.historyTable.setItems(this.history.getHistolyList());
		this.nameColumn.setCellValueFactory(new PropertyValueFactory<Drink, String>(Drink.DRINK_GET_NAME));
		this.priceColumn.setCellValueFactory(new PropertyValueFactory<Drink, Integer>(Drink.DRINK_GET_PRICE));
		
		this.initText();
	}
	
	private final void initText() {
		this.tableNameLabel.setText(ConstantText.HISTORY_LABEL_TEXT);
		this.nameColumn.setText(ConstantText.HISTORY_TABLE_NAME_COLUMN_TEXT);
		this.priceColumn.setText(ConstantText.HISTORY_TABLE_PRICE_COLUMN_TEXT);
	}
}