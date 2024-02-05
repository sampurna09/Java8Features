package foreach;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetForEachExample {
	public static void main(String[] args) {
		Set<Person> personList = new HashSet<>();
		personList.add(new Person("Hari", 10));
		personList.add(new Person("Ram", 20));
		personList.add(new Person("Shyam", 30));
		personList.add(new Person("Gita", 40));
		
		//before java 8
		
		for(Person person : personList) {
			System.out.println(person);
		}
		
		
		///after java 8
		personList.forEach((person) ->{System.out.println(person);});
	}

}
