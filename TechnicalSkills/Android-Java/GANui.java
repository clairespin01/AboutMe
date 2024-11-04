import java.util.Random;
import java.util.Scanner;

public class GANui {
    public static void main(String[] args) {
        //Model section - global variables and object creation
        Random randy = new Random();
        Scanner ui = new Scanner(System.in);

        //Controller - this is where user input 
        int RandomInt = randy.nextInt(0,11);
        System.out.println("Guess a number 1-10");
        String guess = ui.nextLine();

        //It would be nice to clean our user input... Because we have suspicious users
        //see if it is an int
        //did they type in letters? aka something else besides numbers?
        // entering nothing

        if (guess.contains(".")){
            System.out.println("Only whole numbers please!");
        }
        else if(guess.isEmpty() || guess.isBlank()){
            System.out.println("Please provide a number!");
        }
        else if(guess.matches("[^0-9]+")){
            System.out.println("Please provide a number!");
        }
        else{
            //Calculations
            int cleanGuess = Integer.parseInt(guess);   //converts /parses from a String back to an int

            if (cleanGuess<(RandomInt)){
                System.out.println("Too low!");
            }
            else if (cleanGuess>(RandomInt)){
                System.out.println("Too high!");
            }
            else{
                System.out.println("Hooray! You got it.");
            }
        

        }


        //View section where you output to the terminals
        ui.close();
    }
}
