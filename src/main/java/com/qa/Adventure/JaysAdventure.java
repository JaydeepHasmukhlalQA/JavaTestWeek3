package com.qa.Adventure;

import java.util.Scanner;

public class JaysAdventure {

	public String ReadUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the player name: ");
		return scanner.nextLine();
	}
	public static void main(String[] args) {
		JaysAdventure JA = new JaysAdventure();
		World world = new World();
		
		String playerName = JA.ReadUserInput();
		Compass compass = new Compass("Compass", 9, 10);
		BasicPlayer basicPlayer = new PlayerBuilder().setXPosition(0).setYPosition(0).setName(playerName).build();
		
		world.setPlayer(basicPlayer);
	}

}
