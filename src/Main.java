//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        String keyStr = String.valueOf(key);
        int[] digits = new int[keyStr.length()];
        for (int i = 0; i < keyStr.length(); i++) {
            digits[i] = Character.getNumericValue(keyStr.charAt(i));
        }
        
        int[] encoded = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int letterNum = letterToNumber.get(str.charAt(i));
            int keyDigit = digits[i % digits.length];
            encoded[i] = letterNum + keyDigit;
        }
        
        return encoded;
    }
}
