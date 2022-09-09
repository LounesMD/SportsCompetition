package competition.organization.masters;
import java.util.List;

import competition.competitor.Competitor;

/**
 * Interface to implement several strategies.
 * 
 * @author Lounes Meddahi and Matthieu Medeng Essia
 *
 */
public interface Strategy {
	/**
	 * This method allows to choose different ways to organise competitors into groups.
	 * @param competitors the list of competitors which will compete
	 * @return the list of groups of competitors which will be playing a league with teams from the same group
	 * @throws IllegalNumberOfCompetitorsException when the number of competitors differs from the number chosen for the strategy.
	 */
	public List<List<Competitor>> splitInGroupStage(List<Competitor> competitors) throws NotGoodNumberOfCompetitorsException;
	


	/**
	 * This method allows to choose different ways to select the competitors which won the qualifiers.
	 * @param groups the list of the qualifiers' groups
	 * @return the list of the selected competitors for the final round
	 */
	public List<Competitor> selectWinners(List<List<Competitor>> competitors);
}
