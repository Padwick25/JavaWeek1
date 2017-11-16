public class Main {
	
	public static boolean tooHot(int temp, boolean isSummer) {
		int lower = 60;
		int upper;
		if(isSummer) {
			upper = 100;
		} else {
			upper = 90;
		}
		
		if(temp < lower || temp > upper) {
			return false;
		} else {
			return true;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(tooHot(98, true));
		System.out.println(tooHot(98, false));
		System.out.println(tooHot(42, true));
		System.out.println(tooHot(42, false));
		System.out.println(tooHot(65, true));
		System.out.println(tooHot(65, false));
	}
	
}