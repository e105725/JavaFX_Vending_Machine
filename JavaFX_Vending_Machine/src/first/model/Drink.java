package first.model;

import first.system.constant.ConstantText;
import first.system.constant.ConstantValue;
import first.system.tool.SystemTool;

public final class Drink {
	
	public static final String DRINK_GET_NAME = "name";
	public static final String DRINK_GET_PRICE = "price";
	
	private final String name;
	private final int price;
	
	public Drink() {
		int nameIndex = SystemTool.RANDOM.nextInt(ConstantText.DRINK_NAMES.length);
		this.name = ConstantText.DRINK_NAMES[nameIndex];
		int priceIndex = SystemTool.RANDOM.nextInt(ConstantValue.DRINK_PRICES.length);
		this.price = ConstantValue.DRINK_PRICES[priceIndex];
	}
	
	public final String getName() {
		return this.name;
	}
	
	public final int getPrice() {
		return this.price;
	}
}