package Section07;

import java.util.ArrayList;
import java.util.List;

public class L19_List {
//So this is just proven that we can use the list interface to equal ArrayList because ArrayList is a
//subclass of the list interface.
	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Lizard");
		animals.add("Horse");
		animals.remove(0);

		for (int i=0; i<animals.size(); i++) {
			System.out.println(animals.get(i));
		}
	}

}
	