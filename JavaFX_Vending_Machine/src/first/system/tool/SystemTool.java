package first.system.tool;

import java.util.Random;

//取り敢えず作ったが、必要ない気もする。
//もう少し大きなプログラムならば需要はあると思う
public final class SystemTool {
	private SystemTool() {
	}
	
	public static final Random RANDOM = new Random(System.currentTimeMillis());
}