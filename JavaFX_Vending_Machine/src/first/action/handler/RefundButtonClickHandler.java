package first.action.handler;

import first.model.Deposit;
import first.model.Wallet;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class RefundButtonClickHandler implements EventHandler<ActionEvent> {

	private final Wallet wallet;
	private final Deposit deposit;
	
	public RefundButtonClickHandler(Wallet _wallet, Deposit _deposit) {
		this.wallet = _wallet;
		this.deposit = _deposit;
	}

	@Override
	public void handle(ActionEvent arg0) {
		int refundMoney = this.deposit.refund();
		this.wallet.payback(refundMoney);
	}
}