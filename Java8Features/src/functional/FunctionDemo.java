package functional;

import java.util.function.Function;

class FunctionImpl implements Function<String, Integer>{

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return t.length();
	}
	
}

public class FunctionDemo {
	
	public static void main(String[] args) {
		//tradational
		Function<String, Integer> function = new FunctionImpl();
		System.out.println(function.apply("Ramesh"));
		
		
		//lambda
		Function<String, Integer> function2 =(String s) ->{return s.length();};
		System.out.println(function2.apply("Hari"));
	}
	

}
