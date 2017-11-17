public class Item {
	private String name;
	private String info;
	
	public Item(String name, String info) {
		this.name = name;
		this.info = info;	
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getInfo() {
		return this.info;
	}
	
	public String toString() {
		return "Name: " + this.name + ". Info: " + this.info + ".";
	}

}
