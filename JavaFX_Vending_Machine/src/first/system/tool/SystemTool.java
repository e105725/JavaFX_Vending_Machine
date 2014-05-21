package first.system.tool;

import java.util.Random;

public final class SystemTool {
	private SystemTool() {
	}
	
	public static final Random RANDOM = new Random(System.currentTimeMillis());
}