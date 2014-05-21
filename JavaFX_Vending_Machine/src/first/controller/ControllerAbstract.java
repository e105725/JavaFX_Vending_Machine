package first.controller;

import javafx.fxml.Initializable;

public abstract class ControllerAbstract implements Initializable {
	private final String fxmlFileName;
	
	protected ControllerAbstract(String _fxmlFileName) {
		this.fxmlFileName = _fxmlFileName;
	}

	public final String getFileName() {
		return this.fxmlFileName;
	}
}