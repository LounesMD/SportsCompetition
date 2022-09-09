package competition.observer;

import competition.StdDisplayer;
import competition.competitor.Competitor;
/**
 * Class to creat a match observer
 * 
 * @author Lounes Meddahi and Matthieu Medeng Essia
 *
 */
public interface MatchObserver {
	
	static final StdDisplayer DISPLAYER = new StdDisplayer();	
	
	/**
	 * abstract method used by the observer to react to the match
	 * @param winner of the match
	 * @param loser of the match
	 */
	public void reactToMatch(Competitor winner , Competitor loser);
}
