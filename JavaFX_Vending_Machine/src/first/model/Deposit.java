package first.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import first.function.Calculator;
import first.system.constant.ConstantValue;

public final class Deposit {
	
	private final IntegerProperty moneyProperty;
	public Deposit() {
		this.moneyProperty = new SimpleIntegerProperty(ConstantValue.DEFAULT_DEPOSIT_MONEY);
	}
	
	public final IntegerProperty moneyProperty() {
		return this.moneyProperty;
	}
	
	public final void receive(int receiveMoney) {
		int nowMoney = this.moneyProperty.get();
		int nextMoney = Calculator.addition(nowMoney, receiveMoney);
		this.moneyProperty.set(nextMoney);
	}
	
	public final int refund() {
		int refundMoney = this.moneyProperty.get();
		this.moneyProperty.set(ConstantValue.DEFAULT_DEPOSIT_MONEY);
		return refundMoney;
	}
}