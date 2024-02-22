package ez0221.java.exam07.second;

public class Bag {
	private String brand;
	private String Model;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	
	void printBrand() {
		System.out.print("getBrand() : " + brand + " | ");
	}
	
	void printModel() {
		System.out.print("model : " + Model + " | ");
	}
	void printAll() {
		//printBrand();
		//printModel();
		System.out.println("brand : " + brand + "model : " + Model);
	}
	
	
}
