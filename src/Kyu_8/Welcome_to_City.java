package Kyu_8;

public class Welcome_to_City {
    public static void main (String[] args) {

        String[] name = {"John", "Smith"};
        String city = "Phoenix";
        String state = "Arizona";


        String Name = String.join(" ", name); // The name, in case its more than one word, will join them and also introduce spaces in between them
        String Hello = ("Hello, " + Name + "! Welcome to " + city + ", " + state + "!");

        System.out.println(Hello);
    }

}
