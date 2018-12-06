
import java.util.Scanner;
public class Hangman {
//words used
    private static String[] words = {
            //CHOOSE YOUR TIER
        //TIER 1 WORDS
        "terminator","restaurant","fishhook","bagpipes","awkward","jukebox","dwarves",
        //TIER 2 WORDS
        "zombie","rhythm","gazebo","banjo","sphinx","yacht","unzip","zebra","crypt","jazz",
        //TIER 3 WORDS
        "oxygen","computer","ninjas","yeet","dab","naenae","kiosk",
        //TIER 4 WORDS
        "banana","chairs","cow","rain","water",};
    private static String word = words[(int) (Math.random() * words.length)];
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
    private static int count = 0;
//scanner and rules
        public static void main (String[]args) {
            Scanner sc = new Scanner(System.in);

                do {
                    System.out.println("Thanks for playing!");
                    System.out.println("WELCOME TO THE GAME OF HANGMAN! 2 PLAYER EDITION");
                    System.out.println("Where you essentially try to not hang a man.");
                    System.out.println("I will be making up words and you will try and guess them one letter at a time.");
                    System.out.println("But hold on now you only have 7 tries to guess the word before the man is hanged.");
                    System.out.println("So good luck and get to guessing! (Do not type in caps. Only lowercase!)");


//tries


                    while (count < 9 && asterisk.contains("*")) {
                        System.out.println("Guess any letter in the word");
                        System.out.println(asterisk);
                        String guess = sc.next();
                        hang(guess);
                    }

                    sc.nextLine();
                }while(!sc.nextLine().equals("no"));
            System.out.println("Thanks for playing!");

        }
//guesses

            public static void hang (String guess){


                String newasterisk = "";
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess.charAt(0)) {
                        newasterisk += guess.charAt(0);
                    } else if (asterisk.charAt(i) != '*') {
                        newasterisk += word.charAt(i);
                    } else {
                        newasterisk += "*";
                    }
                }

                if (asterisk.equals(newasterisk)) {
                    count++;
                    hangmanImage();
                } else {
                    asterisk = newasterisk;
                }
                if (asterisk.equals(word)) {
                    System.out.println("Correct! You win! The word was " + word + " you had point(s)");
                    System.out.println("Player two are you up to the challenge?");
                }

            }

//hangman code
            public static void hangmanImage () {
                if (count == 1) {

                    System.out.println("This is your " + count + "st of 9 fails..");
                    System.out.println("Wrong guess, try again");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("___|___");
                    System.out.println();
                }
                if (count == 2) {

                    System.out.println("This is your " + count + "nd of 9 fails..");
                    System.out.println("Wrong guess, try again");
                    System.out.println();
                    System.out.println();
                    System.out.println("   |   ");
                    System.out.println("   |   ");
                    System.out.println("   |   ");
                    System.out.println("___|___");
                }
                if (count == 3) {
                    System.out.println("This is your " + count + "rd of 9 fails..");
                    System.out.println("Wrong guess, try again");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("___|___");
                }
                if (count == 4) {
                    System.out.println("This is your " + count + "th of 9 fails..");
                    System.out.println("Wrong guess, try again");
                    System.out.println("   ____________");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   | ");
                    System.out.println("___|___");
                }
                if (count == 5) {
                    System.out.println("This is your " + count + "th of 9 fails..");
                    System.out.println("Wrong guess, try again");
                    System.out.println("   ____________");
                    System.out.println("   |          _|_");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   | ");
                    System.out.println("___|___");
                }
                if (count == 6) {
                    System.out.println("This is your " + count + "th of 9 fails..");
                    System.out.println("Wrong guess, try again");
                    System.out.println("   ____________");
                    System.out.println("   |          _|_");
                    System.out.println("   |         /   \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("___|___");
                }
                if (count == 7) {
                    System.out.println("This is your " + count + "th of 9 fails..");
                    System.out.println("Wrong guess, try again");
                    System.out.println("   ____________");
                    System.out.println("   |          _|_");
                    System.out.println("   |         /   \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |           |");
                    System.out.println("   |           |");
                    System.out.println("   |");
                    System.out.println("___|___");
                }
                if (count == 8) {
                    System.out.println("This is your " + count + "th of 9 fails..");
                    System.out.println("Wrong guess, try again");
                    System.out.println("   ____________");
                    System.out.println("   |          _|_");
                    System.out.println("   |         /   \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |           |");
                    System.out.println("   |           |");
                    System.out.println("   |          / \\ ");
                    System.out.println("___|___      /   \\");
                }
                if (count == 9) {
                    System.out.println("This is your " + count + "th of 9 fails..");
                    System.out.println("GAME OVER!");
                    System.out.println("   ____________");
                    System.out.println("   |          _|_");
                    System.out.println("   |         /   \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |          _|_");
                    System.out.println("   |         / | \\");
                    System.out.println("   |          / \\ ");
                    System.out.println("___|___      /   \\");
                    System.out.println("GAME OVER! The word was " + word+" would you like to play again?");


                }
            }

}
















