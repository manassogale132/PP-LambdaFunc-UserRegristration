import java.util.function.Predicate;
import java.util.regex.Pattern;

public class LambdaUseRegistration {

	public static void main(String[] args) {
	
		String regex1 = "[A-Z]{1}[a-z]{1,7}";
		
		String name = "Manas";                                               //Name
		
		Pattern pattern1 = Pattern.compile(regex1);
		
		Predicate<String> predicate1 = pattern1.asPredicate();
		
		boolean result1 = predicate1.test(name);
		
		System.out.println("FirstName/LastName Validation = "+result1);
		
		
		System.out.println();
		
		
        String regex2 = "(.+)@(.+)";     
		
		String email = "manassogale@gmail.com";                             //Email
		
		Pattern pattern2 = Pattern.compile(regex2);
		
		Predicate<String> predicate2 = pattern2.asPredicate();
		
		boolean result2 = predicate2.test(email);
		
		System.out.println("Email Validation = "+result2);
		
		
        System.out.println();
		
		
        String regex3 = "[1-9]{2}[ ][0-9]{10}";
		
		String phoneNumber = "91 9632145632";
		 
		Pattern pattern3 = Pattern.compile(regex3);                       //PhoneNumber
		
		Predicate<String> predicate3 = pattern3.asPredicate();
		
		boolean result3 = predicate3.test(phoneNumber);
		
		System.out.println("PhoneNumber Validation = "+result3);
		
		
        System.out.println();
		
		
        String regex4 = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
		
		String password = "maNas321#";                                    //Password
		 
		Pattern pattern4 = Pattern.compile(regex4);                       
		
		Predicate<String> predicate4 = pattern4.asPredicate();
		
		boolean result4 = predicate4.test(password);
		
		System.out.println("PhoneNumber Validation = "+result4);
	}

}
