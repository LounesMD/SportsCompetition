package competition.observer;

import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import competition.MockCompetition;
import competition.competitor.Competitor;
import competition.observer.util.MockMatchObserver;

public class ObserverTest {

	private Competitor c1;
	private Competitor c2;
	private MockMatchObserver observer;
	
	@BeforeEach
	public void init() {
		this.observer = new MockMatchObserver();
		this.c1 = new Competitor("c1");
		this.c2 = new Competitor("c2");
		this.observer.addCompetitor(c1);
		this.observer.addCompetitor(c2);
	}
	
	@Test
	public void observerCorrectlyAdded() {
		Competitor c3 = new Competitor("c3");
		assertFalse(this.observer.getCompetitors().containsKey(c3));
		this.observer.addCompetitor(c3);
		assertTrue(this.observer.getCompetitors().containsKey(c3));
		assertEquals(1, this.observer.getCompetitors().get(c3));
	}
	
	@Test
	public void reactionCorrectlyApplied() {
		assertEquals(1, (this.observer).getCompetitors().get(c1));
		assertEquals(1, (this.observer).getCompetitors().get(c2));
		
		this.observer.reactToMatch(c1, c2);
		
		assertEquals(2, (this.observer).getCompetitors().get(c1));
		assertEquals(0, (this.observer).getCompetitors().get(c2));
	}
}
