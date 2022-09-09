package competition;

import competition.match.Match;
import competition.match.util.RandomMatch;
import competition.observer.MatchObserver;
import competition.organization.MapUtil;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import competition.competitor.*;

/**
 * abstract class to create a competition
 * 
 * @author Lounes Meddahi and Matthieu Medeng Essia
 *
 */
public abstract class Competition {
	
	protected static final StdDisplayer DISPLAYER = new StdDisplayer();	
	protected Match match;
	private final List<Competitor> competitors;
	private List<MatchObserver> observers;
	
	/**
	 * To play a competition, we need a list of competitors
	 * @param competitors of the competition
	 */
	public Competition(List<Competitor> competitors) {
		this.competitors = competitors;
		this.match = new RandomMatch();
		this.observers = new LinkedList<>();
	}
	
	/**
	 * This method is to be used to start a competition.
	 * The consequences is that all competitors from the list given in the constructor will play the competition, and gain points (if they win at least one match)
	 */
	public void play() {
		this.play(competitors);
	}
	 
	/**
	 * This method starts a competition with competitors given in param 
	 * @param competitors that will play the competition
	 */
	protected abstract void play(List<Competitor> competitors);
	
	/**
	 * This method designates the winner between c1 and c2.
	 * This method depends on the type of match we used to play a match.
	 * @param c1 first competitor
	 * @param c2 second competitor
	 */
	protected void playMatch(Competitor c1 , Competitor c2) {
		if(! c1.equals(c2)) { //To avoid winning against yourself
			Competitor winner = this.match.declareWinner(c1, c2);
			winner.addPoints(1);			
			DISPLAYER.displayCompetitionMsg(c1.getName()+" vs "+c2.getName()+" --> "+winner.getName()+" wins!");
			if(winner.equals(c1)) {
				newMatchDetected(winner,c2);
			}
			else {
				newMatchDetected(winner,c1);
			}
			
		}
	}
	 
	/**
	 * Method to get the ranking of all competitors
	 * @return a map with the ranking of all competitors
	 */
	public Map<Competitor,Integer> ranking(){		
		Map<Competitor , Integer> Mapcompetitors = new HashMap<Competitor , Integer>();
		for (Competitor c : this.competitors) {
			Mapcompetitors.put(c, c.getPoints());
		}
		
		return MapUtil.sortByDescendingValue(Mapcompetitors);
		}
	
	/**
	 * returns the list of all competitors
	 * @return the list of all competitors
	 */
	public List<Competitor> getCompetitors(){
		return this.competitors;
	}
	
	/**
	 * returns the match used to play the competition
	 * @return the match used to play the competition
	 */
	public Match getMatch() {
		return this.match;
	}
	
	/**
	 * returns the tournament winner
	 * @return the tournament winner
	 */
	public Competitor displayWinner() {
		return ranking().keySet().iterator().next();
	}

	/**
	 * this method add a MatchObserver to the observers list
	 * @param observer to be added
	 */
	public void register(MatchObserver observer) {
		if(! this.observers.contains(observer)) {
			this.observers.add(observer);}
	}
	
	/**
	 * this method remove a MatchObserver to the observers list
	 * @param observer to be removed
	 */
	public void unregister(MatchObserver observer) {
		if(this.observers.contains(observer)) {
			this.observers.remove(observer);}
	}
	
	/**
	 * This method spreads the information about the match between two competitors
	 * @param winner of the match
	 * @param loser of the match
	 */
	public void newMatchDetected(Competitor winner,Competitor loser) {
		for(MatchObserver observer : this.observers) {
			observer.reactToMatch(winner, loser);
		}
	}
	
	/**
	 * this function returns the MatchOberservers of the competition
	 * @return the MatchOberservers of the competition
	 */
	public List<MatchObserver> getMatchObservers(){
		return this.observers;
		}
	}
