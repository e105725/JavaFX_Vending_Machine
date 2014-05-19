package first.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import first.system.constant.FXMLFileName;

public class MainFrameController extends ControllerAbstract {
	@FXML private AnchorPane root;
	@FXML private Button button;
	@FXML private ComboBox<String> comboBox;
	private final String text;
	
	public MainFrameController(String text) {
		super(FXMLFileName.MAIN_FRAME);
		this.text = text;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.button.setText(this.text);
		this.button.setOnAction((event) -> System.out.println("hoge"));
	}
}