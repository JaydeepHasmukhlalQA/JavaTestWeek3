package com.qa.Adventure;

public class PlayerBuilder {
	private String name;
	private int xPosition;
	private int yPosition;
	private boolean isNPC;
	private boolean canMove;
	private Compass compass;
	public PlayerBuilder() {
		
	}
	
	public PlayerBuilder setXPosition(int xPosition) {
		this.xPosition = xPosition;
		return this;
	}
	
	public PlayerBuilder setYPosition(int yPosition) {
		this.yPosition = yPosition;
		return this;
	}
	
	public PlayerBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public PlayerBuilder setIsNPC(boolean isNPC) {
		this.isNPC = isNPC;
		return this;
	}
	
	public PlayerBuilder setCanMove(boolean canMove) {
		this.canMove = canMove;
		return this;
	}
	
	public PlayerBuilder setCompass(Compass compass) {
		this.compass = compass;
		return this;
	}
	
	public BasicPlayer build() {
		return new BasicPlayer(name, xPosition, yPosition, isNPC, canMove, compass);
	}
}
