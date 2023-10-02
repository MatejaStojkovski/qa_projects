package Section07;

public class L17_Arrays {
	//So the key thing to remember about an array is that an array is static in size, so the length is fixed 
	//based on the object of the array that we create.
	public static void main(String[] args) {
		String[] names = new String[] { "Steve", "Ema", "John", "Amy" };
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
	}
}