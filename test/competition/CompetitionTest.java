package competition;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Observer;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import competition.competitor.Competitor;
import competition.match.MockMatch;
import competition.observer.util.MockMatchObserver;

class CompetitionTest { 
	
	private MockMatchObserver obs1;
	private MockMatchObserver obs2;
	private Competitor c1;
	private Competitor c2;
	private LinkedList<Competitor> competitors;
	private MockCompetition comp;
	private MockMatchObserver observer;

	
	@BeforeEach
	public void init () {
		this.competitors = new LinkedList<Competitor>();
		this.c1 = new Competitor("MCU");
		this.c2 = new Competitor("MCY");
		this.competitors.add(this.c1);
		this.competitors .add(this.c2);
		this.obs1 = new MockMatchObserver();
		this.obs2 = new MockMatchObserver();

		this.comp = new MockCompetition(this.competitors);
		
		this.observer = new MockMatchObserver();
		this.observer.addCompetitor(c1);
		this.observer.addCompetitor(c2);		
		this.comp.register(this.observer);
		
		
	}

	@Test
	public void competitionIsWellDefined () {
		assertEquals(2 , comp.getCompetitors().size());
		assertSame(this.competitors, comp.getCompetitors());
		assertTrue(comp.getMatch() instanceof MockMatch);
	}
	
	@Test
	public void winnerIsCorrectlyDisplayed () {
		for(Competitor x : comp.getCompetitors()) {
			assertEquals(0 , x.getPoints());
		}
		comp.play();
		for(Competitor c : comp.getCompetitors()) {
			assertTrue(comp.displayWinner().getPoints() >= c.getPoints());
		}
	}
	
	@Test
	public void competitorsRankIsCorrect () {
		assertEquals(2, comp.getCompetitors().size());
		comp.play();
		Map<Competitor, Integer> ranking = comp.ranking();
		for(Competitor c : comp.getCompetitors()) {
			assertTrue(ranking.containsKey(c));
			assertTrue(ranking.get(c) == c.getPoints());
		}
	}
	
	@Test
	public void matchIsCorrectlyPlayed () {
		int taille = comp.getCompetitors().size();
		assertEquals(2 , taille);
		for(Competitor c : comp.getCompetitors()) {
			assertEquals(c.getPoints(), 0);
		}
		int points = 0;
		comp.play();
		for(Competitor c : comp.getCompetitors()) {
			points += c.getPoints();
		}
		assertEquals( taille*(taille-1) , points);
	}
	
	@Test
	public void competitionIsProperlyPlayed () {
		assertEquals(2, comp.getCompetitors().size());
		for(Competitor c : comp.getCompetitors()) {
			assertEquals(c.getPoints(), 0);
		}
		int points = 0;
		comp.play();
		for(Competitor c : comp.getCompetitors()) {
			assertTrue(comp.displayWinner().getPoints() >= c.getPoints());
			points += c.getPoints();
		}
		assertEquals(2, points);
	}
	
	@Test
	public void playAndplaymatchAreWellUsed() {
		assertEquals(0 , comp.protectedPlayIsUsed);
		assertEquals(0 , comp.protectedPlayMatchIsUsed);
		
		comp.play();

		assertEquals(1 , comp.protectedPlayIsUsed);
		assertEquals(4 , comp.protectedPlayMatchIsUsed);
	}

	@Test
	public void observerIsWellAdded() {		
		assertEquals(0, comp.getMatchObservers().size());
		int nbOfObs = comp.getMatchObservers().size();
		comp.register(this.obs1);
		assertEquals(1, comp.getMatchObservers().size() - nbOfObs);
	}
	
	@Test
	public void observerIsWellRemoved() {
		comp.register(this.obs1);
		comp.register(this.obs2);
		int nbOfObs = comp.getMatchObservers().size();
		comp.unregister(this.obs2);
		assertEquals(1, nbOfObs - comp.getMatchObservers().size());
	}
	
	


	@Test
	public void matchResultsAreWellSpreaded() {		
		this.comp.play();
		
		assertEquals(2 , Math.abs(this.observer.getCompetitors().get(c1) - this.observer.getCompetitors().get(c2)) );
	}
	
}
