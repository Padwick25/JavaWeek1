import java.util.Scanner;

public class Main {
	
	public static int uniqueSum(int x, int y, int z) {
		if(x == y) {
			if(x == z) {
				return 0;
			} else {
				x = 0;
				y = 0;
			}
		} else if(x == z) {
			x = 0;
			z = 0;
		} else if(y == z) {
			y = 0;
			z = 0;
		}
		
		return x + y + z;
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("First Number: ");
		int x = Integer.parseInt(reader.nextLine());
		System.out.print("Second Number: ");
		int y = Integer.parseInt(reader.nextLine());
		System.out.print("Third Number: ");
		int z = Integer.parseInt(reader.nextLine());
		
		System.out.println(uniqueSum(x, y, z));
	}
	
}