package competition.competitor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompetitorTest {
	private String name1;
	private String name2;
	private String name3;
	private int add; 

	@BeforeEach
	public void init () {
		this.name1 = "FCB";
		this.name2 = "RMA";
		this.name3 = "FCB";
		this.add = 1;
	}
	
	@Test
	public void competitorIsCorrectlyDefined () {
		Competitor c = new Competitor(this.name1);
		assertEquals(c.getPoints(), 0);
		assertTrue(c.getName().equals(this.name1));
	}
	
	@Test
	public void pointsAreProperlyAdded () {
		Competitor c = new Competitor(this.name2);
		assertEquals(c.getPoints(), 0);
		c.addPoints(this.add);
		assertEquals(c.getPoints(), this.add);
	}
	
	@Test
	public void bothTeamsAreWellCompared () {
		Competitor c1 = new Competitor(this.name1);
		Competitor c2 = new Competitor(this.name2);
		Competitor c3 = new Competitor(this.name3);
		assertTrue(c1.equals(c3));
		assertFalse(c1.equals(c2));
		assertFalse(c2.equals(c3));
	}
}
