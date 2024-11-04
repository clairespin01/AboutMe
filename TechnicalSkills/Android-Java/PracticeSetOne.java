package JavaPractice.Homework;
import java.util.Scanner;

public class PracticeSetOne {
   public static void main (String[] args){
    Scanner ui = new Scanner(System.in);


      ////////////////////// Problem 1 //////////////////////

      System.out.println("Enter miles:");
      double miles = ui.nextDouble();
      double kilo = (miles*1.6);

      System.out.printf(miles+" miles is %2.2f kilometers %n",kilo);


      ////////////////////// Problem 2 //////////////////////
      
      System.out.println("Enter the amount of water in kilograms:");
      double kgs = ui.nextDouble();
      System.out.println("Enter the initial temperature:");
      double it = ui.nextDouble();
      System.out.println("Enter the final temperature:");
      double ft = ui.nextDouble();
      double energy = kgs*(ft-it)*4184;

      System.out.printf("The energy needed is %2.2f jules %n", energy);

      ////////////////////// Problem 3 //////////////////////

      System.out.println("Enter the investment amount:");
      double invst = ui.nextDouble();
      System.out.println("Enter the annual interest rate in percentage:");
      double pcent = ui.nextDouble();
      pcent = pcent/100;
      System.out.println("Enter the number of years:");
      int yrs = ui.nextInt();
      double ftamt = (invst*(Math.pow((1+(pcent)),(yrs))));

      System.out.printf("The future value of your investment is $%2.2f  %n", ftamt);

      ////////////////////// Problem 4 //////////////////////

      System.out.println("Enter the driving distance:");
      double dist = ui.nextDouble();
      System.out.println("Enter the miles per gallon:");
      double mpg = ui.nextDouble();
      System.out.println("Enter the price per gallon:");
      double ppg = ui.nextDouble();
      double cost = (ppg*(dist/mpg));

      System.out.printf("The cost of driving is $%2.2f %n", cost);

      ////////////////////// Problem 5 //////////////////////

      System.out.printf("\t\sJ\nJ\taaa\tv\tvaaa\nJ\tJ\taa\tv\sv\ta\sa\nJ\t\saaaa\tv\taaaa");

      ////////////////////// Problem 6 //////////////////////

      System.out.println("Please enter your first name:");
      String First = ui.nextLine();
      System.out.println("Please enter your last name:");
      String Last = ui.nextLine();
      System.out.println("Please enter your street address:");
      String addr = ui.nextLine();
      System.out.println("Please enter your city:");
      String city = ui.nextLine();
      System.out.println("Please enter your state:");
      String state = ui.nextLine();
      System.out.println("Please enter your ZIP code (ZIP+4 preffered):");
      String zip = ui.nextLine();
      System.out.println("Please enter your amount owed:");
      double amt = ui.nextDouble();
      System.out.println("Please enter the amount payed:");
      double owed = ui.nextDouble();
      System.out.println("Please enter the date (DD/MM/YYYY):");
      String date = ui.nextLine();
      date = ui.nextLine();

      System.out.println("                                           XYZ Community Hospital                                     ");
      System.out.println("======================================================================================================");
      System.out.println();   
      System.out.println(" Name:                    Address:                         Payment Information:    ");
      System.out.println();
      System.out.println("======================================================================================================");
      System.out.printf(Last+", "+First+"    "+addr+" "+city+" "+state+" "+zip+"    $"+amt+" $"+owed+" "+date);
      
      ui.close();



   }

}
