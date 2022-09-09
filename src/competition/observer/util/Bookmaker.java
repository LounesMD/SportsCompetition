package competition.observer.util;

import java.util.HashMap;
import java.util.Map;

import competition.competitor.Competitor;
import competition.observer.MatchObserver;

/**
 * Class to instantiate a Bookmaker
 * 
 * @author Lounes Meddahi and Matthieu Medeng Essia
 *
 */
public class Bookmaker implements MatchObserver{
	/**
	 * Competitors managed by the bookmaker
	 */
	private Map<Competitor,Double> competitors;
	
	/**
	 * name of the bookmaker
	 */
	private String name;
	
	/**
	 * Bookmaker constructor
	 * @param name of the bookmaker
	 */
	public Bookmaker(String name) {
		this.name = name;
		this.competitors = new HashMap<>();
	}
	
	
	/**
	 * incerment the odds of the looser only if he is managed by the Mock
	 * @param loser competitor to be incremented
	 */
	private void increment(Competitor loser){
		if(competitors.containsKey(loser)) {
			competitors.replace(loser , competitors.get(loser)*2 );
		}
	}
	
	/**
	 * decerment the odds of the winner only if he is managed by the Bookmaker
	 * @param winner competitor to be incremented
	 */
	private void decrement(Competitor winner){
		if(competitors.containsKey(winner)) {
			competitors.replace(winner , competitors.get(winner)/2 );
		}
	}
	
	/**
	 * Add a competitor to be managed by the bookmaker
	 * @param comp to be managed by the bookmaker
	 */
	public void addCompetitor(Competitor comp) {
		if(!competitors.containsKey(comp)) {
			this.competitors.put(comp, 1.0);
		}
	}


	@Override
	/**
	 * This method adjusts the odds
	 */
	public void reactToMatch(Competitor winner, Competitor loser) {
		addCompetitor(winner);
		addCompetitor(loser);
		DISPLAYER.displayObserverMsg(this.getName()+": Les cotes avant le match etaient de "+winner.getName()+" : "+this.competitors.get(winner)+ " et de "+loser.getName()+" : "+this.competitors.get(loser) );
		increment(loser);
		decrement(winner);
		DISPLAYER.displayObserverMsg(this.getName()+": elles sont desormais de "+winner.getName()+" : "+this.competitors.get(winner)+ " et de "+loser.getName()+" : "+this.competitors.get(loser)+" \n");		
	}

	/**
	 * return competitors managed by the bookmaker
	 * @return competitors managed by the bookmaker
	 */
	public Map<Competitor,Double> getCompetitors(){
		return this.competitors;
	}
	
	/**
	 * Return the name of the bookmaker
	 */
	public String getName() {
		return this.name;
	}
		
}
