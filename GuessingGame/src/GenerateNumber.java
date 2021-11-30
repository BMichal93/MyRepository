import java.util.Random;

public class GenerateNumber {

	public boolean GenerateNumber (int num) {
		Random r = new Random();
		int low = 1;
		int high = 3;
		int result = r.nextInt(high-low) + low;
		
		if(num == result) { return true;}
		else {return false;}
	}

}
