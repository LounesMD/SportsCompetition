package
competition.organization;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import competition.Competition;
import competition.competitor.Competitor;

/**
 * Class to create a tournament
 * 
 * @author Lounes Meddahi and Matthieu Medeng Essia
 *
 */
public class Tournament extends Competition {

	/**
	 * Tournament constructor
	 * @param competitors of the tournament
	 * @throws NotPowerOfTwoNumberOfCompetitorsException raised if there is not a power of two number of competitors
	 */
	public Tournament(List<Competitor> competitors) throws NotPowerOfTwoNumberOfCompetitorsException{
		super(competitors);		
		if( ! powerOfTwoBitwise(competitors.size())) {
			throw new NotPowerOfTwoNumberOfCompetitorsException("Not even number of competitors");
		}
	}
	 
	/**
	 * Function to know if a number is a power of 2 or not
	 * @param n number to check
	 * @return True if n is a power of two
	 * 		   False else.
	 */
	private static boolean powerOfTwoBitwise(int n)
	 {
	  return (n & n-1)==0;
	 }
	
	
	/**
	 * This function plays a tournament.
	 * The tournament is finish when there is one competitor left.
	 * @param competitors 
	 * 
	 */
	protected void play(List<Competitor> competitors) { 
		List<List<Competitor>> competitorCouple = new LinkedList<>();
		
		List<Competitor> winners = new LinkedList<>(competitors); //List of competitors still in list					

		competitorCouple = this.splitCompetitorsForOneRound(competitors);		
		Boolean finish = false;
		
		while(! finish){		
			competitorCouple = this.splitCompetitorsForOneRound(winners);						
			winners = new LinkedList<>(); 		
			for (List<Competitor> p :  competitorCouple) {
				this.playMatch(p.get(0), p.get(1));
				if(p.get(0).getPoints()>p.get(1).getPoints()) {
					winners.add(p.get(0));
				}
				else {
					winners.add(p.get(1));
				}
			}			
			
			finish = winners.size()==1;
		}
	}
	
	/**
	 * This function divides a list of competitors into a list of competitor pairs
	 * @param comp competitors to be distributed in pairs
	 * @return a list with pairs of competitors
	 */
	private List<List<Competitor>> splitCompetitorsForOneRound(List<Competitor> comp) {
		int size = comp.size();
		List<List<Competitor>> subList = new LinkedList<>();
		for(int i = 0; i<size; i+=2) {
			subList.add(comp.subList(i, i+2));			
		}
		return subList;
	}
	 
 
}
