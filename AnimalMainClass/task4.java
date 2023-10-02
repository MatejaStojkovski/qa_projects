package academy.java.animals;

public class task4 {
    public void vowelsINText() {

        String text = "Today is my son's birthday and we will celebrate it with our loved ones in a children's playroom ";
        System.out.println(text.length());

        int vowels = 0;
        for (int i = 0; i < text.length(); i++) {
            char birthday = text.charAt(i);
            if (birthday == 'a' || birthday == 'e' || birthday == 'i' || birthday == 'u' || birthday == 'o') {
                vowels++;
            }
        }
        System.out.println("There are " + vowels + " number in the written text");
    }
}