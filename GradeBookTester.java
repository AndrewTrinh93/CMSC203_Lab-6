import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook g1, g2;

	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(60);
		g1.addScore(75);
		
		g2 = new GradeBook(5);
		g2.addScore(80);
		g2.addScore(85);
		g2.addScore(60);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().trim().equals("60.0 75.0 0.0 0.0 0.0"));
		assertEquals(g1.getScoreSize(),2);
		assertTrue(g2.toString().trim().equals("80.0 85.0 60.0 0.0 0.0"));
		assertEquals(g2.getScoreSize(),3);
		
	}

	@Test
	void testSum() {
		assertEquals(135, g1.sum(), .0001);
		assertEquals(225, g2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(60, g1.minimum(), .001);
		assertEquals(60, g2.minimum(), .001);

	}

	@Test
	void testFinalScore() {
		assertEquals(75, g1.finalScore(), .001);
		assertEquals(165, g2.finalScore(), .001);

	}

	@Test
	void testGetScoreSize() {
		assertEquals(g1.getScoreSize(),2);
		assertEquals(g2.getScoreSize(),3);
		
	}

	@Test
	void testToString() {
		assertTrue(g1.toString().trim().equalsIgnoreCase("60.0 75.0 0.0 0.0 0.0"));
		assertTrue(g2.toString().equals("80.0 85.0 60.0 0.0 0.0 "));
		
		
	}

}
