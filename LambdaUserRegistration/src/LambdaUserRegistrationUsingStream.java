 import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class LambdaUserRegistrationUsingStream {

	public static void main(String[] args) {
		
		
		List<String> firstName = Arrays.asList("Manas","manas","manaS","1345","m","Omkar");    // First Function First-Name
		
		Predicate<String> pattern = Pattern.compile("[A-Z]{1}[a-z]{1,7}").asPredicate();
		
		List<String> matchedFirstName = firstName.stream()
				                       .filter(pattern)
				                       .collect(Collectors.toList());   //Using collect instead of forEach
		
		
			System.out.println("Matched FirstName = "+matchedFirstName);
		
	//------------------------------------------------------------------------------------------------------------------------------------------	

	

}
