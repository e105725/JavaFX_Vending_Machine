package first;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import first.controller.MainFrameController;
import first.system.constant.FXMLFileName;
import first.system.tool.FileFunction;

public class VendingMachine extends Application {
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) {
		MainFrameController controller = new MainFrameController(FXMLFileName.MAIN_FRAME);
		AnchorPane root = (AnchorPane) FileFunction.fxmlLoad(controller);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}