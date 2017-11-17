public class Weapon extends Item {
	private int damage;
	
	public Weapon(String name, String info, int damage) {
		super(name, info);
		this.damage = damage;
	}
	
	public int getDamage() {
		return this.damage;
	}
	
	public String toString() {
		return "Name: " + super.getName() + ". Info: " + super.getInfo() + ". Damage: " + this.damage + " hp.";
	}

}
