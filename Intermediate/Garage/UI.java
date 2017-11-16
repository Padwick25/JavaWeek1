public class UI {

	public void start() {
		Vehicle bmw = new Car("BMW M6", "ABCDEFG", 3, 1000);
		Vehicle ducati = new Motorcycle("Ducati Bike Mobile", "1234567", 1, 100);
		Vehicle londonBus = new Bus("London Bus", "ABCD123", 10, 4, 100000);
		Vehicle bmw2 = new Car("BMW M6", "ABCD123", 4, 10000);
		Vehicle bmw3 = new Car("BMW M6", "ABCD124", 5, 10001);

		Garage davesRipOffGarage = new Garage();

		davesRipOffGarage.addGarage(bmw);

		davesRipOffGarage.printVehicles();
		System.out.println();

		davesRipOffGarage.addGarage(ducati);

		davesRipOffGarage.printVehicles();
		System.out.println();

		davesRipOffGarage.addGarage(londonBus);

		davesRipOffGarage.printVehicles();
		System.out.println();

		davesRipOffGarage.addGarage(bmw2);

		davesRipOffGarage.printVehicles();
		System.out.println();

		davesRipOffGarage.addGarage(bmw3);

		davesRipOffGarage.printVehicles();
		System.out.println();

		davesRipOffGarage.searchName("BMW M6");

		davesRipOffGarage.fix("ABCD124");

		davesRipOffGarage.searchName("BMW M6");

		davesRipOffGarage.removeGarage("BMW M6");
		
		System.out.println();
		davesRipOffGarage.printVehicles();
		
		davesRipOffGarage.emptyGarage();
		
		davesRipOffGarage.printVehicles();
	}

}
