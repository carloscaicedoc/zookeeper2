package com.carlos.zookeeper2;

public class Mammal {
	// ATTRIBUTES
	protected int energyLevel;
	protected String name;
	
	// CONSTRUCTORS
	
	public Mammal() {
		this.name = "Mammal";		
		this.energyLevel = 100;
	}
	
	// METHODS
	
	public int displayEnergy() {
		System.out.println("Energy Level; " + this.energyLevel);
		return energyLevel;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}			

}
