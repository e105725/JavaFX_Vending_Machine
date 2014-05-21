package first.system.tool;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import first.VendingMachine;
import first.controller.ControllerAbstract;

//ファイルに関わるツール的機能を管理するクラス。
//fxmlやimageやcssの本体だったりurlを取ってきたりするメソッドを管理するクラス
//
public final class FileTool {
	
	private FileTool() {
	}
	
	public static URL getFxmlUrl(String fileName) {
		URL url = VendingMachine.class.getResource("view/fxml/" + fileName);
		return url;
	}

	//fxmlLoadするメソッド。LoadしたNodeクラスをリターンするので、呼び出し元はそいつをキャストして使う。
	public static Node fxmlLoad(ControllerAbstract controller) {
		String fxmlFileName = controller.getFileName();
		URL url = FileTool.getFxmlUrl(fxmlFileName);
		FXMLLoader loader = new FXMLLoader(url);
		loader.setController(controller);
		try {
			Node node = loader.load();
			return node;
		} catch (IOException e) {
			System.err.println(url.getFile() + "を読み込めませんでした");
			e.printStackTrace();
			return null;
		}
	}
}