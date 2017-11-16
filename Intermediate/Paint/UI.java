public class UI {

	public int cansForRoom(Room room, Paint paint) {
		int total = 0;
		int leftToPaint = room.getSize();
		while (paint.getSquareMetersPerTin() <= leftToPaint) {
			total++;
			leftToPaint -= paint.getSquareMetersPerTin();
		}
		if (leftToPaint > 0) {
			total++;
		}
		return total;
	}
	
	public Paint leastWasted(Room room, Paint paint1, Paint paint2, Paint paint3) {
		double a = wastedPaint(room, paint1);
		double b = wastedPaint(room, paint2);
		double c = wastedPaint(room, paint3);
		if(min(a, b, c) == a) {
			return paint1;
		} else if(min(a, b, c) == b) {
			return paint2;
		} else {
			return paint3;
		}
	}
	
	public Paint cheapest(Room room, Paint paint1, Paint paint2, Paint paint3) {
		double a = paint1.priceForCans(cansForRoom(room, paint1));
		double b = paint2.priceForCans(cansForRoom(room, paint2));
		double c = paint3.priceForCans(cansForRoom(room, paint3));
		if(min(a, b, c) == a) {
			return paint1;
		} else if(min(a, b, c) == b) {
			return paint2;
		} else {
			return paint3;
		}
	}
	
	public double wastedPaint(Room room, Paint paint) {
		int leftToPaint = room.getSize();
		while (paint.getSquareMetersPerTin() <= leftToPaint) {
			leftToPaint -= paint.getSquareMetersPerTin();
		}
		if(leftToPaint == 0) {
			return 0;
		}
		int m2 = paint.getSquareMetersPerTin() - leftToPaint;
		return (1.0 * m2) / paint.getSquareMeters();
	}

	public double min(double a, double b, double c) {
		double result = a;
		if (result > b) {
			result = b;
		}
		if (result > c) {
			result = c;
		}
		return result;
	}

	public void start() {
		Room room = new Room(4290);
		Paint cM = new Paint("Cheapo Max", 20, 19.99, 10);
		Paint aJ = new Paint("Average Joes", 15, 17.99, 11);
		Paint dP = new Paint("Duluxourous Paints", 10, 25, 20);

		System.out.println("Number of cans needed for " + cM.getName() + ", " + aJ.getName() + ", and " + dP.getName() + " respectively.");
		System.out.println(cansForRoom(room, cM) + " cans");
		System.out.println(cansForRoom(room, aJ) + " cans");
		System.out.println(cansForRoom(room, dP) + " cans");
		System.out.println();
		
		System.out.println("So respectively, these cost:");
		System.out.println("£" + cM.priceForCans(cansForRoom(room, cM)));
		System.out.println("£" + aJ.priceForCans(cansForRoom(room, aJ)));
		System.out.println("£" + dP.priceForCans(cansForRoom(room, dP)));
		System.out.println();
		
		System.out.println("The wasted paint for each can respectively is:");
		
		double a = wastedPaint(room, cM);
		double b = wastedPaint(room, aJ);
		double c = wastedPaint(room, dP);
		
		System.out.println(a + " litres.");
		System.out.println(b + " litres.");
		System.out.println(c + " litres.");
		System.out.println();
		
		System.out.println("So the brand that wastes the least is " + leastWasted(room, cM, aJ, dP).getName());
		System.out.println("and the cheapest brand is " + cheapest(room, cM, aJ, dP).getName());
	}
}
