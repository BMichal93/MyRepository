
public class isNumeric {
	public static boolean isNumeric(String inputbox) {
	    if (inputbox == null) {
	        return false;
	    }
	    try {
	        double dcheck = Double.parseDouble(inputbox);
	    } catch (NumberFormatException exc) {
	        return false;
	    }
	    return true;
	}
}
