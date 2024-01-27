import java.util.Arrays;
import java.util.Objects;

public class Sheep{

    public static void main(String[] args) {

        String[] Sheeps_Wolf = {"sheep", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep", "wolf"};
        int wolf_position;
        int sheep_danger_position;

        wolf_position = Arrays.asList(Sheeps_Wolf).indexOf("wolf");
        System.out.println(Sheeps_Wolf.length);

        if (Objects.equals(Sheeps_Wolf[Sheeps_Wolf.length -1], "wolf")) {
            System.out.print("Pls go away and stop eating my sheep");
        }

        else {
            sheep_danger_position = Sheeps_Wolf.length - (wolf_position + 1);
            System.out.print("Oi! Sheep number " + sheep_danger_position + "! You are about to be eaten by a wolf!");

        }
    }
}

/*

Cleaner way of doing it

import java.util.*;

public class ZywOo {

  public static String warnTheSheep(String[] array) {
    Collections.reverse(Arrays.asList(array));
    int pos = Arrays.asList(array).indexOf("wolf");
    return pos == 0 ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + pos + "! You are about to be eaten by a wolf!";
  }

}

*/
