package course;

import course.Animal;

public class Cat extends Animal {
	private String name;
	
	//constructors
	public Cat() {
		this("", 0, "kitty");
	}
	public Cat(String name) {
		this(name, 0, "kitty");
	}
	public Cat(String name, int age) {
		this(name, age, "kitty");
	}
	public Cat(String name, int age, String breed) {
		setName(name);
		setAge(age);
		setBreed(breed);		
	}
	
	public void eat() {
		System.out.println("This cat eats mice and rice.");
	}
	public void says() {
		System.out.println("This cat miaows when being nice.");
	}
	
	public String getName() {
		return this.name;
	}	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return String.format("This pretty %s is named %s and it's %s years old.", getBreed(), name, getAge());
	}	
}