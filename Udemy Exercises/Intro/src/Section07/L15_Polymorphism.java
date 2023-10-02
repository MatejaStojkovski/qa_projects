package Section07;

public class L15_Polymorphism {
	
	public static void main(String[] args) {

		Animal bengie = new Animal();
		bengie.makeSound();
		
		bengie = new Dog();
		bengie.makeSound();
		
		bengie = new Cat();
		bengie.makeSound();
		
	}
}

class Animal {
	public void makeSound() {
		System.out.println("Bahhh");
	}
}

class Dog extends Animal {
	public void makeSound() {
		System.out.println("Woof!!");
	}
}

class Cat extends Animal {
	public void makeSound() {
		System.out.println("Meow!!");
	}
}

//So you got to remember here that polymorphism means many forms.
//it occurs when we have many classes that are related to each other by inheritance.