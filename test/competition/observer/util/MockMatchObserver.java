package competition.observer.util;

import java.util.HashMap;
import java.util.Map;

import competition.competitor.Competitor;
import competition.observer.MatchObserver;

public class MockMatchObserver implements MatchObserver {
	/**
	 * Competitors managed by the MatchObserver
	 */
	private Map<Competitor,Double> competitors;
	
	
	/**
	 * MockMatchObserver constructor
	 */
	public MockMatchObserver() {
		this.competitors = new HashMap<>();
	}
	
	
	/**
	 * incerment the odds of the competitor only if he is managed by the Mock
	 * @param comp competitor to be incremented
	 */
	private void increment(Competitor comp){
		if(competitors.containsKey(comp)) {
			competitors.replace(comp , competitors.get(comp)+1 );
		}
	}
	
	/**
	 * decerment the odds of the competitor only if he is managed by the Mock
	 * @param comp competitor to be incremented
	 */
	private void decrement(Competitor winner){
		if(competitors.containsKey(winner)) {
			competitors.replace(winner , competitors.get(winner)-1);
		}
	}
	
	/**
	 * Add a competitor to be managed by the Mock
	 * @param comp to be managed by the Mock
	 */
	public void addCompetitor(Competitor comp) {
		if(!competitors.containsKey(comp)) {
			this.competitors.put(comp, 1.0);
		}
	}


	@Override
	/**
	 * This methods react to the match between c1 and c2.
	 */
	public void reactToMatch(Competitor c1, Competitor c2) {
		addCompetitor(c1);
		addCompetitor(c2);
		
		increment(c1);
		decrement(c2);
	}

	
	/**
	 * returns competitors managed by the mock
	 * @return competitors managed by the mock
	 */
	public Map<Competitor,Double> getCompetitors(){
		return this.competitors;
	}

	public String getName() {
		return "MockMatch";
	}

}
