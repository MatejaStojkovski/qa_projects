package Section07;

public class L14_Inheritemce {
	
	public static void main(String[]args) {	
		Car carObject = new Car();
		carObject.rev();
		System.out.println(carObject.getMake() + " " + carObject.getModel());

	}
}

class Vehicle{
	private String make = "BMW";
	
	public String getMake() {
		return make;
	}
	public void rev() {
		System.out.println("Vroooom!");
	}
}

class Car extends Vehicle {
	private String model = "3 Series";
	
	public String getModel() {
		return model; 
	}
}
//kreiramo klasu u klasu na klasu davamo ime 
// private field koe se vika make 
// naredno pravimo metodu koja e public kd se povikue get_____ u nash sluchak Make ke vrakja vrednost na field 
// nova metoda public void koja se vika rev i povikuemo vROOM u konzolu
// nadvor od tuj klasu pravimo drugu koja ss key word extends se povrzue ss gornju klasu i ga pishuemo ime na klasu 
// drug private field koe se vika model i e ednakvo na  3 series toj treba da pokaze ss get_____
// return ga povrszuemo ss string koj shto sakamo da ni se prikaze 
//idemo nazad u main kude pravimo new car object koj se ednakvo na new Car 
// posle ss tj car object  povikuemo metodu rev() 
// u SOUT ga povikuemo car object povikue metode getMake i getModel 