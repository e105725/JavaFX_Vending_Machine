package first.function;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import first.controller.ControllerAbstract;

public class SceneBuilderFunction {
	
	public static Node FxmlLoad(ControllerAbstract controller) {
		String fxmlFileName = controller.getFileName();
		URL url = FileFunction.getFxmlUrl(fxmlFileName);
		FXMLLoader loader = new FXMLLoader(url);
		Node node = null;
		loader.setRoot(node);
		loader.setController(controller);
		try {
			loader.load();
		} catch (IOException e) {
			System.out.println(url.getFile() + "を読み込めませんでした");
			e.printStackTrace();
		}
		return node;
	}
}
