package competition.organization.masters;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import competition.Competition;
import competition.competitor.Competitor;
import competition.organization.League;
import competition.organization.MapUtil;
import competition.organization.Tournament;

/**
 * Class to create a master.
 *
 * @author Lounes Meddahi and Matthieu Medeng Essia
 *
 */
public class Master extends Competition{
	
	// The adopted strategy to play the master.
	protected Strategy strategy;
	
	/**
	 * Master constructor.
	 * @param strategy the chosen strategy
	 * @param competitors the list of the competitors which will be part of the master
	 */
	public Master(Strategy strategy, List<Competitor> competitors) {
		super(competitors);
		this.strategy = strategy;		
	}

	
	/**
	 * This method splits a group of competitors into different groups by using the strategy
	 * @param competitors to be splitted
	 * @return a list of competitor groups
	 */
	private List<List<Competitor>> splitInGroupStage(List<Competitor> competitors){
		return this.strategy.splitInGroupStage(competitors);
	}
	
	/**
	 * This method plays a master by following the next steps : 
	 * 	1) Split competitors into groups
	 * 	2) Play all groups as a League
	 * 	3) Select finalists
	 *  4) Reset points of all finalists
	 *  5) Play the final as a Tournament
	 *
	 * @param competitors the list of competitors
	 * 
	 */
	@Override
	protected void play(List<Competitor> competitors) {
		List<List<Competitor>> groups = this.splitInGroupStage(competitors);
		this.playGroupStage(groups);
		List<Competitor> finalists = this.selectFinalists(groups);
		
		resetPoints(finalists);
		this.playfinal(finalists);
	}
	
	/**
	 * This function reset points of all competitors
	 * @param competitors who needs to reset points
	 */
	private void resetPoints(List<Competitor> competitors) {
		for(Competitor competitor : competitors) {
			competitor.addPoints(-1*competitor.getPoints());
		}
	}
	
	/**
	 * This function takes a list of groups, and returns finalists of the master by using the strategy
	 * @param list of competitors to be splitted
	 * @return finalists of the master
	 */
	private List<Competitor> selectFinalists(List<List<Competitor>> comp){
		List<Competitor> finalists = new LinkedList<Competitor>();
		finalists = this.strategy.selectWinners(comp);
		return finalists;
	}
	

	/**
	 * This method plays the first part of the master consisting in leagues between competitors of the same group.
	 * @param groups a list of groups of competitors
	 */
	protected void playGroupStage(List<List<Competitor>> c){
		for (List<Competitor> group : c) {
			League l = new League(group);
			l.play();			
			this.displayRanking(l);
		}					
		
	}
	
	/**
	 * This method plays the last part of the master consisting in a tournament between remaining competitors.
	 * @param groups a list of competitors
	 */
	protected void playfinal(List<Competitor> finalists) {
		Tournament t = new Tournament(finalists);
		t.play();
		this.displayRanking(t);
	}
	
	/**
	 * This method aims to display the ranking of each group and the final tournament.
	 * @param competition the competition whose ranking will be displayed
	 */
	public void displayRanking (Competition competition) {
		Set<Competitor> rank = competition.ranking().keySet();
		Iterator<Competitor> cIterator = rank.iterator();
		DISPLAYER.displayCompetitionMsg("\n" + "*** Ranking ***");
		while(cIterator.hasNext()) {
			Competitor c = cIterator.next();
			DISPLAYER.displayCompetitionMsg("" + c.getName() + " - " + c.getPoints());
		}
		DISPLAYER.displayCompetitionMsg("\n");
	}
	
	
		
}
