package academy.java.animals;

public class AnimalMainClass {
    public static void main(String[] args) {
        Animal uglyAnimal = new Animal();
        uglyAnimal.name = "dog";
        uglyAnimal.type = "terrier";
        uglyAnimal.age = 4;
        uglyAnimal.weight = 6;
        uglyAnimal.size = "small";
        uglyAnimal.verb = "eating";

        uglyAnimal.whoAmI();
        uglyAnimal.ageAndWeight();
        uglyAnimal.sizeAndFunction();

        Animal cuteAnimal = new Animal();
        cuteAnimal.name = "cat";
        cuteAnimal.type = "persian";
        cuteAnimal.age = 3;
        cuteAnimal.weight = 5;
        cuteAnimal.size = "medium";
        cuteAnimal.verb = "petting";

        cuteAnimal.whoAmI();
        cuteAnimal.ageAndWeight();
        cuteAnimal.sizeAndFunction();
    }
}
