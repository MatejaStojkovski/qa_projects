package academy.java.animals;

public class Animal {
    String name;
    String type;
    int age;
    int weight;
    String size;
    String verb;

    public void whoAmI() {
        System.out.println("I am a small " + type + ", specifically a " + name);
    }

    public void ageAndWeight() {
        System.out.println("I am " + age + " of age, and I weigh a staggering " + weight + " kilograms ");
    }

    public void sizeAndFunction() {
        System.out.println("I am a " + size + ", and my main hobby is " + verb );
    }
}
