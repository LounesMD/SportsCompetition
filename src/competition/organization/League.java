package competition.organization;

import java.util.List;

import competition.Competition;
import competition.competitor.Competitor;

/**
 * Class to create a League
 * 
 * @author Lounes Meddahi and Matthieu Medeng Essia
 *
 */
public class League extends Competition {

	/**
	 * League constructor
	 * @param competitors of the league
	 */
	public League(List<Competitor> competitors) {
		super(competitors);
	}
	

	/**
	 * For a League, every competitor plays 2 matches against the same competitor (home-and-back match)
	 */
	protected void play(List<Competitor> competitors) {
		for (Competitor attacker : competitors ) {
			for(Competitor defender : competitors) {
				this.playMatch(attacker, defender);
			}
		}
	}
		

}
