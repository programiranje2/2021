package music;

import util.Nationality;

public class Musician {
	
	private String name;
	private Nationality nationality;
	private boolean alive;
	private int age;
	
	public Musician(String name, Nationality nationality, boolean alive, int age) {
		super();
		this.name = name;
		this.nationality = nationality;
		this.age = age;
		this.alive = alive;
	}

	public Musician(String name, boolean alive, int age) {
		super();
		this.name = name;
		this.alive = alive;
		this.age = age;
	}

	public Musician() {
		super();
	}
	
	@Override
	public String toString() {
//		return this.name + " (" + (this.alive ? this.age : "passed away") + ")";
		return this.name + " (" + (this.alive ? this.age : "passed away") + "), " + nationality.name();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public Nationality getNationality() {
		return nationality;
	}

	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}

}
