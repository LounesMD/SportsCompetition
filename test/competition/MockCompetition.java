package competition;

import java.util.List;

import competition.Competition;
import competition.competitor.Competitor;
import competition.match.MockMatch;
import competition.match.util.RandomMatch;

/**
 * Mock of a competition
 * 
 * @author Lounes Meddahi and Matthieu Medeng Essia
 *
 */
public class MockCompetition extends Competition {
	
	public int protectedPlayIsUsed = 0;
	public int protectedPlayMatchIsUsed = 0;

	/**
	 * @param competitors of the competition
	 */
	public MockCompetition(List<Competitor> competitors) {
		super(competitors);
		this.match = new MockMatch();
	}
	

	/**
	 * For this Mock, every competitor play 2 matches against the same competitor (home-and-back match)
	 */
	protected void play(List<Competitor> competitors) {
		this.protectedPlayIsUsed+=1;
		for (Competitor attacker : competitors ) {
			for(Competitor defender : competitors) {
				this.playMatch(attacker, defender);
			}
		}
	}
	
	/**
	 * This method try if we really use playMatch when we use play
	 */
	protected void playMatch(Competitor c1 , Competitor c2) {
		this.protectedPlayMatchIsUsed += 1;
		super.playMatch(c1, c2);
	}
} 
