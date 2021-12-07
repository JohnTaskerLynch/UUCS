import uulib.Console;
import uulib.ArrayUtils;

public class Main {

    // Challenge question 1
    public static void countdown(int x) {
        String code = "CODE";
        int codePos = 0;

        for(int i = x; i >= 0; i--) {
            System.out.println(i + " " + code.charAt(codePos));
            codePos++;

            if((codePos % 4) == 0) {
                codePos = 0;
            }
        }
    }

    public static void question1() {
        int input = Console.getInt("Number to Count Down from: ");
        while(!(input > 0)) {
            System.out.println("Must be a positive integer");
            input = Console.getInt("Number to Count Down from: ");
        }

        countdown(input);
    }

    // Challenge Question 2    
    public static void question2() {
        String morse = Morse.messageToMorse("the quick brown fox");
        String sentence = Morse.messageFromMorse(morse);

        System.out.println(morse);
        System.out.println(sentence);
    }


    public static void main(String[] args) {

        question1();
        question2();

    }




}