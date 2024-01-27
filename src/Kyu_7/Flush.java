package Kyu_7;

public class Flush {

    public static boolean isFlush(String[] cards) {

        char suit = cards[0].charAt(cards[0].length() - 1);
        int flushCounter = 0;

        for (String card : cards) {
            if (card.charAt(card.length() - 1) != suit) {
                break;
            } else {
                flushCounter++;
            }
        }

        if (flushCounter == 5) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        String[] hand = {"10D", "4D", "10S", "KD", "5D"};

        System.out.println(isFlush(hand));
    }
}