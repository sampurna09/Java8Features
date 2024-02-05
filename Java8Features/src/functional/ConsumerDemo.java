package functional;

import java.util.function.Consumer;

//class ConsumerImpl implements Consumer<String>{
//
//	@Override
//	public void accept(String t) {
//		System.out.println(t);
//		
//	}
//	
//}

public class ConsumerDemo {
	public static void main(String[] args) {
		//tradational
//		Consumer<String> consumer = new ConsumerImpl();
//		consumer.accept("Hello World");
		
		
		//lambda 
		Consumer<String> consumer = (t) ->{System.out.println(t);};
		consumer.accept("Hello World");
			
		
	}

}
