public class Healing extends Item {
	private int healing;
	
	public Healing(String name, String info, int healing) {
		super(name, info);
		this.healing = healing;
	}
	
	public int getHealing() {
		return this.healing;
	}
	
	public String toString() {
		return "Name: " + super.getName() + ". Info: " + super.getInfo() + ". Damage: " + this.healing + " hp.";
	}
}
