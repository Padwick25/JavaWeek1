import java.util.ArrayList;

public class Methods {
	
	public String search(ArrayList<Person> People, String name) {
		for(Person bloke : People) {
			if(bloke.getName().equals(name)) {
				return bloke.toString();
			}
		}
		return null;
	}
	
	public void run() {
		Person dave = new Person("Dave", 47, "Butcher");
		System.out.println(dave);
		
		Person steve = new Person("Steve", 34, "Baker");
		System.out.println(steve);
		
		Person kev = new Person("Kev", 26, "Candle Stick Maker");
		System.out.println(kev);
		
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(dave);
		people.add(steve);
		people.add(kev);
		
		for(Person bloke : people) {
			System.out.println(bloke.toString());
		}
		
		search(people, "Dave");
		search(people, "Chad");
	}
}
