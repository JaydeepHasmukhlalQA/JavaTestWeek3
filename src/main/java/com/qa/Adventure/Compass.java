package com.qa.Adventure;

public class Compass extends Item {

	int objectiveXPosition;
	int objectiveYPosition;
	
	public Compass(String name, int objectiveXPosition, int objectiveYPosition) {
		super(name);
		this.objectiveXPosition = objectiveXPosition;
		this.objectiveYPosition = objectiveYPosition;
	}
	
	public void GetDistanceFromObjective() {
		
	}
	
}
