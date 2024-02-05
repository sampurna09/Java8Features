package methodref;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;


public class MethodRefDemo {
	
	public static int addition(int a, int b) {
		return (a+b);
	}

	
	
	public static void main(String[] args) {
		// 1. Method ref to a static method
		//lambda exp
		Function<Integer, Double> function = (input) -> Math.sqrt(input);
		System.out.println(function.apply(4));
		
		//2. using method ref
		Function<Integer, Double> function2 = Math::sqrt;
		System.out.println(function2.apply(4));
		
		
		//lambda expression
		BiFunction<Integer, Integer, Integer> biFunction =(a,b) -> MethodRefDemo.addition(a, b);
		System.out.println(biFunction.apply(10, 20));
		
		//using method ref
		BiFunction<Integer, Integer, Integer> biFunction2 =MethodRefDemo::addition;
		System.out.println(biFunction2.apply(10, 20));
		
		
		
		////////////////////////////////////
		
		//2. Method ref to an instance method of an object
		MethodRefDemo methodRefDemo = new MethodRefDemo();
		
		//lambda expr
		Printable printable = (msg) -> methodRefDemo.display(msg);
		printable.print("hello world");
		
		//method ref
		Printable printable2 = methodRefDemo::display;
		printable.print("Hello Java");
		
		
		////////////////////////////////////////////////////
		//3. Reference to the instance method of an arbitrary object
		/*
		 * somtimes we call a method of argument in the lambda expression
		 * in that case we use a method ref to call an istance
		 * method of an arbitrary object of a specific type
		 */
		
		Function<String, String> stringFunction =(input) -> input.toLowerCase();
		System.out.println(stringFunction.apply("JAVA PROGRAMMING"));
		
		//using method ref
		Function<String, String> stringFunction2 = String :: toLowerCase;
		System.out.println(stringFunction2.apply("JAVA PROGRAMMING IN LOWER CASE"));
		
		
		
		/////Ref to a constructor
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("apple");
		fruits.add("mango");
		Function<List<String>, Set<String>> setFunction = (fruitList) -> new HashSet<>(fruitList);
		System.out.println(setFunction.apply(fruits));
		
		//method ref
		Function<List<String>, Set<String>> setFunction2 = HashSet :: new;
		System.out.println(setFunction2.apply(fruits));
		
		
	
		
	}
	
	public void display(String msg) {
		msg =msg.toUpperCase();
		System.out.println(msg);
	}
	
	

}

@FunctionalInterface
interface Printable{
	void print(String msg);
}
