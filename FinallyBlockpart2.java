import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyBlockpart2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        //We can use try with resources to automatically claose the resources and we need not to 
        //Mention finally block as well
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter your input :=");
            int num = Integer.parseInt(br.readLine());
            System.out.println("Automatically closes the resourse br " + num);
        }
    }
}
