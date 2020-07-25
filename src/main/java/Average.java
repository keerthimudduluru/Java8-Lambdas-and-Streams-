import java.util.*;
import java.util.stream.IntStream; 
public class Average {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			IntStream stream = IntStream.of(24,45,53,12,9,8,0,72);
			OptionalDouble obj = stream.average();
			if (obj.isPresent()) 
			{ 
	            		System.out.println("Average of numbers in the list : "+obj.getAsDouble()); 
	        	} 	
	   		s.close();
		}
	}