public class Main {
	
	public static String doubleChar(String word) {
		String out = "";
		for(int i = 0; i < word.length(); i++) {
			out += word.charAt(i);
			out += word.charAt(i);
		}
		return out;
	}
	
	public static String getSandwich(String A) {
		int bread1 = A.indexOf("bread") + 5;
		if(bread1 == 4) {
			return "";
		}
		String bread1Gone = A.substring(bread1, A.length());
		int bread2 = bread1Gone.indexOf("bread");
		if(bread2 == -1) {
			return "";
		}
		return bread1Gone.substring(0, bread2);
	}
	
	public static boolean evenlySpace(int a, int b, int c) {
		int[] sort = new int[3];
		if(a < b && a < c) {
			sort[0] = a;
			if(b < c) {
				sort[1] = b;
				sort[2] = c;
			} else {
				sort[1] = c;
				sort[2] = b;
			}
		} else if(b < c) {
			sort[0] = b;
			if(a < c) {
				sort[1] = a;
				sort[2] = c;
			} else {
				sort[1] = c;
				sort[2] = a;
			}
		} else {
			sort[0] = c;
			if(a < b) {
				sort[1] = a;
				sort[2] = b;
			} else {
				sort[1] = b;
				sort[2] = a;
			}
		}
		
		if(sort[1] - sort[0] == sort[2] - sort[1]) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean endLy(String A) {
		if(A.length() < 2) {
			return false;
		}
		String ly = A.substring(A.length() - 2, A.length());
		if(ly.toLowerCase().equals("ly")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String nTwice(String word, int n) {
		String start = word.substring(0, n);
		String end = word.substring(word.length() - n, word.length());
		return start + end;
	}
	
	public static int fibonacci(int n) {
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else {
			int prev = 0;
			int out = 1;
			int newprev;
			for(int i = 0; i < n - 1; i++) {
				newprev = out;
				out += prev;
				prev = newprev;
			}
			return out;
		}
	}
	
	public static String stringClean(String A) {
		String out = "" + A.charAt(0);
		for(int i = 0; i < A.length() - 1; i++) {
			if(A.charAt(i) != A.charAt(i + 1)) {
				out += A.charAt(i + 1);
			}
		}
		return out;
	}
	
	public static int bunnyEars(int n) {		//not me
		if(n == 0) {
			return 0;
		}
		return 2 + bunnyEars(n - 1);
	}
	
	public static void printStars(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print("*");
		}
	}
	
	public static void printSpaces(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(" ");
		}
	}
	
	public static void printDiamond(int height) {
		if(height % 2 == 0) {
			int n = height / 2;
			for(int i = 0; i < n ; i++) {
				printSpaces(n - (i + 1));
				printStars(i + 1);
				printStars(i);
				System.out.println();
			}
			for(int i = 0; i < n; i++) {
				printSpaces(i);
				printStars(n - i);
				printStars(n - i - 1);
				System.out.println();
			}
		} else {
			int n = (height + 1) / 2;
			for(int i = 0; i < n ; i++) {
				printSpaces(n - (i + 1));
				printStars(i + 1);
				printStars(i);
				System.out.println();
			}
			for(int i = 1; i < n; i++) {
				printSpaces(i);
				printStars(n - i);
				printStars(n - i - 1);
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		//write stuff here...
	}
}