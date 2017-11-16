public class Vehicle {
	private String name;
	private String reg;
	private int age;
	private int wheels;
	private int mileage;

	public Vehicle(String name, String reg, int age, int wheels, int mileage) {
		this.name = name;
		this.reg = reg;
		this.age = age;
		this.wheels = wheels;
		this.mileage = mileage;
	}

	public String getName() {
		return this.name;
	}

	public String getReg() {
		return this.reg;
	}

	public int getAge() {
		return this.age;
	}

	public int getMileage() {
		return this.mileage;
	}

	public int getWheels() {
		return this.wheels;
	}

	public String toString() {
		return "Name: " + this.name + ", reg: " + this.reg + ", age: " + this.age + ", mileage: " + this.mileage;
	}
}
