import java.util.Random;

public class Map {
	private int xPlayerLocation;
	private int yPlayerLocation;
	private int xChestLocation;
	private int yChestLocation;
	
	public Map() {
		this.xPlayerLocation = 0;
		this.yPlayerLocation = 0;
		this.xChestLocation = (5 + random(5)) * coinFlip();
		this.yChestLocation = (5 + random(5)) * coinFlip();;
	}
	
	public int random(int bound) {
		Random rand = new Random();
		return rand.nextInt(bound + 1);
	}
	
	public int coinFlip() {
		Random rand = new Random();
		int flip = rand.nextInt(2);
		if(flip == 0) {
			return -1;
		} else {
			return 1;
		}
	}
	
	public int getXPlayerLocation() {
		return xPlayerLocation;
	}

	public int getYPlayerLocation() {
		return yPlayerLocation;
	}

	public int getXChestLocation() {
		return xChestLocation;
	}

	public int getYChestLocation() {
		return yChestLocation;
	}
	
	public void moveN() {
		xPlayerLocation++;
		System.out.println("You moved north.");
	}
	
	public void moveS() {
		xPlayerLocation--;
		System.out.println("You moved south.");
	}
	
	public void moveE() {
		yPlayerLocation++;
		System.out.println("You moved east.");
	}
	
	public void moveW() {
		yPlayerLocation--;
		System.out.println("You moved west.");
	}
	
	public double distance() {
		return Math.sqrt(Math.pow((5 * (this.xPlayerLocation - this.xChestLocation)), 2) + Math.pow(5 * (this.yPlayerLocation - this.yChestLocation), 2));
	}
	
	/*public void spawnItem() {
		if(random(10) < 3) {
			System.out.println("There appears to be something in the mud. Pick it up? (y/n) ");
			
			String command = reader1.nextLine;
			if()
		}
	}*/
}