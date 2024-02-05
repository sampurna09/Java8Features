package lambda;


@FunctionalInterface
public interface MyFunctionalInterface {
	void print(String msg);//only one abstract method
	default void m1() { ///can contain n number of default method
		System.out.println("default method");
	}
	static void m2() { ///can contain n number of static method
		System.out.println("static method");
	}
}
