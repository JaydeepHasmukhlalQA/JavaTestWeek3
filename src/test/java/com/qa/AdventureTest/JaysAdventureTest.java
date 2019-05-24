package com.qa.AdventureTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.qa.Adventure.BasicPlayer;
import com.qa.Adventure.PlayerBuilder;
import com.qa.Adventure.World;

public class JaysAdventureTest {
	
	World world;
	
	@Before
	public void initBefore() {
		world = new World();
	}
	
	@Test
	public void testMysteryWorldContainsPlayer() {
		BasicPlayer basicPlayer = new PlayerBuilder().setName("Jay").build();
		world.setPlayer(basicPlayer);
		BasicPlayer bp = world.getPlayer();
		System.out.println("got bp");
		String playerName = world.getPlayer().getName();
		assertEquals("Player is not in world.", "Jay", playerName);
	}
	
	@Test
	public void testPlayerHasMagicCompass() {
		BasicPlayer basicPlayer = new CharacterBuilder.isNPC(false).canMove(true).setName("jay").Build();
		Compass compass = basicPlayer.getCompass();
		assertEquals("Player doesn't have a compass.", Compass, compass);
	}
	
	@Test
	public void testPlayerCanMoveNorth() {
		BasicPlayer basicPlayer = new CharacterBuilder.isNPC(false).canMove(true).setName("jay").Build();
		String[] movement = basicPlayer.moveNorth();
		assertEquals("Player didn't move north", new String[] {"1", "North"}, movement);
	}
	
	@Test
	public void testPlayerCanMoveSouth() {
		BasicPlayer basicPlayer = new CharacterBuilder.isNPC(false).canMove(true).setName("jay").Build();
		String[] movement = basicPlayer.moveSouth();
		assertEquals("Player didn't move south", new String[] {"-1", "South"}, movement);
	}
	
	@Test
	public void testPlayerCanMoveEast() {
		BasicPlayer basicPlayer = new CharacterBuilder.isNPC(false).canMove(true).setName("jay").Build();
		String[] movement = basicPlayer.moveEast();
		assertEquals("Player didn't move east", new String[] {"1", "East"}, movement);
	}
	
	@Test
	public void testPlayerCanMoveWest() {
		BasicPlayer basicPlayer = new CharacterBuilder.isNPC(false).canMove(true).setName("jay").Build();
		String[] movement = basicPlayer.moveWest();
		assertEquals("Player didn't move west", new String[] {"-1", "West"}, movement);
	}
	
	@Test
	public void testMysterWorldContainsMap() {
		Map map = world.getMap();
		assertEquals("World doesn't contain map", Map, map);
	}
	
	

}
