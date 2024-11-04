import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;

public class BufferWriter {
    
    //Global Variables
    private static Scanner in;
    private static BufferedWriter out;
    private static final String DATA_FILE = "Animals.txt";

    public static void writeString(String s){
        // if BufferedWriter object is already created you are accessing a file that is open
        if(out==null){
            //try to do this
            try{
                //FileWriter writes to the file while BufferedWriter takes data and gives to FW
                out = new BufferedWriter(new FileWriter(DATA_FILE));
            }
            //if this fails, do this
            catch(Exception e){
                System.err.println(e);
                e.printStackTrace();
            }

        }
        //if you have an out ibject,we can now try to write the file
        try{
            out.write(s);
            out.newLine(); //add a new line to the text file
        }
        catch(Exception e){
            System.err.println("Cannot write file!");
            e.printStackTrace();
        }
    }

    public static void saveAndClose(){
        // closes after the Scanner is done reading/writing the file
        if(in!=null){
            try{
                in.close(); in=null;
            }
            catch(Exception e){
                System.err.println("Cannot close the file!");
                e.printStackTrace();
            }
        }
        if(out!=null){
            try{
                out.close(); out=null;
            }
            catch(Exception e){
                System.err.println("Cannot close the file!");
                e.printStackTrace();
            }
        }
    }

    public static String readString(){
        //check to see if the in object is already there
        //this if statement opens the file
        if(in==null){
            try{
                in = new Scanner(new File(DATA_FILE));
            }
            catch(Exception e){
                System.err.println("Cannot open the file!");
                e.printStackTrace();
            }
        }
        //read teh file
        try{
            if(in.hasNext()){
                String s = in.nextLine();
                return s;
            }
            //if the file is blank
            else{
                return null;
            }
        }
        catch(Exception e){
            System.err.println("Cannot read the file!");
            e.printStackTrace();
        }

        return null;

    }
    
}
