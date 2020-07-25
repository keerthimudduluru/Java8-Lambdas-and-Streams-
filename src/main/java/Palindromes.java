import java.util.*; 
import java.util.stream.Collectors;
public class Palindromes {
		public static boolean isPalindrome(String s) {
			
			String r = new StringBuffer(s).reverse().toString(); 
			if (s.equals(r)) 
				return true;
			return false;
		}
		public List<String> getList(List<String> list){
			
			List<String> r = new ArrayList<String>();
			for(String s : list) {
				if(Palindromes.isPalindrome(s))
					r.add(s);
			}
			
			return r;
		}
		public static void main(String[] args) {
			
			Palindromes s2= new Palindromes();
			List<String> s1 = Arrays.asList("misissippi","madam","level","reviver","bamboo");
			System.out.println("Initial List : "+s1);
			System.out.println("palindromes in the list : "+s2.getList(s1));
	}
}