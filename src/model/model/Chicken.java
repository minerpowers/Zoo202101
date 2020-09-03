package model;

public class Chicken {
	private String name;
	private String breed;
	private int age;
	
	public Chicken() {
		super();
	}
	
	public Chicken(String name, String breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public String makeNoise() {
		return "Cluck";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
