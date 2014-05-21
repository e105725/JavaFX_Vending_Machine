package first.function;

public final class Calculator {
	private Calculator() {
	}
	
	public static final int addition(int value, int addValue) {
		int result = value + addValue;
		return result;
	}
	
	public static final int subtract(int value, int subValue) {
		int result = value - subValue;
		return result;
	}
}