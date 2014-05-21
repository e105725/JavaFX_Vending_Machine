package first.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class History {
	
	private final ObservableList<Drink> historyList;
	
	public History() {
		this.historyList = FXCollections.observableArrayList();
	}
	
	public final ObservableList<Drink> getHistolyList() {
		return this.historyList;
	}
	
	public final void addHistory(Drink drink) {
		this.historyList.add(drink);
	}
}