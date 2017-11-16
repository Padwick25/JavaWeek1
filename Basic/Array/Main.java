public class Main {
	
	public static int sumProd(int x, int y, boolean wantSum) {
		if(x == 0) {
			return y;
		} else if(y == 0) {
			return x;
		}
		if(wantSum) {
			return x + y;
		} else {
			return x*y;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 5, 6, 8, 11, 27, 0, 96};
		for(int n : array) {
			System.out.println(sumProd(n, 4, true));
		}
	}

}