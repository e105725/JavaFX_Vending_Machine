package first.controller;

import java.util.HashMap;

import javafx.fxml.Initializable;

public abstract class ControllerAbstract extends HashMap<String, ControllerAbstract> implements Initializable {
	private final String fxmlFileName;
	
	protected ControllerAbstract(String _fxmlFileName) {
		this.fxmlFileName = _fxmlFileName;
	}

	public final String getFileName() {
		return this.fxmlFileName;
	}
}