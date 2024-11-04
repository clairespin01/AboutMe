package JavaPractice.Homework;
import java.util.Scanner;
public class ComboMenu {
        public static void main(String[] args) {
            Scanner ui = new Scanner(System.in);

            System.out.println("Would you like a sandwich?");
            String response = ui.nextLine();

             for(!response.equals("yes") || response.equals("y") || response.equals("no") || response.equals("n")){
                System.out.println("Please enter a valid answer");
                response = ui.nextLine();
             }
            if(response.equals("yes") || response.equals("y") ){
                System.out.println("What kind of sandwhich would you like?");
                System.out.println("");
                }

            else{

                }

            
        
    }
    


}
