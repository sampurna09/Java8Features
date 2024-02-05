package lambda;

public class LambdaExpression2 {
	
	public static void main(String[] args) {
		Addable addable = ( a, b) -> { return (a+b);}; 
		System.out.println(addable.addition(10, 10));
	}

}



/// tradational method
interface Addable{
	int addition(int a,int b);
}

class AddableImpl implements Addable{

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}
	
}
