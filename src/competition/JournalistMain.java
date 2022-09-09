package competition;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import competition.competitor.Competitor;
import competition.observer.util.Journalist;
import competition.organization.League;
import competition.organization.masters.Master;
import competition.organization.masters.Strategy;
import competition.organization.masters.strategies.Strategy2;

public class JournalistMain {
	public static void main(String[] args) {
		//Creation of competitors
		List<Competitor> competitors = new LinkedList<>();
		competitors.add(new Competitor("Lynx"));
		competitors.add(new Competitor("Raven"));
		competitors.add(new Competitor("Drift"));
		competitors.add(new Competitor("Catalyst"));
		competitors.add(new Competitor("Midas"));
		competitors.add(new Competitor("Blastoff"));		

		
		List<Journalist> journalists = new LinkedList<>();
		journalists.add(new Journalist("TF1"));
		journalists.add(new Journalist("France2"));
		
		//League Main
		Competition competition = new League(competitors);
		for(Journalist journalist : journalists) {
			competition.register(journalist);
		}
		
		competition.play();


}
}
