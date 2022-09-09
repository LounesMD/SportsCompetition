package competition.organization.masters.strategies;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import competition.competitor.Competitor;
import competition.organization.masters.Strategy;
import competition.organization.masters.StrategyTest;

class Strategy2Test extends StrategyTest {

	protected Strategy createStrategy() {
		return new Strategy2();
	}

	@Override
	protected int nb_of_comp() {
		return 8;
	}

	@Override
	protected int nb_of_group() {
		return 3;
	}

	@Override
	protected List<Competitor> good_nb_of_comp() {
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
		
		return competitors;
	}

	@Override
	protected int nb_of_fin() {
		return 8;
	}

	@Override
	protected List<Competitor> wrong_nb_of_comp() {
		List<Competitor> competitors = new LinkedList<>();
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
		
		return competitors;
	}
}
