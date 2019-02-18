package course;

abstract public class Animal {
	
	//properties
	private int age;
	private String breed;
	
	//methods
	//abstract methods
	abstract public void eat();
	
	public void says() {
		System.out.println("This animal says a lot of stuff!");
	}
	
	public int getAge() {
		return this.age;
	}	
	public String getBreed() {
		return this.breed;
	}
	
	public void setAge(int age) {
		this.age = age;
	}	
	public void setBreed(String breed) {
		if ("".equals(breed)) this.breed = "kitty";
		else this.breed = breed;
	}		
}
