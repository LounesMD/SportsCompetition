package competition.organization.masters.strategies;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import competition.competitor.Competitor;
import competition.organization.MapUtil;
import competition.organization.masters.NotGoodNumberOfCompetitorsException;
import competition.organization.masters.Strategy;

/**
 * The strategy to be applied to a list of 24 competitors.
 * 
 * @author Lounes Meddahi and Matthieu Medeng Essia
 * 
 */
public class Strategy2 implements Strategy{

	//The number of competitors required to make the strategy work.
	public static final int NB_OF_COMP = 24;

	
	/**
	 * This method splits a list of competitors into a list of groups of competitors.
	 * @param competitors the list of all competitors
	 * @return the list of groups of competitors
	 * @throws IllegalNumberOfCompetitorsException when the number of competitors differs from the number chosen for the strategy.
	 */
	@Override
	public List<List<Competitor>> splitInGroupStage(List<Competitor> comp) throws NotGoodNumberOfCompetitorsException{
		if(comp.size() != NB_OF_COMP) { // We look that we have 24 competitors
			throw new NotGoodNumberOfCompetitorsException("this strategy cannot be used. Only when you need to split 24 competitors into 3 groups");
		}
		else {
			List<List<Competitor>> group = new LinkedList<>();
			int i = 0;
			while(i<NB_OF_COMP) {
				group.add( comp.subList(i, i+8) );
				i+=8;
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
	    List<Competitor> catchingUp = new LinkedList<Competitor>(); //List to select the 2 best of all thirds
	    List<Competitor> list = new LinkedList<Competitor>(); // List of all 2 best

		for(List<Competitor> group : comp) {
			
			if(group.size() < 2) { // We look that we have more than 2 competitors by group
				throw new NotGoodNumberOfCompetitorsException("this strategy cannot be used. Only when you have more than 2.");
			}

			// We use MapUtil to organize the group and select the 2 best and add the third one in an other list (catchingUp)
			Map<Competitor , Integer> Mapcompetitors = new HashMap<Competitor , Integer>();
			for (Competitor c : group) {
				Mapcompetitors.put(c, c.getPoints());
			}

			Set<Competitor> rank = MapUtil.sortByDescendingValue(Mapcompetitors).keySet();
			Iterator<Competitor> cIterator = rank.iterator();
			list.add(cIterator.next());
			list.add(cIterator.next());
			catchingUp.add(cIterator.next());
		}
		
		// Now we add in the finalists list the two best of the list catchingUp
		Map<Competitor , Integer> Mapcompetitors = new HashMap<Competitor , Integer>();
		for (Competitor c : catchingUp) {
			Mapcompetitors.put(c, c.getPoints());
		}

		Set<Competitor> rank = MapUtil.sortByDescendingValue(Mapcompetitors).keySet();
		Iterator<Competitor> cIterator = rank.iterator();
		list.add(cIterator.next());
		list.add(cIterator.next());	
		
		return list;

	}

}
