package first.system.tool.node;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public final class GridPaneTool {

	private GridPaneTool() {
	}

	public static final void initColumnConstraints(GridPane gridPane, int columnSize) {
		for (int index = 0; index < columnSize; index++) {
			ColumnConstraints constraints = new ColumnConstraints();
			double percentWidth = 100 / columnSize;
			constraints.setPercentWidth(percentWidth);
			gridPane.getColumnConstraints().add(constraints);
		}
	}

	public static final void initRowConstraints(GridPane gridPane, int rowSize) {
		for (int index = 0; index < rowSize; index++) {
			RowConstraints constraints = new RowConstraints();
			double percentHeight = 100 / rowSize;
			constraints.setPercentHeight(percentHeight);
			gridPane.getRowConstraints().add(constraints);
		}
	}
}