package JavaPractice.Homework;
import java.util.Scanner;

public class PracticeSetTwo{
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);

        ////////////////////// Problem 1 //////////////////////

        System.out.println("Please enter the coordinates of three points seperated by spaces (ex: x1 y1 x2 y2 x3 y3)");
        String coords = ui.nextLine();
        int length = coords.length();

        int space = coords.indexOf(" ");

        double x1 = Double.parseDouble(coords.substring(0,space));
        
        coords = coords.substring(space+1, length);
        length = coords.length();
        space = coords.indexOf(" ");
        double y1 = Double.parseDouble(coords.substring(0,space));
        
        coords = coords.substring(space+1, length);
        length = coords.length();
        space = coords.indexOf(" ");
        double x2 = Double.parseDouble(coords.substring(0,space));

        coords = coords.substring(space+1, length);
        length = coords.length();
        space = coords.indexOf(" ");
        double y2 = Double.parseDouble(coords.substring(0,space));

        coords = coords.substring(space+1, length);
        length = coords.length();
        space = coords.indexOf(" ");
        double x3 = Double.parseDouble(coords.substring(0,space));
 
        coords = coords.substring(space+1, length);
        length = coords.length();
        space = coords.indexOf(" ");
        double y3 = Double.parseDouble(coords.substring(0,length));

        double s1 = Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
        double s2 = Math.sqrt((Math.pow(x3-x2,2)+Math.pow(y3-y2,2)));
        double s3 = Math.sqrt((Math.pow(x1-x3,2)+Math.pow(y1-y3,2)));

        double s = (s1 + s2 +s3)/2;
        double area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        
        System.out.printf("The area of the triangle is %2.1f \n", area);
        System.out.println();



        ////////////////////// Problem 2 //////////////////////

        System.out.println("  a          b      Middle Point");
        
        double xa = 0;
        double xb = 2;
        double ya = 0;
        double yb = 1;
        String midpt = ("("+((xa+xb)/2)+","+((ya+yb)/2)+")");

        System.out.println("("+(int)xa+", "+(int)ya+")     ("+(int)xb+", "+(int)yb+")    "+midpt);     

        xa=1;xb=4;ya=4;yb=2;
        midpt = ("("+((xa+xb)/2)+","+((ya+yb)/2)+")");

        System.out.println("("+(int)xa+", "+(int)ya+")     ("+(int)xb+", "+(int)yb+")    "+midpt);
        
        xa=2;xb=6;ya=7;yb=3;
        midpt = ("("+((xa+xb)/2)+","+((ya+yb)/2)+")");

        System.out.println("("+(int)xa+", "+(int)ya+")     ("+(int)xb+", "+(int)yb+")    "+midpt);

        xa=3;xb=10;ya=9;yb=5;
        midpt = ("("+((xa+xb)/2)+","+((ya+yb)/2)+")");

        System.out.println("("+(int)xa+", "+(int)ya+")     ("+(int)xb+", "+(int)yb+")   "+midpt);

        xa=4;xb=12;ya=11;yb=7;
        midpt = ("("+((xa+xb)/2)+","+((ya+yb)/2)+")");

        System.out.println("("+(int)xa+", "+(int)ya+")    ("+(int)xb+", "+(int)yb+")   "+midpt);
        System.out.println();

        ////////////////////// Problem 3 //////////////////////

        System.out.println("Enter the number of minutes: ");
        int min = ui.nextInt();

        int day = min/1440;
        int yrs = (day/365);
        int days = day % 365;

        System.out.println(min+" minutes is approximately "+yrs+" years and "+days+" days.");
        System.out.println();

        ////////////////////// Problem 4 //////////////////////
        
        System.out.println("Enter the length of the sides and height of the Equilateral triangle: ");
        double lnth = ui.nextDouble();

        double A = ((Math.sqrt(3)/4)*(Math.pow(lnth, 2)));
        double vol = A*lnth;

        System.out.printf("The area is %2.2f \n", A);
        System.out.printf("The volume of the triangular prism is %2.2f \n", vol);
        System.out.println();

        ui.close();
    }
}
