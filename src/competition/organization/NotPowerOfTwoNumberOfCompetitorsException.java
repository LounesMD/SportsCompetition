package competition.organization;

/**
 * Exception
 *
 * @author Lounes Meddahi and Matthieu Medeng Essia
 *
 */
public class NotPowerOfTwoNumberOfCompetitorsException extends RuntimeException {
	
	/**
	 * This exception is raised when we try to play a tournament without a power of two number of competitors
	 * @param msg to print
	 */
	public NotPowerOfTwoNumberOfCompetitorsException(String msg) {
		super(msg);
	}

}
