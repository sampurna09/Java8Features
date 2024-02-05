package foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
	public static void main(String[] args) {
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Hari", 10));
		personList.add(new Person("Ram", 20));
		personList.add(new Person("Shyam", 30));
		personList.add(new Person("Gita", 40));
		
		//before java 8
		for(Person person : personList) {
			System.out.println(person);
		}
		
		//After java 8
		personList.forEach((person)->{System.out.println(person);});
		
		//stream
		personList.stream().forEach((person)->{System.out.println(person);});
		
	}

}

class Person{
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
