import java.util.Scanner;
public class Bottles {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("What is you're favorite flavor of sodie pop");
        String drink = ui.nextLine();

        for(int i=99;i!=0;i--){
            if (i==1){
                System.out.println(i+" bottle of "+drink+" on the wall, "+i+" bottle of "+drink+". Take one down pass it around, no more bottles of "+drink+" on the wall...");
            }
            else{
            System.out.println(i+" bottles of "+drink+" on the wall, "+i+" bottles of "+drink+". Take one down pass it around, "+(i=i--)+" bottles of "+drink+" on the wall...");
            }
            ui.nextLine();
            System.out.print("\033[H\033[J");
        }
        System.out.println("Wow, that was unneccessary...");
    }
    
}
