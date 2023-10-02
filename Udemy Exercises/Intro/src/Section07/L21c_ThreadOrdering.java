package Section07;

//So to explain what I'm doing here in this class, I'm extending the thread superclass and in my method.
//At the time this class executes, I'm using the for loop, which will run five times.
//And each time the for loop runs, it creates a new thread object.
//And then I override the run method.
//And the run method will output a line or thread to get name.
//So get name gets the name of the thread instance and it says plus running then outside of the thread braces.
//I call the start method, which is the method that starts the execution of the threads.
//po pravilo treba da gi rede po red 0 1 2 3 4 5 ama poshto koristimo thread ono raboti parlelno za svi i kako gi izraboti gi printa 
public class L21c_ThreadOrdering extends Thread{

	public static void main(String[] args) {

		for (int i=0; i<6; i++) {
			new Thread("" + i) {
				public void run() {
					System.out.println("Thread: " + getName() + " running");
				}
			}
			.start();
		}

	}

}

//The key thing to remember is that friends allows us to execute processes in parallel.

//This is often used to speed up the execution of a program.
	