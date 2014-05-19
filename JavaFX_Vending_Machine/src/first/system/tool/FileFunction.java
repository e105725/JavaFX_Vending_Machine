package first.system.tool;

import java.net.URL;

import first.VendingMachine;

public class FileFunction {
	public static URL getFxmlUrl(String fileName) {
		URL url = VendingMachine.class.getResource("view/fxml/" + fileName);
		return url;
	}
}