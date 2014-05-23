package first.system.tool.node;

import javafx.collections.ObservableList;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public final class GridPaneTool {

	private GridPaneTool() {
	}

	public static final void initColumnConstraints(GridPane gridPane, int columnSize) {
		ObservableList<ColumnConstraints> list = gridPane.getColumnConstraints();
		list.clear();
		for (int index = 0; index < columnSize; index++) {
			ColumnConstraints constraints = new ColumnConstraints();
			double percentWidth = 100 / columnSize;
			constraints.setPercentWidth(percentWidth);
			list.add(constraints);
		}
	}

	public static final void initRowConstraints(GridPane gridPane, int rowSize) {
		ObservableList<RowConstraints> list = gridPane.getRowConstraints();
		list.clear();
		for (int index = 0; index < rowSize; index++) {
			RowConstraints constraints = new RowConstraints();
			double percentHeight = 100 / rowSize;
			constraints.setPercentHeight(percentHeight);
			list.add(constraints);
		}
	}
}