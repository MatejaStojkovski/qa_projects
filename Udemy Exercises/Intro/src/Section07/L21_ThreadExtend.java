package Section07;


//So to quickly explain what I've done here, I have created a new class which extends to thread. thread Superclass.
//Of them created a new object (L21_ThreadExtend thread), which is an instance of this particular class I've created.
//Then I use that object to code, the START method, and that start method belongs to the thread class  u 14 red .
//I then output a message sign outside of the friend.
//Now because we extend in the friend class, we need to override the run method.
//So that's why I've created a new method here called Public Void Run.
//And what I've done here is outputs a message to console, say, an inside of a thread.
//So what we need to do or what happens is that we are overriding a method that belongs to different class.
//And this is what actually will execute use in threads to console.

public class L21_ThreadExtend extends Thread{

	public static void main(String[] args) {

		L21_ThreadExtend thread = new L21_ThreadExtend();
		thread.start();
		
		System.out.println("Outside of a thread");
		
	}
	
	public void run() {
		System.out.println("Inside of a thread");
	}

}
	