package competition.organization.masters.strategies;

import java.util.LinkedList;
import java.util.List;

import competition.competitor.Competitor;
import competition.organization.masters.NotGoodNumberOfCompetitorsException;
import competition.organization.masters.Strategy;

/**
 * The strategy to be applied to a list of 16 competitors.
 * 
 * @author Lounes Meddahi and Matthieu Medeng Essia
 * 
 */
public class Strategy1 implements Strategy {

	//The number of competitors required to make the strategy work.
	public static final int NB_OF_COMP = 16;

	
	/**
	 * This method splits a list of competitors into a list of groups of competitors.
	 * @param competitors the list of all competitors
	 * @return the list of groups of competitors
	 * @throws IllegalNumberOfCompetitorsException when the number of competitors differs from the number chosen for the strategy.
	 */
	@Override
	public List<List<Competitor>> splitInGroupStage(List<Competitor> comp) throws NotGoodNumberOfCompetitorsException{
		if(comp.size() != NB_OF_COMP) {
			throw new NotGoodNumberOfCompetitorsException("this strategy cannot be used. Only when you need to split 16 competitors into 4 groups");
		}
		else {
			List<List<Competitor>> group = new LinkedList<>();
			int i = 0;
			while(i<NB_OF_COMP) {
				group.add( comp.subList(i, i+4) );
				i+=4;
			}
			return group;
		}
	}

	/**
	 * This method picks the qualifiers from the groups by choosing the winner of each group.
	 * @param groups the list of groups
	 * @return the list of competitors which are qualified
	 */
	@Override
	public List<Competitor> selectWinners(List<List<Competitor>> comp) {
	    List<Competitor> list = new LinkedList<Competitor>();
	    
		for (List<Competitor> group : comp) {
			int pts = group.get(0).getPoints();
			Competitor winner = group.get(0);
			
			for(Competitor competitor : group) {
				if(competitor.getPoints() > pts) {
					pts = competitor.getPoints();
					winner = competitor;
				}
			}
		    list.add(winner);
		}

		return list;
	}

}
