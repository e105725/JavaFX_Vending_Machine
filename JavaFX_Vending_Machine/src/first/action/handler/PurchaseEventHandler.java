package first.action.handler;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import first.model.Deposit;
import first.model.Drink;
import first.model.History;

public final class PurchaseEventHandler implements EventHandler<ActionEvent> {

	private final Drink drink;
	private final Deposit deposit;
	private final History history;

	public PurchaseEventHandler(Drink _drink, Deposit _deposit, History _history) {
		this.drink = _drink;
		this.deposit = _deposit;
		this.history = _history;
	}

	@Override
	public void handle(ActionEvent arg0) {
		int price = drink.getPrice();
		if (!this.deposit.canExpenditure(price)) {
			return;
		}
		this.deposit.expenditure(price);
		this.history.addHistory(this.drink);
	}
}