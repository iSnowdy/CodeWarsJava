package Kyu_8;

public class Rock_Paper_Scissors {
    public static void main (String[] args) {

        String p1 = "paper";
        String p2 = "scissors";

        String rules = "rockscissorspaperrockscissorspaper";
        String result = "";

        result = p1.equals(p2) ? "Draw!" : "Player " + (rules.contains(p1 + p2) ? 1 : 2) + " Won!";

        System.out.println(result);

    }
}
