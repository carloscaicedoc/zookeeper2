package com.carlos.zookeeper2;

public class BatTest {
	
	public static void main(String[] args) {
		
		System.out.println("******* BAT ATTACK ********");
		Bat b1 = new Bat();
		b1.displayEnergy();	
		b1.attackTown();
		b1.attackTown();
		b1.attackTown();
		b1.displayEnergy();
		b1.eatHumans();
		b1.eatHumans();
		b1.displayEnergy();
		b1.fly();
		b1.fly();
		b1.displayEnergy();
								
	}

}
