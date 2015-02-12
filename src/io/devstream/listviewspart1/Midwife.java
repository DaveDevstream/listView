package io.devstream.listviewspart1;

public class Midwife {
	
	private String name;
	private String lastName;
	private int age;

	public Midwife() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString(){
		return name+" "+lastName+" "+age;
	}

}
