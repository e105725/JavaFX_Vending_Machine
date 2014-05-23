package first.system.tool.node;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

//SceneBuilderから使える機能を管理するクラス。
//fit To Parent以外は・・・分からん。
public final class AnchorPaneTool {
	private AnchorPaneTool() {
	}
	
	//SceneBuilderのfit To Parentと同じ動きをするメソッド
	public static final void fitToParent(Node node) {
		AnchorPane.setTopAnchor(node, 0.0);
		AnchorPane.setRightAnchor(node, 0.0);
		AnchorPane.setBottomAnchor(node, 0.0);
		AnchorPane.setLeftAnchor(node, 0.0);
	}
}