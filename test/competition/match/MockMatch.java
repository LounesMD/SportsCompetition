package competition.match;

import competition.competitor.Competitor;

/**
 * Mock class to test the Match class.
 * 
 * @author Lounes Meddahi and Matthieu Medeng Essia
 *
 */
public class MockMatch implements Match{

	/**
	 * the winner will always be the first competitor
	 */
	@Override
	public Competitor declareWinner(Competitor competitor1, Competitor competitor2) {
		return competitor1;
	}
	
	
	
}


