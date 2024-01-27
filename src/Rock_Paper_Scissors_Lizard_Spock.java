public class Rock_Paper_Scissors_Lizard_Spock {
    public static void main(String[] args) {

        String result = "";
        String[] options = {"rock", "paper", "scissors", "lizard", "spock"};
        String player1 = "paper";
        String player2 = "rock";

        if (player1 == "paper" && player2 == "rock") {
            result = "Player 1 Won!";
        }
        else if (player1 == "scissors" && player2 == "paper") {
            result = "Player 1 Won!";
        }
        else if (player1 == "rock" && player2 == "scissors") {
            result = "Player 1 Won!";
        }
        if (player2 == "paper" && player1 == "rock") {
            result = "Player 2 Won!";
        }
        else if (player2 == "scissors" && player1 == "paper") {
            result = "Player 2 Won!";
        }
        else if (player2 == "rock" && player1 == "scissors") {
            result = "Player 2 Won!";
        }
        else if (player1 == "rock" && player2 == "lizard") {
            result = "Player 1 Won!";
        }
        else if (player1 == "lizard" && player2 == "spock") {
            result = "Player 1 Won!";
        }
        else if (player1 == "spock" && player2 == "scissors") {
            result = "Player 1 Won!";
        }
        else if (player1 == "scissors" && player2 == "lizard") {
            result = "Player 1 Won!";
        }
        else if (player1 == "lizard" && player2 == "paper") {
            result = "Player 1 Won!";
        }
        else if (player1 == "paper" && player2 == "spock") {
            result = "Player 1 Won!";
        }
        else if (player1 == "spock" && player2 == "rock") {
            result = "Player 1 Won!";
        }
        else if (player1 == "rock" && player2 == "scissors") {
            result = "Player 1 Won!";
        }
        else if (player2 == "rock" && player1 == "lizard") {
            result = "Player 2 Won!";
        }
        else if (player2 == "lizard" && player1 == "spock") {
            result = "Player 2 Won!";
        }
        else if (player2 == "spock" && player1 == "scissors") {
            result = "Player 2 Won!";
        }
        else if (player2 == "scissors" && player1 == "lizard") {
            result = "Player 2 Won!";
        }
        else if (player2 == "lizard" && player1 == "paper") {
            result = "Player 2 Won!";
        }
        else if (player2 == "paper" && player1 == "spock") {
            result = "Player 2 Won!";
        }
        else if (player2 == "spock" && player1 == "rock") {
            result = "Player 2 Won!";
        }
        else if (player2 == "rock" && player1 == "scissors") {
            result = "Player 2 Won!";
        }

        if (player1 == player2) {
            result = "Draw!";
        }

        System.out.println(result);
    }

}
