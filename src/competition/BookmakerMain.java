package competition;

import java.util.LinkedList;
import java.util.List;

import competition.competitor.Competitor;
import competition.observer.util.Bookmaker;
import competition.observer.util.Journalist;
import competition.organization.League;

public class BookmakerMain {
	public static void main(String[] args) {
		//Creation of competitors
		List<Competitor> competitors = new LinkedList<>();
		competitors.add(new Competitor("Lynx"));
		competitors.add(new Competitor("Raven"));
		competitors.add(new Competitor("Drift"));
		competitors.add(new Competitor("Catalyst"));
		competitors.add(new Competitor("Midas"));
		competitors.add(new Competitor("Blastoff"));		

		
		List<Bookmaker> bookmakers = new LinkedList<>();
		bookmakers.add(new Bookmaker("Tintin"));
		bookmakers.add(new Bookmaker("Haddock"));
		
		//League Main
		Competition competition = new League(competitors);
		for(Bookmaker bookmaker : bookmakers) {
			competition.register(bookmaker);
		}
		
		competition.play();


}

}
