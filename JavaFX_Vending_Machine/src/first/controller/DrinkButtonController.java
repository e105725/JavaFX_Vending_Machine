package first.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.IntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import first.action.handler.PurchaseEventHandler;
import first.model.Deposit;
import first.model.Drink;
import first.model.History;
import first.system.constant.FXMLFileName;

public final class DrinkButtonController extends ControllerAbstract {
	@FXML private Button nameButton;
	@FXML private RadioButton priceRadio;
	private final Drink drink;
	private final Deposit deposit;
	private final History history;
	
	public DrinkButtonController(Drink _drink, Deposit _deposit, History _history) {
		super(FXMLFileName.DRINK_BUTTON);
		this.drink = _drink;
		this.deposit = _deposit;
		this.history = _history;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.nameButton.setText(this.drink.getName());
		this.priceRadio.setText(Integer.toString(this.drink.getPrice()));
		
		IntegerProperty moneyProperty = this.deposit.moneyProperty();
		int price = this.drink.getPrice();
		BooleanBinding selectedBinding = moneyProperty.greaterThanOrEqualTo(price);
		this.priceRadio.selectedProperty().bind(selectedBinding);
		
		PurchaseEventHandler purchaseHandler = new PurchaseEventHandler(this.drink, this.deposit, this.history);
		this.nameButton.setOnAction(purchaseHandler);
	}
}