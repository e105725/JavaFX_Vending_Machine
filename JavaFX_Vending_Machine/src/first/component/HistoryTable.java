package first.component;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import first.model.Drink;

public final class HistoryTable extends TableView<Drink> {
	private final String HISTORY_TABLE_NAME_COLUMN_TEXT  = "品名";
	private final String HISTORY_TABLE_PRICE_COLUMN_TEXT = "値段";

	public HistoryTable() {
		TableColumn<Drink, String> nameColumn = new TableColumn<>(this.HISTORY_TABLE_NAME_COLUMN_TEXT);
		nameColumn.setCellValueFactory(new PropertyValueFactory<Drink, String>(Drink.DRINK_GET_NAME));
		this.getColumns().add(nameColumn);
		
		TableColumn<Drink, Integer> priceColumn = new TableColumn<>(this.HISTORY_TABLE_PRICE_COLUMN_TEXT);
		priceColumn.setCellValueFactory(new PropertyValueFactory<Drink, Integer>(Drink.DRINK_GET_PRICE));
		this.getColumns().add(priceColumn);
		
		this.setColumnResizePolicy(CONSTRAINED_RESIZE_POLICY);
	}
}