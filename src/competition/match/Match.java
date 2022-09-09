package competition.match;

import competition.competitor.Competitor;

/**
 * 
 * Interface class to implements different type of Match
 * 
 * @author Lounes Meddahi and Matthieu Medeng Essia
 *
 */
public interface Match {		
	
	/**
	 * Method that declares the winner at the end of the match
	 * @param competitor1 first competitor
	 * @param competitor2 second competitor
	 * @return the winner of the match
	 */
	public Competitor declareWinner(Competitor competitor1 , Competitor competitor2);
	
	
}
