package first.action.handler;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import first.model.Coin;
import first.model.Deposit;
import first.model.Wallet;

public final class PaymentEventHandler implements EventHandler<ActionEvent> {
	
	private final Wallet wallet;
	private final Deposit deposit;
	private final Coin coin;
	
	public PaymentEventHandler(Wallet _wallet, Deposit _deposit, Coin _coin) {
		this.wallet = _wallet;
		this.deposit = _deposit;
		this.coin = _coin;
	}

	@Override
	public void handle(ActionEvent arg0) {
		int coinMoney = this.coin.getMoney();
		if (!this.wallet.canPayment(coinMoney)) {
			return;
		}
		this.wallet.payment(coinMoney);
		this.deposit.receive(coinMoney);
	}
}