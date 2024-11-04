import java.util.Random;
import java.util.Scanner;

public class SciFi {
    public static void main(String[] args){
        /*
         * Take in the following info from the user
         * first name
         * last name
         * city they would like to live in
         * school - they are going to attend after high school
         * favorite pet's name or favorite appetizer
         * favorite siblings name and if no siblings fav mythical character
         * 
         * Print out the infor in a nic organzied chart like this
         *    first: bob
         *    last: bob
         *    city: Boonville
         *     school: MacDonald's career academy
         *     pet: Mini corn dogs
         *     sib: bob the builder
         * 
         * also only one print function
         */

            Scanner ui = new Scanner(System.in);

            System.out.println("First Name: ");
            String fname = ui.nextLine();
            System.out.println("Last Name: ");
            String lname = ui.nextLine();
            System.out.println("City Name: ");
            String city = ui.nextLine();
            System.out.println("School Name:");
            String school = ui.nextLine();
            System.out.println("Pet Name: ");
            String pet = ui.nextLine();
            System.out.println("Sibling Name: ");
            String sib = ui.nextLine();
        
        String out= "\tfirst:\t"+fname+"\n"+
                    "\tlast:\t"+lname+"\n"+
                    "\tcity:\t"+city+"\n"+
                    "\tschool:\t"+school+"\n"+
                    "\tpet:\t"+pet+"\n"+
                    "\tsib:\t"+sib+"\n";
        System.out.println("User Info to generate from");
        System.out.println(out);
        System.out.println("... Generating in process ...");

        //print("string with placesholders (%s)", variablesToInject)

        // System.out.printf("\tFirst: \t%s\n", fname);

        // Importing random //
        Random randy = new Random();

        int fnlength = fname.length();
        int firstInt = randy.nextInt(1, fnlength);
        String firstTwo = fname.substring(0, firstInt);
        int lnlength = lname.length();
        int secInt = randy.nextInt(1, lnlength);
        String lastTwo = lname.substring(0, secInt);

        String SciFiFirstName = firstTwo+lastTwo;

        int clength = city.length();
        int thirdInt = randy.nextInt(1,clength);
        String secFour = city.substring(0,thirdInt);
        int schlength = school.length();
        int fourInt = randy.nextInt(1,schlength);
        String secThree = school.substring(0,fourInt);

        String SciFiLastName = secFour+secThree;

        int plength = pet.length();
        int fifthInt = randy.nextInt(1,plength);
        String ltThree = pet.substring(0,fifthInt);
        int siblength = sib.length();
        int sixthInt = randy.nextInt(1,siblength);
        String ltTwo = sib.substring(0,sixthInt);

        String SciFiOrigin = ltThree+ltTwo;

        System.out.println("Howdy "+SciFiFirstName+" "+SciFiLastName+" from "+SciFiOrigin);

        /* rev 2
         *      SciFiFirstName = first two letters of first name and last two letters of lastname
         *      ScFiLastName = first four letters of city and last three last letters of school
         *      SciFiOrigin = first three letters of pet and last two letters of sibling
         * 
         * print out -? Howdy SciFiFirstName SciFiLastName from SciFiOrigin
         * 
         * Modify the bellringer so that when you run the program
         *      with the same data, it will generate a new name...
         *      Use the random import
         */


         ui.close();
    }
}
