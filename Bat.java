package com.carlos.zookeeper2;

public class Bat extends Mammal {

	public Bat() {
		super();
		this.energyLevel = 300;
//		super.energyLevel = 300;
//		super.energyLevel(300;)
		// TODO Auto-generated constructor stub
	}
	
	public int fly() {
		System.out.println("Gheeeeeee Ghaaaaa Ghiiiiiii!");
		energyLevel -= 50;
		return energyLevel;
	}
	
	public int eatHumans() {		
		energyLevel += 25;
		return energyLevel;		
	}
	
	public int attackTown() {
		System.out.println("Fire Alert! - FIRE FIRE FIRE - The town is under attack!");
		energyLevel -= 100;
		return energyLevel;
	}
		

}


//public int throwSomething() {
//	System.out.println("Whatch out! The Gorilla is throwing something!");
//	energyLevel -= 5;	
//	return energyLevel;
//}