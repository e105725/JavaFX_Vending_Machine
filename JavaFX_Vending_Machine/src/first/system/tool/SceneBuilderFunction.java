package first.system.tool;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

//SceneBuilderから使える機能を管理するクラス。
//fit To Parent以外は・・・分からん。
public class SceneBuilderFunction {
	
	//SceneBuilderのfit To Parentと同じ動きをするメソッド
	public static void fitToParent(Node node) {
		AnchorPane.setTopAnchor(node, 0.0);
		AnchorPane.setRightAnchor(node, 0.0);
		AnchorPane.setBottomAnchor(node, 0.0);
		AnchorPane.setLeftAnchor(node, 0.0);
	}
}