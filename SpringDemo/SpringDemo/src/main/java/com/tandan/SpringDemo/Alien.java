package com.tandan.SpringDemo;

public class Alien {
	//creating reference
	private Computer com;
	public Alien() {
		System.out.println("This is Alien");
	}
	public Alien(int age) {
		this.age=age;
	}
	//creating variables
	private int age;
	//generated getters and setters
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("Age assigned");
		this.age = age;
	}
	public void show() {
	System.out.println("Hello I am alien");
}
	public Computer getCom() {
		return com;
	}
	public void setCom(Computer com) {
		this.com = com;
	}
	
	public void compile() {
		com.compile();
	}
}


//now note that jvm has a container inside it and that is spring container
// also this container has classes inside it and gives us object