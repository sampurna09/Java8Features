package optional;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		//of , empty, ofNullable
		
		Optional<Object> empOptional =Optional.empty();
		System.out.println(empOptional);
		
		
		String email ="abc@gmail.com";
		
		Optional<String> emiOptional =Optional.of(email);//gives null pointer exp if passed null
		System.out.println(emiOptional);
		
		Optional<String> emailOptional =Optional.ofNullable(email);//no error even email is null
		System.out.println(emailOptional);
	}

}
