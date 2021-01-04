import java.util.function.Predicate;
import java.util.regex.Pattern;

public class LambdaUserRegistration {

	public static void main(String[] args) {
	
		String regex1 = "[A-Z]{1}[a-z]{1,7}";
		
		String name = "Manas";                                               //Name
		
		Pattern pattern1 = Pattern.compile(regex1);
		
		Predicate<String> predicate1 = pattern1.asPredicate();
		
		boolean result1 = predicate1.test(name);
		
		System.out.println("FirstName/LastName Validation = "+result1);
		
		
		
	
}
