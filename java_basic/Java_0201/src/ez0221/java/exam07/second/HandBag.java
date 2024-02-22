package ez0221.java.exam07.second;

public class HandBag extends Bag{
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	void printPrice() {
		System.out.print("price : " + price + "");
	}

	@Override
	void printAll() {
		//super.printBrand();
		//super.printModel();
		//printPrice();
		System.out.println("brand : " + getBrand() + " | model : "
				+ getModel() + " | " + "price : " + price);
	}
	
	
	
	
	
	
}
