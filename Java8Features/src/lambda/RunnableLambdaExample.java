package lambda;



class ThreadDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("run method called .........");
	}
	
}

public class RunnableLambdaExample {
	  
	public static void main(String[] args) {
		
		//tradational way
		Thread thread = new Thread(new ThreadDemo());
		thread.start();
		
		
		//lambda
		
		Runnable runnable = () ->{
			System.out.println("run method called lambda.........");
		};
		Thread threadLambda = new Thread(runnable);
		threadLambda.start();
	}

}
