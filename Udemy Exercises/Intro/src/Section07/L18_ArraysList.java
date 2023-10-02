package Section07;

import java.util.ArrayList;

public class L18_ArraysList {
	
	//And the key point to remember is an ArrayList can expand as we need, whereas an array,
	//once the array object has been created, cannot be expanded.
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Lizard");
		animals.add("Horse");
		animals.remove(0);
		// set an interval and and it's got a value of zero.
		//The condition, though, is to check to see if I. So what the value of this i. It's less than animals the size. 
		//And this dot sized method checks to see how many values has had been added to the animals array list.
		//i plus plus which will increment after each iteration of the for loop.
		for (int i=0; i<animals.size(); i++) {
			System.out.println(animals.get(i));
		}
	}

}
	