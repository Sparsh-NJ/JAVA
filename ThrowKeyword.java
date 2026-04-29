public class ThrowKeyword {
    public static void main(String[] args) {
        int i=18;
        int j=19;
    

        //Here we are dividing by 18 not zero therefore by default the it will not therown an exception
        //Hence will not print anything

    //     try{
    //         j = j/i;
    //     }catch(ArithmeticException e){
    //         System.out.println("This is the deafult value of j");
    //         j = 19;
    //         System.out.println("Cannot divide j by value greater than j " + e);
            
    //     }


    //But what if we want the compiler to throw an error even if someone tries to divide the number
    //j by a value greater than j 
    //in this case we can use throw keyword to thrown an exception which will be catched by the compiler

          try{

            j = j/i;
            throw new ArithmeticException("Cannot divide by value greater than j");

        }catch(ArithmeticException e){

            System.out.println("This is the deafult value of j = " + 19);
            // System.out.println("Cannot divide j by value greater than j " + e);
            //suppose we want to print the msg also after the exception we can pass the msg inside the constructor while calling throw new exception

            System.out.println(e);
            
        }

    
     }
}
