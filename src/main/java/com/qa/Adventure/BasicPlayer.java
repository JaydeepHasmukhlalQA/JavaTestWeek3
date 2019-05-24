package com.qa.Adventure;

public class BasicPlayer extends Character implements Move {

	Compass compass;
	
	public BasicPlayer(String name, int xPosition, int yPosition) {
		super(name, xPosition, yPosition);
	}
	
	public BasicPlayer(String name, int xPosition, int yPosition, boolean isNPC, boolean canMove, Compass compass) {
		super(name, xPosition, yPosition, isNPC, canMove);
	}
	
	public void moveNorth() {
		int yPosition = this.getYPosition();
		yPosition++;
		this.setYPosition(yPosition);
	}

	public void moveSouth() {
		int yPosition = this.getYPosition();
		yPosition--;
		this.setYPosition(yPosition);
	}

	public void moveWest() {
		int xPositin = this.getXPosition();
		xPosition--;
		this.setXPosition(xPositin);
	}

	public void moveEast() {
		int xPosition = this.getXPosition();
		xPosition++;
		this.setXPosition(xPosition);
	}
	
	public void setCompass(Compass compass) {
		this.compass = compass;
	}
	
	public Compass getCompass() {
		return this.compass;
	}
	
}
