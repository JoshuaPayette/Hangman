import java.util.Random;
import java.util.Scanner;
public class Hangman {



    public static void main(String[]args) {
        // variables or some bull
        String HANGMAN;
        String build;


        //initializing sum stuff
        String[] words = {"hangman", "chairs", "backpack", "bodywash", "clothing",
                "computer", "python", "program", "glasses", "sweatshirt",
                "sweatpants", "mattress", "friends", "clocks", "biology",
                "algebra", "suitcase", "knives", "ninjas", "shampoo","Awkward","Bagpipes","Banjo","Hyphen",
                "Croquet", "Crypt", "Dwarves","","Fishhook","Haiku","Gazebo" };

        int randomWordnumber = (int) (Math.random() * words.length);



        //intro then main code

        System.out.println("WELCOME TO THE GAME OF HANGMAN!\nWhere you essentially try to not hang a man.");
        System.out.println("I will be making up words and you will try and guess them one letter at a time.");
        System.out.println("But hold on now you only have 15 tries to guess the word before the man is hanged.");
        System.out.println("So good luck and get to guessing!");







        public static int enterLetter(String word, char[] enteredLetters)    {
            System.out.print("Take a chance to save the man what is you letter of choice ");
            // If-clause is true if no asterisks were printed so
            // word is successfully guessed
            if (! printWord(word, enteredLetters))
                return 3;
            System.out.print(" > ");
            Scanner input = new Scanner(System.in);
            int emptyPosition = findEmptyPosition(enteredLetters);
            char userInput = input.nextLine().charAt(0);
            if (inEnteredLetters(userInput, enteredLetters)) {
                System.out.println(userInput + " is already in the word");
                return 2;
            }
            else if (word.contains(String.valueOf(userInput))) {
                enteredLetters[emptyPosition] = userInput;
                return 1;
            }
            else {
                System.out.println(userInput + " is not in the word");
                return 0;
            }
        }

        public static boolean printWord(String word, char[] enteredLetters) {
            // Iterate through all letters in word
            boolean asteriskPrinted = false;
            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                // Check if letter already have been entered bu user before
                if (inEnteredLetters(letter, enteredLetters))
                    System.out.print(letter); // If yes - print it
                else {
                    System.out.print('*');
                    asteriskPrinted = true;
                }
            }
            return asteriskPrinted;
        }





        System.out.println("----------------------");
        System.out.println("           |          ");
        System.out.println("           0          ");
        System.out.println("           |          ");
        System.out.println("       <---|--->      ");
        System.out.println("           |          ");
        System.out.println("          / /         ");
        System.out.println("          / /         ");
        System.out.println("----------------------");
        System.out.println("           |          ");
        System.out.println("           0          ");
        System.out.println("           |          ");
        System.out.println("       <---|-->       ");
        System.out.println("           |          ");
        System.out.println("          / /         ");
        System.out.println("          / /         ");
        System.out.println("----------------------");










    }
}
