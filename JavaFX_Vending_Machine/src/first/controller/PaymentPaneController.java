package first.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.geometry.HPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import first.action.handler.PaymentEventHandler;
import first.action.handler.RefundEventHandler;
import first.model.Coin;
import first.model.Deposit;
import first.model.Wallet;
import first.system.constant.ConstantText;
import first.system.constant.ConstantValue;
import first.system.constant.FXMLFileName;
import first.system.tool.node.GridPaneTool;

public final class PaymentPaneController extends ControllerAbstract {
	@FXML private TextField walletTextField;
	@FXML private TextField depositTextField;
	@FXML private Button refundButton;
	@FXML private GridPane coinGrid;
	@FXML private Label walletLabel;
	@FXML private Label depositLabel;
	
	private final Deposit deposit;
	private final Wallet wallet;

	public PaymentPaneController(Deposit _deposit) {
		super(FXMLFileName.PAYMENT_PANE);
		this.deposit = _deposit;
		this.wallet = new Wallet();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.walletTextField.textProperty().bind(this.wallet.moneyProperty().asString());
		this.depositTextField.textProperty().bind(this.deposit.moneyProperty().asString());
		this.refundButton.setOnAction(new RefundEventHandler(this.wallet, this.deposit));
		this.initLabel();
		
		int coinGridColumnMax = ConstantValue.COIN_GRID_COLUMN_MAX;
		int coinNum = ConstantValue.COIN_MONEYS.length;
		int rowSize = coinNum / coinGridColumnMax;
		GridPaneTool.initColumnConstraints(this.coinGrid, coinGridColumnMax);
		GridPaneTool.initRowConstraints(this.coinGrid, rowSize);
		
		for(int index = 0; index < coinNum; index++) {
			Coin coin = new Coin(ConstantValue.COIN_MONEYS[index]);
			Button button = new Button(Integer.toString(coin.getMoney()));
			this.coinGrid.add(button, index / coinGridColumnMax, index % coinGridColumnMax);
			GridPane.setHalignment(button, HPos.CENTER);
			button.setOnAction(new PaymentEventHandler(this.wallet, this.deposit, coin));
		}
	}
	
	private final void initLabel() {
		this.walletLabel.setText(ConstantText.WALLET_LABEL_TEXT);
		this.depositLabel.setText(ConstantText.DEPOSIT_LABEL_TEXT);
	}
}