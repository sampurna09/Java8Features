package lambda;

public class LamdaExpression {
	
	

	public static void main(String[] args) {
		
	
		
		//lambda ex
		Shape rectangle = () -> {System.out.println("Rectangle draw() method");};
		rectangle.draw();
		
		Shape octagon = () -> System.out.println("Octagon draw() method");
		octagon.draw();
		
		
		//tradational
		Square square = new Square();
		square.draw();
		
	}
}

interface Shape{
	void draw();
}

class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Rectangle draw()");
		
	}
	
}

class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Square draw()");
		
	}
	
}

class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Circle draw()");
		
	}
	
}


