package JavaPractice.Homework;

import java.util.Scanner;
import java.util.Random;

public class PracticeSetThree {
    public static void main(String[] args){

        ////////////////////// Problem 1 //////////////////////
        Scanner ui = new Scanner(System.in);

        System.out.println("Please Enter todays Date (Sunday = 0, Monday = 1, Tuesday = 2, etc.):");
        int tday = ui.nextInt();
        System.out.println("Enter the number of days since today:");
        int nday = ui.nextInt();
        double day = tday+nday;
        day = (day%7);
       
        String Date = "";
        if(tday==0){
            Date = "Sunday";
        }
        else if(tday==1){
            Date = "Monday";
        }
        else if(tday==2){
            Date = "Tuesday";
        }
        else if(day==3){
            Date = "Wednesday";
        }
        else if(day==4){
            Date = "Thursday";
        }
        else if(day==5){
            Date = "Friday";
        }
        else{
            Date = "Saturday";
        }

        if(day==0){
            System.out.println("Today is "+Date+" and in "+nday+" days it will be Sunday");
        }
        else if(day==1){
            System.out.println("Today is "+Date+" and in "+nday+" days it will be Monday");
        }
        else if(day==2){
            System.out.println("Today is "+Date+" and in "+nday+" days it will be Tuesday");
        }
        else if(day==3){
            System.out.println("Today is "+Date+" and in "+nday+" days it will be Wednesday");
        }
        else if(day==4){
            System.out.println("Today is "+Date+" and in "+nday+" days it will be Thursday");
        }
        else if(day==5){
            System.out.println("Today is "+Date+" and in "+nday+" days it will be Friday");
        }
        else{
            System.out.println("Today is "+Date+" and in "+nday+" days it will be Saturday");
        }
        ////////////////////// Problem 2 //////////////////////
        System.out.println("Please provide three integers seperated by spaces (ex:x y z)");
        String ints = "";
        ints = ui.nextLine();
        ints = ui.nextLine();

        int x1 = Integer.parseInt(ints.substring(0,1));
        int x2 = Integer.parseInt(ints.substring(2,3));
        int x3 = Integer.parseInt(ints.substring(4,5));
        
        if(x1>x2 && x2>x3){
            System.out.println(x3+" "+x2+" "+x1);
        }
        else if(x3>x1 && x1>x2){
            System.out.println(x2+" "+x1+" "+x3);
        }
        else if(x2>x3 && x3>x1){
            System.out.println(x1+" "+x3+" "+x2);
        }
        else if(x3>x2 && x2>x1){
            System.out.println(x1+" "+x2+" "+x3);
        }
        else if(x1>x3 && x3>x2){
            System.out.println(x2+" "+x3+" "+x1);
        }
        else{
            System.out.println(x3+" "+x1+" "+x2);
        }
        
        ////////////////////// Problem 3 //////////////////////
        System.out.println("Please enter a three-digit number:");
        String num = ui.nextLine();

        String numrev = "";
        for (int i=num.length()-1;i>=0;i--){
            numrev+=num.charAt(i);
        }

        if (num.equals(numrev)){
            System.out.println(num+" is a palindrome");
        }
        else{
            System.out.println(num+" is not a palindrome");
        }
        ////////////////////// Problem 4 //////////////////////'
        Random randy = new Random();
        int comp = randy.nextInt(0,5);
        System.out.println("rock(0), paper(1), scissors(2), lizard(3), spock(4): ");
        int user = ui.nextInt();
        
        if (user==0){
            if(user==comp){
                System.out.println("The computer is rock. You are also rock. It's a draw");
            }
            else if(comp==1){
                System.out.println("The computer is paper. You are rock. Computer wins");            
            }
            else if(comp==2){
                System.out.println("The computer is scissors. You are rock. You win");            
            }
            else if(comp==3){
                System.out.println("The computer is lizard. You are rock. You win");            
            }
            else{
                System.out.println("The computer is spock. You are rock. Computer wins");
            }
        }
        else if (user==1){
            if(user==comp){
                System.out.println("The computer is paper. You are also paper. It's a draw");
            }
            else if(comp==0){
                System.out.println("The computer is rock. You are paper. You win");            
            }
            else if(comp==2){
                System.out.println("The computer is scissors. You are paper. Computer wins");            
            }
            else if(comp==3){
                System.out.println("The computer is lizard. You are paper. Computer wins");            
            }
            else{
                System.out.println("The computer is spock. You are paper. You win");
            }
        }
        else if (user==2){
            if(user==comp){
                System.out.println("The computer is scissors. You are also scissors. It's a draw");
            }
            else if(comp==0){
                System.out.println("The computer is rock. You are scissors. Computer wins");            
            }
            else if(comp==1){
                System.out.println("The computer is paper. You are scissors. You win");            
            }
            else if(comp==3){
                System.out.println("The computer is lizard. You are scissors. You win");            
            }
            else{
                System.out.println("The computer is spock. You are scissors. Computer wins");
            }
        }
        else if (user==3){
            if(user==comp){
                System.out.println("The computer is lizard. You are also lizard. It's a draw");
            }
            else if(comp==0){
                System.out.println("The computer is rock. You are lizard. Computer wins");            
            }
            else if(comp==1){
                System.out.println("The computer is paper. You are lizard. You win");            
            }
            else if(comp==2){
                System.out.println("The computer is scissors. You are lizard. Computer wins");            
            }
            else{
                System.out.println("The computer is spock. You are lizard. Computer wins");
            }
        }
        else {
            if(user==comp){
                System.out.println("The computer is spock. You are also spock. It's a draw");
            }
            else if(comp==0){
                System.out.println("The computer is rock. You are spock. You win");            
            }
            else if(comp==1){
                System.out.println("The computer is paper. You are spock. Computer wins");            
            }
            else if(comp==2){
                System.out.println("The computer is scissors. You are spock. You win");            
            }
            else{
                System.out.println("The computer is lizard. You are spock. You win");
            }
        }
        ui.close();
        ////////////////////// Problem 4 //////////////////////
        Random randall = new Random();
        int suit = randall.nextInt(0,3);
        int rank = randall.nextInt(1,13);

        if(suit==0){
            if(rank==1){
                System.out.println("The card you picked is Ace of Clubs");
            }
            else if(rank==2){
                System.out.println("The card you picked is a 2 of Clubs");
            }
            else if(rank==3){
                System.out.println("The card you picked is a 3 of Clubs");
            }
            else if(rank==4){
                System.out.println("The card you picked is a 4 of Clubs");
            }
            else if(rank==5){
                System.out.println("The card you picked is a 5 of Clubs");
            }
            else if(rank==6){
                System.out.println("The card you picked is a 6 of Clubs");
            }
            else if(rank==7){
                System.out.println("The card you picked is a 7 of Clubs");
            }
            else if(rank==8){
                System.out.println("The card you picked is a 8 of Clubs");
            }
            else if(rank==9){
                System.out.println("The card you picked is a 9 of Clubs");
            }
            else if(rank==10){
                System.out.println("The card you picked is a 10 of Clubs");
            }
            else if(rank==11){
                System.out.println("The card you picked is a Jack of Clubs");
            }
            else if(rank==12){
                System.out.println("The card you picked is a Queen of Clubs");
            }
            else{
                System.out.println("The card you picked is a King of Clubs");
            }
        }
        else if(suit==1){
            if(rank==1){
                System.out.println("The card you picked is Ace of Diamonds");
            }
            else if(rank==2){
                System.out.println("The card you picked is a 2 of Diamonds");
            }
            else if(rank==3){
                System.out.println("The card you picked is a 3 of Diamonds");
            }
            else if(rank==4){
                System.out.println("The card you picked is a 4 of Diamonds");
            }
            else if(rank==5){
                System.out.println("The card you picked is a 5 of Diamonds");
            }
            else if(rank==6){
                System.out.println("The card you picked is a 6 of Diamonds");
            }
            else if(rank==7){
                System.out.println("The card you picked is a 7 of Diamonds");
            }
            else if(rank==8){
                System.out.println("The card you picked is a 8 of Diamonds");
            }
            else if(rank==9){
                System.out.println("The card you picked is a 9 of Diamonds");
            }
            else if(rank==10){
                System.out.println("The card you picked is a 10 of Diamonds");
            }
            else if(rank==11){
                System.out.println("The card you picked is a Jack of Diamonds");
            }
            else if(rank==12){
                System.out.println("The card you picked is a Queen of Diamonds");
            }
            else{
                System.out.println("The card you picked is a King of Diamonds");
            }
        }
        else if(suit==2){
            if(rank==1){
                System.out.println("The card you picked is Ace of Hearts");
            }
            else if(rank==2){
                System.out.println("The card you picked is a 2 of Hearts");
            }
            else if(rank==3){
                System.out.println("The card you picked is a 3 of Hearts");
            }
            else if(rank==4){
                System.out.println("The card you picked is a 4 of Hearts");
            }
            else if(rank==5){
                System.out.println("The card you picked is a 5 of Hearts");
            }
            else if(rank==6){
                System.out.println("The card you picked is a 6 of Hearts");
            }
            else if(rank==7){
                System.out.println("The card you picked is a 7 of Hearts");
            }
            else if(rank==8){
                System.out.println("The card you picked is a 8 of Hearts");
            }
            else if(rank==9){
                System.out.println("The card you picked is a 9 of Hearts");
            }
            else if(rank==10){
                System.out.println("The card you picked is a 10 of Hearts");
            }
            else if(rank==11){
                System.out.println("The card you picked is a Jack of Hearts");
            }
            else if(rank==12){
                System.out.println("The card you picked is a Queen of Hearts");
            }
            else{
                System.out.println("The card you picked is a King of Hearts");
            }
        }
        else{
            if(rank==1){
                System.out.println("The card you picked is Ace of Spades");
            }
            else if(rank==2){
                System.out.println("The card you picked is a 2 of Spades");
            }
            else if(rank==3){
                System.out.println("The card you picked is a 3 of Spades");
            }
            else if(rank==4){
                System.out.println("The card you picked is a 4 of Spades");
            }
            else if(rank==5){
                System.out.println("The card you picked is a 5 of Spades");
            }
            else if(rank==6){
                System.out.println("The card you picked is a 6 of Spades");
            }
            else if(rank==7){
                System.out.println("The card you picked is a 7 of Spades");
            }
            else if(rank==8){
                System.out.println("The card you picked is a 8 of Spades");
            }
            else if(rank==9){
                System.out.println("The card you picked is a 9 of Spades");
            }
            else if(rank==10){
                System.out.println("The card you picked is a 10 of Spades");
            }
            else if(rank==11){
                System.out.println("The card you picked is a Jack of Spades");
            }
            else if(rank==12){
                System.out.println("The card you picked is a Queen of Spades");
            }
            else{
                System.out.println("The card you picked is a King of Spades");
            }
        }
        
}
}
