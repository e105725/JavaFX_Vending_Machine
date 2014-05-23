package first;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import first.controller.MainFrameController;
import first.system.tool.FileTool;

public final class VendingMachine extends Application {
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) {
		MainFrameController controller = new MainFrameController();
		BorderPane root = (BorderPane) FileTool.fxmlLoad(controller);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setMinHeight(640);
		stage.setMinWidth(400);
		
		stage.setMaxHeight(720);
		stage.setMaxWidth(480);
		stage.show();
	}
}