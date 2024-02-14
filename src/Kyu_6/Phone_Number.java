package Kyu_6;


public class Phone_Number {
    public static void main(String[] args) {

        int[] phoneNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < phoneNumber.length; i ++) {
            builder.append(phoneNumber[i]);
        }

        String phoneString = "(" + builder.substring(0, 3) + ") " + builder.substring(3, 6)
                + "-" + builder.substring(6, 10);

        System.out.println(phoneString);

    }

}
