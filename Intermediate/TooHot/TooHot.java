public class TooHot {
	
	public boolean tooHot(int temp, boolean isSummer) {
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
}
