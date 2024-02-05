package functional;

import java.time.LocalDateTime;
import java.util.function.Supplier;


//class SupplierImpl implements Supplier<LocalDateTime>{
//
//	@Override
//	public LocalDateTime get() {
//		// TODO Auto-generated method stub
//		return LocalDateTime.now();
//	}
//	
//}

public class SupplierDemo {
	
	public static void main(String[] args) {
		
		///tradational
//		Supplier<LocalDateTime> supplier = new SupplierImpl();
//		System.out.println(supplier.get());
		
		
		//lambda
		Supplier<LocalDateTime> supplier = () -> {return LocalDateTime.now();};
		System.out.println(supplier.get());
	}

}


