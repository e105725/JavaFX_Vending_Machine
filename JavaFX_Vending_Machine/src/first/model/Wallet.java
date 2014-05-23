package first.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import first.function.Calculator;
import first.system.constant.ConstantValue;

public final class Wallet {
	
	private final IntegerProperty moneyProperty;
	
	public Wallet() {
		this.moneyProperty = new SimpleIntegerProperty(ConstantValue.DEFAULT_WALLET_MONEY);
	}
	
	public final IntegerProperty moneyProperty() {
		return this.moneyProperty;
	}
	
	public final void payback(int receiveMoney) {
		int nowMoney = this.moneyProperty.get();
		int nextMoney = Calculator.addition(nowMoney, receiveMoney);
		this.moneyProperty.set(nextMoney);
	}
	
	public final void payment(int paymentMoney) {
		int nowMoney = this.moneyProperty.get();
		int nextMoney = Calculator.subtract(nowMoney, paymentMoney);
		this.moneyProperty.set(nextMoney);
	}
	
	public final boolean canPayment(int paymentMoney) {
		int nowMoney = this.moneyProperty.get();
		boolean canPayment = paymentMoney <= nowMoney;
		return canPayment;
	}
}