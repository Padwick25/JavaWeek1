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
		for(int i = 0; i < 20; i++) {
			System.out.println(sumProd(i, 3, true));
		}
	}

}