import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FinallyBlock {
    public static void main(String[] args) throws NumberFormatException, IOException {

        int num = 0;
        BufferedReader br = null;
        try{
            //let's take user input using BufferReader
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in); //br will store the user input instring format
            System.out.println("Enter the user input :-");
            num = Integer.parseInt(br.readLine());//Converting string to int 
        }

        //If we are not handling using catch block we can use throws keyword as above 

        // }catch(Exception e){
        //     System.out.println("Catched the exception");
        // }

        finally{ //Finally block will execute irrespective it will trown an exception or not
            System.out.println("Closing the resource with number " + num);
            br.close(); //Recommended to close the resources after usage , like db connection
        }

        //We can also use finally with try directly 
        //Generally finally block is used to close the resources
    }
}
