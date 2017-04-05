
public class AgeIsNegativeException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String errormessage;
	public AgeIsNegativeException(String errormessage) {
		// TODO Auto-generated constructor stub
	this.errormessage=errormessage;
	}
	public String toString(){
		return errormessage;
		
	}
	

}
