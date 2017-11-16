
public class DogComp {

	public static void positions(int place) {
		for(int i=1; i<100; i++) {
			if(i != place) {
				String a = Integer.toString(i);
				if(a.charAt(a.length() - 1) == '1' && i != 11) {
					a += "st";
				}else if(a.charAt(a.length() - 1) == '2' && i != 12) {
					a += "nd";
				}else if (a.charAt(a.length() - 1) == '3' && i != 13) {
					a += "rd";
				}else {
					a += "th"; 
					
				}if(place == 100) {
					if(i < 99) {
						System.out.print(a + ", ");
					}else {
						System.out.print(a + ".");
					}
				}else {
					if (i < 100) {
						System.out.print(a + ", ");
					}else {
						System.out.print(a + ".");
					}
				}
			}
			
		}if(place != 100) {
			System.out.print(100 + "th.");
		}
	}
	
	public static void main(String[] args) {
		positions(13);
	}
	
}
