
public class Main {
	
	public static int blackjack(int x, int y) {
		if(x > 21) {
			if(y > 21) {
				return 0;
			} else {
				return y;
			}
		} else if (y > 21) {
			return x;
		} else {
			if(x >= y) {
				return x;
			} else {
				return y;
			}
		}
	}
	
	public static void main(String args[]) {
		System.out.println(blackjack(1,1));
		System.out.println(blackjack(0,1));
		System.out.println(blackjack(1,0));
		System.out.println(blackjack(22,1));
		System.out.println(blackjack(1,22));
		System.out.println(blackjack(21,22));
		System.out.println(blackjack(22,21));
		System.out.println(blackjack(22,22));
	}
}
