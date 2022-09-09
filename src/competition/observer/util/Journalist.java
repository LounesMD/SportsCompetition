package competition.observer.util;

import competition.competitor.Competitor;
import competition.observer.MatchObserver;

/**
 * Class to instantiate a Journalist
 * 
 * @author Lounes Meddahi and Matthieu Medeng Essia
 *
 */
public class Journalist implements MatchObserver {
		
		private String name;
		public Journalist(String name) {
			this.name = name;
		}

		@Override
		public void reactToMatch(Competitor winner, Competitor loser) {
			DISPLAYER.displayObserverMsg(this.getName()+": "+winner.getName()+" a gagne contre "+loser.getName()+" \n");
		}

		/**
		 * return the name of the journalist
		 * @return the name of the journalist
		 */
		public String getName() {
			return this.name;
		}
		
		
}
