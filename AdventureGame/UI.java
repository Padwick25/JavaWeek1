import java.util.Scanner;

public class UI {
	
	public void start() {
		
		Scanner reader = new Scanner(System.in);
		Map map = new Map();
		Player player = new Player();
		String user;
		
		System.out.println("");
		help();
		
		while(map.getXPlayerLocation() != map.getXChestLocation() || map.getYPlayerLocation() != map.getYChestLocation()) {
			
			System.out.print("What next? ");
			user = reader.nextLine();
			user = user.toLowerCase();
			
			if(user.equals("n") || user.equals("north")) {
				map.moveN();
				player.loseHealth();
			} else if(user.equals("s") || user.equals("south")) {
				map.moveS();
				player.loseHealth();
			} else if(user.equals("e") || user.equals("east")) {
				map.moveE();
				player.loseHealth();
			} else if(user.equals("w") || user.equals("west")) {
				map.moveW();
				player.loseHealth();
			} else if(user.equals("weast")) {
				System.out.println("You moved weast.");
				player.loseHealth();
			} else if(user.equals("help")) {
				help();
			} else if(user.equals("look")) {
				distance(map);
			} else if(user.equals("quit")) {
				System.out.println("Oh fine, fuck off then.");
				break;
			} else if(user.equals("equip")) {
				player.equipWeapon();
			} else if(user.equals("heal")) {
				player.useHealing();
			} else if(user.equals("status")) {
				System.out.println("Inventory:");
				player.displayInv();
				System.out.println();
				System.out.println("HP:");
				System.out.println(player.getHealth());
			} else if(user.equals("view")) {
				System.out.println("Which item would you like to view?");
				String command = reader.nextLine();
				player.lookItem(command);
			} else if(user.equals("drop")) {
				System.out.println("Which item would you like to drop?");
				String command = reader.nextLine();
				player.dropItem(command);;
			} else {
				System.out.println("Sorry that wasn't a command, enter \"help\" to see the valid ones.");
			}
			if(player.getHealth() <= 0) {
				System.out.println(":PartyParrot: YOU DIED :PartyParrot:");
				break;
			}
			if(map.getXPlayerLocation() == map.getXChestLocation() && map.getYPlayerLocation() == map.getYChestLocation()) {
				System.out.println("You got the chest. Noice.");
				break;
			}
		}
	}
	
	public void help() {
		System.out.println("Help Menu:");
		System.out.println("\"help\": Brings up this menu.");
		System.out.println("Move: Enter \"north\", \"south\", \"east\", or \"west\", to move 5 meters in each direction.");
		System.out.println("\"status\": View your health and inventory.");
		System.out.println("\"look\": Look at the compass.");
		System.out.println("\"equip\": Equip a weapon.");
		System.out.println("\"heal\": Use a healing item in your inventory.");
		System.out.println("\"view\": Look closely at an item in your inventory.");
		System.out.println("\"drop\": Drop an item in your inventory.");
		System.out.println("\"quit\": quit the game (if ur bad).");
		
	}
	
	public void distance(Map map) {
		System.out.println("The dial reads " + map.distance() + " meters.");
	}
}
