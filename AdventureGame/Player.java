import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Player {
	private int health;
	private int damage;
	private ArrayList<Item> inventory;
	private Weapon weapon;
	
	public Player() {
		this.health = 100;
		inventory = new ArrayList<Item>();
		Item compass = new Item("Compass", "A strange compass that points you in no direction, but displays a distance...");
		inventory.add(compass);
		Item rustySword = new Weapon("Rusty Sword", "A rust covered sword, not good for cutting twigs, let alone your enemies.", 10); 
		inventory.add(rustySword);
		Item bread = new Healing("Loaf of Bread", "Carrying a whole loaf around is a bit inconvenient, and eating it all at once is just strange. But hey, that's just how the game works.", 25);
		inventory.add(bread);
	}
	
	public void loseHealth() {
		health--;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void displayInv() {
		for(Item item : inventory) {
			System.out.println(item.getName());
		}
	}
	
	public void lookItem(String name) {
		for(Item item : inventory) {
			if(item.getName().toLowerCase() == name) {
				System.out.println(item.getName() + ": " + item.getInfo());
			}
		}
	}
	
	public void dropItem(String name) {
		for(Item item : inventory) {
			if(item.getName().toLowerCase() == name) {
				System.out.println("You dropped a" + item.getName() + ". It dissapears into the swamp forever....");
			}
		}
	}
	
	public void pickUpItem(Item item) {
		String command = "n";
		while(inventory.size() > 10 && !command.equals("y")) {
			Scanner reader2 = new Scanner(System.in);
			
			System.out.println("Your inventory is full! Drop something (y/n)? ");
			displayInv();
			command = reader2.nextLine();
			if(command.equals("y")) {
				while(!command.equals("n") && inventory.size() < 10) {				
					System.out.println("What item would you like to drop for " + item.getName());
					command = reader2.nextLine();
					dropItem(command);
				}
			}
			
		}
	}
	
	public void equipWeapon() {
		for(Item item : inventory) {
			if(item instanceof Weapon) {
				System.out.println(item);
				System.out.println("Equip? (y/n) ");
				Scanner reader2 = new Scanner(System.in);
				String command = reader2.nextLine();
				command = command.toLowerCase();
				if(command.equals("y")) {
					this.weapon = (Weapon)item;
					this.damage = ((Weapon)item).getDamage();
					System.out.println(item.getName() + " equipped.");
				}
			}
		}
	}
	
	public void printCurrentWeapon() {
		System.out.println("Currently equipper: " + this.weapon.getName());
	}
	
	public void useHealing() {
		for(Iterator<Item> iterator = inventory.iterator(); iterator.hasNext();) {
			Item i = iterator.next();
			if(i instanceof Healing) {
				System.out.println("Current health: " + getHealth());
				System.out.println(i);
				System.out.println("Use item? (y/n) ");
				Scanner reader2 = new Scanner(System.in);
				String command = reader2.nextLine();
				command = command.toLowerCase();
				if(command.equals("y")) {
					this.health += ((Healing)i).getHealing();
					iterator.remove();
					System.out.println("Used " + i.getName());
				}
			}
		
		}
	}
}
