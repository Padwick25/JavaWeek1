public class People {
	private String name;
	private String occupation;
	private int age;
	
	public People(String name, String occupation, int age) {
		this.name = name;
		this.occupation = occupation;
		this.age = age;
	}
	
	public String toString() {
		return "Name: " + this.name + ", occupation: " + this.occupation + ", age: " + this.age;
	}
}
