package foreach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapForEachExample {
	public static void main(String[] args) {
		Map<Integer, Person> map = new HashMap<Integer, Person>();
		map.put(1, new Person("Hari",10));
		map.put(2, new Person("Ram",20));
		map.put(3, new Person("Shyam",30));
		map.put(4, new Person("Gita",40));
		
		///before java 8
		
		for(Entry<Integer,Person> entry : map.entrySet()) {
			System.out.println(entry);
		}
		
		///after java8
		
		map.forEach((k,v)->{
			System.out.println(k+"*"+v);
		});
		
	}

}
