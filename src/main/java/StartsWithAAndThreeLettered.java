import java.util.*; 
import java.util.stream.Collectors;

public class StartsWithAAndThreeLettered{
	public List<String> ReturnString(List<String> list) {

		return list.stream().filter(s -> s.startsWith("a"))
		.filter(s -> s.length() == 3).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		
		StartsWithAAndThreeLettered s = new StartsWithAAndThreeLettered();
		List<String> s1 = Arrays.asList("Ant","ace","avid","ava","zoo");
		System.out.println("Initial List : "+s1);
		System.out.println("Strings that start with a and three lettered : "+s.ReturnString(s1));
	}

}