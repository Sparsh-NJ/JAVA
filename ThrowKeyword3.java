class SparshException extends Exception{
    SparshException(String s){
        super(s); //This calls the constructor of Exception class which will print the msg for us
    }
}
public class ThrowKeyword3 {
        public static void main(String[] args) {
        int i=2;
        int j=10;

        try {
             j = j/i;

             //If we are defining our own Exception then we need to create a class for the same
             //and that class should extend the exception class
             throw new SparshException("Throwing exception manually");
        } catch (SparshException e) {
            System.out.println(e);
        }
        System.out.println(j);

    }
}
