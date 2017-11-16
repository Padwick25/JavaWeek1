public class Person {
	private String name;
	private int age;
	private String jobTitle;
	
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	public String toString() {
		return name + " is " + age + " years old. They are a " + jobTitle + ".";
	}
	
	public String getName() {
		return name;
	}
	
}