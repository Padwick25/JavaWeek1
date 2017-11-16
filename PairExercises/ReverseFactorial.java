
public class ReverseFactorial {
	
	public static void reverseFactorial(int n) {
		int r = n;
		int i = 2;
		while(r % i == 0) {
			r /= i;
			i++;
		}
		if(r>1) {
			System.out.println("NONE");
		}else {
			i -= 1;
			if (i ==1) {
				System.out.println("0! or 1!");
			}else {
			System.out.println(i + "!");
			}
		}
	}

	public static void main(String[] args) {
		reverseFactorial(479001600);

	}

}
