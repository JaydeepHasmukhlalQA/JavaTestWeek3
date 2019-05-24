package com.qa.Adventure;

public class Item implements MapPosition {
	String name;
	int xPosition;
	int yPosition;
	
	public Item(String name) {
		this.name = name;
	}
	
	public Item(String name, int xPosition, int yPosition) {
		this.name = name;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}
	
	public void setXPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getXPosition() {
		return this.xPosition;
	}

	public void setYPosition(int yPosition) {
		this.yPosition = yPosition;
	}

	public int getYPosition() {
		return this.yPosition;
	}
	
}
