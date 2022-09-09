package competition.organization.masters;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import competition.competitor.*;
import competition.organization.masters.NotGoodNumberOfCompetitorsException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public abstract class StrategyTest {
	
	protected Strategy strat; //Strategy to test	
	protected int nb_of_comp; //Nb of groups 
	protected int nb_of_fin; // Nb of finalists
	protected int nb_of_group; // Nb of groups
	protected List<Competitor> good_nb_of_comp; // a list with enough players to play the strategy 
	protected List<Competitor> wrong_nb_of_comp; // a list with not enough players to play the strategy 

	
	
	protected abstract Strategy createStrategy(); 
	protected abstract int nb_of_comp();
	protected abstract int nb_of_group();
	protected abstract List<Competitor> good_nb_of_comp();
	protected abstract int nb_of_fin();
	protected abstract List<Competitor> wrong_nb_of_comp();

	
	@BeforeEach
	public void init(){
		this.strat = this.createStrategy();		
		this.nb_of_comp = this.nb_of_comp();
		this.nb_of_group = this.nb_of_group();
		this.nb_of_fin = this.nb_of_fin();	
		this.good_nb_of_comp = this.good_nb_of_comp();
		this.wrong_nb_of_comp = this.wrong_nb_of_comp();
	}



	@Test
	void testSplitInGroupsStageWhenOk() {
		List<List<Competitor>> comps = this.strat.splitInGroupStage(this.good_nb_of_comp);
		assertEquals( this.nb_of_group , comps.size());
		for(int i =0; i<this.nb_of_group; i++) {
			assertEquals( this.nb_of_comp , comps.get(i).size());
		}

	}
	
	@Test
	void testSplitInGroupsStageWhenNotOk() {
		assertThrows(NotGoodNumberOfCompetitorsException.class, () -> { 
			strat.splitInGroupStage(wrong_nb_of_comp);
		});
	}
	
	@Test
	void testselectWinners() {
		List<List<Competitor>> comps = strat.splitInGroupStage(good_nb_of_comp);
		List<Competitor> finalists = strat.selectWinners(comps);
		assertEquals( nb_of_fin , finalists.size());
	}
	
	

}
