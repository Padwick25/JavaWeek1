import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> contents;

	public Garage() {
		this.contents = new ArrayList<Vehicle>();
	}

	public void addGarage(Vehicle v) {
		this.contents.add(v);
	}

	public void removeGarage(String name) {
		int l = this.contents.size();
		int counter = 0;
		while (l == this.contents.size() && counter < this.contents.size()) {
			if (this.contents.get(counter).getName().equals(name)) {
				this.contents.remove(this.contents.get(counter));
				System.out.println("Vehicle Removed.");
			}
			counter++;
		}
		if (l > this.contents.size()) {
			removeGarage(name);
		}
	}

	public void removeGarageReg(String reg) {
		for (Vehicle v : this.contents) {
			if (v.getReg().equals(reg)) {
				this.contents.remove(v);
				System.out.println("Vehicle removed.");
				break;
			}
		}
	}

	public void emptyGarage() {
		this.contents.clear();
		System.out.println("Garage emptied!");
	}

	public int calculateBill(Vehicle v) {
		if (this.contents.contains(v)) {
			int total = 0;
			if (v instanceof Car) {
				total += 20;
			} else if (v instanceof Bus) {
				total += 40;
			}
			total += (v.getAge() * 10) + v.getMileage() + (v.getWheels() * 5);
			return total;
		} else {
			return 0;
		}
	}

	public void printVehicles() {
		for (Vehicle v : this.contents) {
			System.out.print(v + ", bill cost: £");
			System.out.println(calculateBill(v));
		}
	}

	public void searchName(String name) {
		for (Vehicle v : this.contents) {
			if (v.getName().equals(name)) {
				System.out.print(v);
				System.out.println(", Bill: £" + calculateBill(v));
			}
		}
	}

	public void searchReg(String reg) {
		for (Vehicle v : this.contents) {
			if (v.getReg().equals(reg)) {
				System.out.print(v);
				System.out.println(", Bill: £" + calculateBill(v));
			}
		}
	}

	public void fix(String reg) {
		for(Vehicle v :  this.contents) {
			if(v.getReg().equals(reg)) {
				System.out.println(v.getName() + " reg " + v.getReg() + "has been billed £" + calculateBill(v));
				this.contents.remove(v);
				break;
			}
		}
	}
}