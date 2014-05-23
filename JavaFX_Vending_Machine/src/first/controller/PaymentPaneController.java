package first.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import first.action.handler.CoinClickHandler;
import first.action.handler.RefundButtonClickHandler;
import first.model.Coin;
import first.model.Deposit;
import first.model.Wallet;
import first.system.constant.ConstantValue;
import first.system.constant.FXMLFileName;
import first.system.tool.node.GridPaneTool;
import first.system.tool.node.NodeTool;

public class PaymentPaneController extends ControllerAbstract {

	@FXML private TextField walletTextField;
	@FXML private TextField depositTextField;
	@FXML private Button refundButton;
	@FXML private AnchorPane coinGridBase;
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
		
		RefundButtonClickHandler refundHandler = new RefundButtonClickHandler(this.wallet, this.deposit);
		this.refundButton.setOnAction(refundHandler);
		
		GridPane coinGrid = new GridPane();
		int coinGridColumnMax = ConstantValue.COIN_GRID_COLUMN_MAX;
		GridPaneTool.initColumnConstraints(coinGrid, coinGridColumnMax);
		for(int index = 0; index < ConstantValue.COIN_MONEYS.length; index++) {
			Coin coin = new Coin(ConstantValue.COIN_MONEYS[index]);
			String moneyText = Integer.toString(coin.getMoney());
			Button button = new Button(moneyText);
			coinGrid.add(button, index / coinGridColumnMax, index % coinGridColumnMax);
			coinGrid.setVgap(10);
			
			CoinClickHandler coinClickHandler = new CoinClickHandler(this.wallet, this.deposit, coin);
			button.setOnAction(coinClickHandler);
		}
		NodeTool.fitToParent(coinGrid);
		this.coinGridBase.getChildren().add(coinGrid);
	}
}