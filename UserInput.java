import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        System.out.println("Enter your inpt :- ");
        Scanner sc = new Scanner(System.in); //Stored user input in sc variable
        int num = sc.nextInt(); //assigning inst value of input to sc
        System.out.println("Enterered number is "+num);


        //Earlier BufferReader class was used to take inputs which was complex in nature
    }
}
