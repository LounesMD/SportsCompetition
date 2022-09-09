package competition;

import java.util.Iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import competition.competitor.Competitor;
import competition.organization.masters.Master;
import competition.organization.masters.Strategy;
import competition.organization.masters.strategies.Strategy1;
import competition.organization.masters.strategies.Strategy2;

/**
 * Master 24 Main
 *
 * @author Lounes Meddahi and Matthieu Medeng Essia
 *
 */
public class MasterStrategy2Main {

	public static void main(String[] args) {
		//Creation of competitors
		List<Competitor> competitors = new LinkedList<>();


		competitors.add(new Competitor("Lynx"));
		competitors.add(new Competitor("Raven"));
		competitors.add(new Competitor("Nami"));
		competitors.add(new Competitor("Luffy"));
		
		competitors.add(new Competitor("Midas"));
		competitors.add(new Competitor("Blastoff"));
		competitors.add(new Competitor("Mihawk"));
		competitors.add(new Competitor("Law"));
		
		competitors.add(new Competitor("Kid"));
		competitors.add(new Competitor("Ace"));
		competitors.add(new Competitor("Dragon"));
		competitors.add(new Competitor("Shanks"));
		
		competitors.add(new Competitor("Drift"));
		competitors.add(new Competitor("Catalyst"));
		competitors.add(new Competitor("Zoro"));
		competitors.add(new Competitor("Kaido"));
		
		competitors.add(new Competitor("Natsu"));
		competitors.add(new Competitor("Gray"));
		competitors.add(new Competitor("Lee"));
		competitors.add(new Competitor("Guy"));
		
		competitors.add(new Competitor("Erza"));
		competitors.add(new Competitor("Mira"));
		competitors.add(new Competitor("Luxus"));
		competitors.add(new Competitor("Gajeel"));
		

		//Master 16 Main
		Strategy strategy = new Strategy2();
		Master competition = new Master(strategy, competitors);
		competition.play();
		
		
		}

}
