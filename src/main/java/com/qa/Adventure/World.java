package com.qa.Adventure;

import java.util.Scanner;

public class World {
	private boolean foundTeleporter;
	private BasicPlayer player;
	
	public World() {
		
	}
	
	@SuppressWarnings("resource")
	public String ReadUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the player name: ");
		return scanner.nextLine();
	}
	
	public void playGame() {
		while (!foundTeleporter) {
			System.out.println("Where would you want move?");
			System.out.println("North | South | West | East");
			System.out.print("Enter here: ");
			String userInput = ReadUserInput();
			
			
		}
	}
	
	public void setPlayer(BasicPlayer player) {
		this.player = player;
	}
	
	public BasicPlayer getPlayer() {
		return player;
	}
	
}
