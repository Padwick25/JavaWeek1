public class Main {
	
	public static int sumProd(int x, int y, boolean wantSum) {
		if(wantSum) {
			return x + y;
		} else {
			return x*y;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(sumProd(9, 26, true));
		System.out.println(sumProd(9, 26, false));
	}

}
