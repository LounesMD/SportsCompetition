package competition.match.util;

import java.util.Random;

import competition.competitor.Competitor;
import competition.match.Match;

/**
 * class to create a match that return a random winner
 * 
 * @author Lounes Meddahi and Matthieu Medeng Essia
 *
 */
public class RandomMatch implements Match {

		private Random winner;
		
		/**
		 * Empty constructor
		 */
		public RandomMatch() {
			this.winner = new Random();
		}
		
		/** 
		 * returns a random winner between competitor1 and competitor2
		 */
		@Override
		public Competitor declareWinner(Competitor competitor1 , Competitor competitor2) {
			int nxt = winner.nextInt(2);
			Competitor[] competitors = {competitor1 , competitor2};
			return competitors[nxt];
		}

}
