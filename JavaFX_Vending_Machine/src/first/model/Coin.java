package first.model;

public final class Coin {

	private final int price;
	
	public Coin(int _price) {
		this.price = _price;
	}
	
	public final int getPrice() {
		return this.price;
	}
}