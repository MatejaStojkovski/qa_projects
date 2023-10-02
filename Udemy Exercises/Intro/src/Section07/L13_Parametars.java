package Section07;

public class L13_Parametars {
	
	public static void main(String[]args) {	
		getName ("John", "Smith");
		getName ("Mateja", "Smith");

    }
	
	public static void getName(String firstName, String lastName) {
		System.out.println("Hello my name is " + firstName + " " + lastName);
	}
}