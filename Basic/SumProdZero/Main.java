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
		System.out.println(sumProd(0, 26, true));
		System.out.println(sumProd(9, 0, true));
		System.out.println(sumProd(0, 26, false));
		System.out.println(sumProd(9, 0, false));
		System.out.println(sumProd(9, 26, false));
		System.out.println(sumProd(9, 26, true));
	}

}