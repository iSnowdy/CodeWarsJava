package Kyu_8;

public class How_old_will_I_be_in_2099 {
    public static void main (String[] args) {

        int birth = 2012;
        int yearTo = 2016;

        String result;

        result = (birth < yearTo) ?  "You are " + (yearTo - birth) + " years old." :
                "You will be born in " + (birth - yearTo) + " years.";

        if (birth - yearTo == 1 || yearTo - birth == 1) {
            result = (birth < yearTo) ?  "You are " + (yearTo - birth) + " year old." :
                    "You will be born in " + (birth - yearTo) + " year.";
        }

        else if (birth - yearTo == 0) {
            result = "You were born this very year!";
        }

        System.out.println(result);

        /*

        public class AgeDiff {

            public static String CalculateAge(int birth, int year) {

                final int age = year - birth;
                return
                age == 0 ? "You were born this very year!" :
                age > 0 ? String.format("You are %d year%s old.", age, age == 1 ? "" : "s") :
                String.format("You will be born in %d year%s.", -age, -age == 1 ? "" : "s");
  }
}

         */


    }
}
