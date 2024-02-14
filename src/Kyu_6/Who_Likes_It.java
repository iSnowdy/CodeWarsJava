package Kyu_6;

public class Who_Likes_It {
    public static void main (String[] args) {

        String[] names1 = {"Alex", "Jacob", "Mark", "Max"};
        String[] names2 = {"Alex", "Jacob", "Mark", "Max"};

        String result =
                names1.length == 0 ? "no one likes this"
                : names1.length == 1 ? String.format("%s likes this", names1)
                : names1.length == 2 ? String.format("%s and %s like this", names1[0], names1[1])
                : names1.length == 3 ? String.format("%s, %s and %s like this", names1[0], names1[1], names1[2])
                : String.format("%s, %s and %d others like this", names1[0], names1[1], names1.length - 2);

        System.out.println(result);

    }
}
