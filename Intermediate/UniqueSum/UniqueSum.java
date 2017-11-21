public class UniqueSum {
	
	public int uniqueSum(int x, int y, int z) {
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
	
}
