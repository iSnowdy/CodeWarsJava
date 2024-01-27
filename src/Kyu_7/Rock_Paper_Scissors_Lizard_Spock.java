package Kyu_7;

public class Rock_Paper_Scissors_Lizard_Spock {
    public static String rpsls(String player1, String player2) {
        if (player1.equals(player2)) {
            return "Draw!";
        }

        if (isPlayer1Winner(player1, player2)) {
            return "Player 1 Won!"; // The method only needs to determine Player 1 win conditions
        } else {
            return "Player 2 Won!";
            // Since we discarded the Draw possibility first, and Player 1 win condition before, all that is left is
            // for Player 2 to win. Therefore, else
        }
    }

    private static boolean isPlayer1Winner(String move1, String move2) {
        return ("rock".equals(move1) && ("scissors".equals(move2) || "lizard".equals(move2))) ||
                ("paper".equals(move1) && ("rock".equals(move2) || "spock".equals(move2))) ||
                ("scissors".equals(move1) && ("paper".equals(move2) || "lizard".equals(move2))) ||
                ("lizard".equals(move1) && ("spock".equals(move2) || "paper".equals(move2))) ||
                ("spock".equals(move1) && ("scissors".equals(move2) || "rock".equals(move2)));

                /* This is basically a list of the winning conditions for Player 1. So, for example: rock beats
                scissors and lizard. That is the first line (scissors or lizard). Etc ...

                If the method is fulfilled, it will return True, and the calling function will return the first
                statement: Player 1 Won.

                 */
    }

    public static void main(String[] args) {

        System.out.println(Rock_Paper_Scissors_Lizard_Spock.rpsls("rock", "lizard"));
        System.out.println(Rock_Paper_Scissors_Lizard_Spock.rpsls("rock", "spock"));
        System.out.println(Rock_Paper_Scissors_Lizard_Spock.rpsls("rock", "rock"));

    }


}