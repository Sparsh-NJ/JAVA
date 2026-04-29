//Here we will see how to throw customized exceptions
class SparshException extends Exception{
    SparshException(String string){
        super(string); //Exception class has a constructor which prints the msg after an exception
    }
}
public class CustomException {
    public static void main(String[] args) {
        int i=18;
        int j=19;

          try{

            j = j/i;
            // throw new ArithmeticException("Cannot divide by value greater than j");
            //I want to throw my own exception
            throw new SparshException("This is the Sparsh Exception");

        }catch(SparshException e){ //Catching my own Exception

            System.out.println("This is the deafult value of j = " + 19);
            System.out.println(e);
            
        }

    
     }
}
        