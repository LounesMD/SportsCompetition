package competition.competitor;

/**
 * This class define how to create a player
 * 
 * @author Lounes Meddahi and Matthieu Medeng Essia
 *
 */
public class Competitor {
	/**
	 * This attribute is used to define player's name
	 */
	private final String name;
	/**
	 * This attribute is used to know how many points the player has
	 */
	private int nbOfPoints;
	
	/**
	 * To create a player, we use a name, and initialize his number of points to zero
	 * @param name the name of the player
	 */
	public Competitor(String name) {
		this.name = name;
		this.nbOfPoints = 0;
	}
	
	/**
	 * Method to get the player's number of points
	 * @return player's number of points
	 */
	public int getPoints() {
		return this.nbOfPoints;
	}
	
	/**
	 * Method to get the competitor name
	 * @return competitor's name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Method used to add points to the competitor
	 * @param bonus points to add
	 */
	public void addPoints(int bonus) {
		this.nbOfPoints += bonus;
	}
	 
	/**
	 * Method used to compare two players
	 * @return True if they are both the same (same name)
	 * 		   False else
	 */
	public boolean equals(Object o) {
		if (o instanceof Competitor) {
			Competitor other = (Competitor) o;
			return (other.getName()).equals(this.name);
		}
		else {
			return false;
		}
	}
	
}
