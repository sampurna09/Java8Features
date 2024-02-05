package sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		
		//ascending
		List<String>  sortedList =fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(sortedList);
		
		//descending
		List<String>  sortedList1 =fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList1);
		
		
		/////////////////////////////
		System.out.println("###############################################");
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Ram",100L));
		employees.add(new Employee("Hari", 200L));
		employees.add(new Employee("Shyam", 150L));
		
		
		///stream
		List<Employee> employeeSortedList= employees.stream().sorted(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary()-o2.getSalary());
			}
		}).collect(Collectors.toList());
		System.out.println(employeeSortedList);
		
		
		////lambda expression ascending
		List<Employee> employeeSortedList2= employees.stream()
				.sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary()))
				.collect(Collectors.toList());
		System.out.println(employeeSortedList2);
		
	////lambda expression descending
			List<Employee> employeeSortedList3= employees.stream()
					.sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary()))
					.collect(Collectors.toList());
			System.out.println(employeeSortedList3);
			
			
			////////////////////////////////
			
			List<Employee> employeeSortedList4= employees.stream()
					.sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
			System.out.println(employeeSortedList4);
			
			List<Employee> employeeSortedList5= employees.stream()
					.sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
			System.out.println(employeeSortedList5);
		
	}

}
