package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.*;

class GameTest2 {
	
	Scanner grab = new Scanner(System.in);
	
	Random rand = new Random();
	
	@Test
	void testComp() {
		String[] moves = {"Pershult", "Klyket", "Tjusig", "Skadis", "Hovolm"};
		List<String> movesList = Arrays.asList(moves);
		assertTrue(movesList.contains(Game.comp(rand)));
	}
	
	@Test
	void testPlayer() {
		String[] moves = {"Pershult", "Klyket", "Tjusig", "Skadis", "Hovolm"};
		List<String> movesList = Arrays.asList(moves);
		assertTrue(movesList.contains(Game.comp(rand)));
	}

}
