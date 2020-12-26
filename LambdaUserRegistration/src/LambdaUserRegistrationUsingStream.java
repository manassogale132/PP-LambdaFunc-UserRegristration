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
		
		System.out.println("  ");
		
		
		
		List<String> lastName = Arrays.asList("sogale","Sogale","Patil","sogalE","632145","Smith");    // Second Function Last-Name
		
		Predicate<String> pattern2 = Pattern.compile("[A-Z]{1}[a-z]{1,7}").asPredicate();
		
		List<String> matchedLastName = lastName.stream()
				                       .filter(pattern2)
				                       .collect(Collectors.toList());	
		
					System.out.println("Matched LastName = "+matchedLastName);         //Using collect instead of forEach
	
		
	//------------------------------------------------------------------------------------------------------------------------------------------	
	
		System.out.println("  ");
		
		
		
        List<String> email = Arrays.asList("manassogale@","ManasSogale@gmail.com","@gmail.com","632145","s");    // Third Function Email id
		
		Predicate<String> pattern3 = Pattern.compile("(.+)@(.+)").asPredicate();
		
		Stream<String> matchedEmail = email.stream()
				                      .filter(pattern3);
		
		matchedEmail.forEach(n->{
			System.out.println("Matched EmaidId = "+n);
		});
		
	//------------------------------------------------------------------------------------------------------------------------------------------	
	
		System.out.println("  ");
		
		
        List<String> phoneNumber = Arrays.asList("91-9632145632","913214563214","9632145236","91 9012324569","91 3121");    // Fourth Function Email id
		
		Predicate<String> pattern4 = Pattern.compile("[1-9]{2}[ ][0-9]{10}").asPredicate();
		
		Stream<String> matchedPhoneNumber = phoneNumber.stream()
				                            .filter(pattern4);
		
		matchedPhoneNumber.forEach(n->{
			System.out.println("Matched PhoneNumber = "+n);
		});
		
   //------------------------------------------------------------------------------------------------------------------------------------------	

		
		System.out.println("  ");
		
		
        List<String> password = Arrays.asList("manasS@3","mansa243","MANAS@13","maNas321@","Ma");      // Fifth Function Password
		
		Predicate<String> pattern5 = Pattern.compile("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$").asPredicate();
		
		Stream<String> matchedPassword = password.stream()
				                         .filter(pattern5);
		
		matchedPassword.forEach(n->{
			System.out.println("Matched Password = "+n);
		});
		
	}
	

}
