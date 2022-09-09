package competition.organization.masters;


/**
 * Exception
 *
 * @author Lounes Meddahi and Matthieu Medeng Essia
 *
 */
public class NotGoodNumberOfCompetitorsException extends RuntimeException {
	
	
	/**
	 * This exception is raised when we try to play a master with a strategy which cannot be called
	 * @param msg to print
	 */
	public NotGoodNumberOfCompetitorsException(String msg) {
		super(msg);
	}

}
