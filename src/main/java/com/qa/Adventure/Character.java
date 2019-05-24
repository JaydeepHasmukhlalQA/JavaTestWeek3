package com.qa.Adventure;

public class Character implements MapPosition {
	int xPosition;
	int yPositin;
	private String name;
	private boolean isNPC;
	private boolean canMove;
	
	public Character(String name, int xPosition, int yPosition) {
		this.name = name;
		this.xPosition = xPosition;
		this.yPositin = yPosition;
	}
	
	public Character(String name, int xPosition, int yPosition, boolean isNPC, boolean canMove) {
		this.name = name;
		this.xPosition = xPosition;
		this.yPositin = yPosition;
		this.isNPC = isNPC;
		this.canMove = canMove;
	}
	
	public void setXPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	
	public int getXPosition() {
		return this.xPosition;
	}
	
	public void setYPosition(int yPosition) {
		this.yPositin = yPosition;
	}
	
	public int getYPosition() {
		return this.yPositin;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setIsNPC(boolean isNPC) {
		this.isNPC = isNPC;
	}
	
	public boolean getIsNPC() {
		return this.isNPC;
	}
	
	public void setCanMove(boolean canMove) {
		this.canMove = canMove;
	}
	
	public boolean getCanMove() {
		return this.canMove;
	}
}
