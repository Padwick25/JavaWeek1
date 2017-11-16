public class Paint {
	private String name;
	private int ammount;
	private double price;
	private int metersSquaredPerLitre;
	
	public Paint(String name, int ammount, double price, int metersSquaredPerLitre) {
		this.name = name;
		this.ammount = ammount;
		this.price = price;
		this.metersSquaredPerLitre = metersSquaredPerLitre;
	}
	
	public double priceForCans(int numberOfCans) {
		return this.price * numberOfCans;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getSquareMeters() {
		return this.metersSquaredPerLitre;
	}
	
	public int getSquareMetersPerTin() {
		return this.metersSquaredPerLitre * this.ammount;
	}
	
	public String getName() {
		return this.name;
	}
}