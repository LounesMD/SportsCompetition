package competition.organization;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import competition.competitor.Competitor;
import competition.organization.NotPowerOfTwoNumberOfCompetitorsException;
import competition.organization.Tournament;

class TournamentTest{
	private List<Competitor> competitors;
	
	@BeforeEach
	void setUp() throws Exception {
		this.competitors = new LinkedList<>();
		for(int i=0; i<10; i++) {
			this.competitors.add(new Competitor(""+i));
		}
	}


	@Test
	void playWithoutAnEvenNumberOfCompetitors() {
		List<Competitor> competitorsBis = new LinkedList<>(); ;		 
		competitorsBis.add(new Competitor("first competitor"));
		competitorsBis.add(new Competitor("second competitor"));
		competitorsBis.add(new Competitor("thirst competitor"));		
		assertTrue((competitorsBis.size() %2) != 0 ); //We checked that competitors is has an odd number of competitors

		assertThrows(NotPowerOfTwoNumberOfCompetitorsException.class , () -> {new Tournament(competitorsBis);}
		);
	}
	



}
