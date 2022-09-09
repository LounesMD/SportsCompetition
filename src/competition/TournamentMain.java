package competition;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import competition.competitor.Competitor;
import competition.organization.Tournament;

/**
 * Tournament Main
 * 
 * @author Lounes Meddahi and Matthieu Medeng Essia
 *
 */
public class TournamentMain {

	public static void main(String[] args) {
		//Creation of competitors
		List<Competitor> competitors = new LinkedList<>();
		competitors.add(new Competitor("Lynx"));
		competitors.add(new Competitor("Raven"));
		competitors.add(new Competitor("Drift"));
		competitors.add(new Competitor("Catalyst"));
		competitors.add(new Competitor("Midas"));
		competitors.add(new Competitor("Blastoff"));		
		competitors.add(new Competitor("Luffy"));		
		competitors.add(new Competitor("Ussop"));		

		//League Main
		Competition competition = new Tournament(competitors);		
		competition.play();

		Set<Competitor> rank = competition.ranking().keySet();
		Iterator<Competitor> cIterator = rank.iterator();
		System.out.println("*** Ranking ***");
		while(cIterator.hasNext()) {
			Competitor c = cIterator.next();
			System.out.println(""+c.getName()+" - "+c.getPoints());
		}		
		

	}

}
