public class ThrowKeyword2 {
    public static void main(String[] args) {
        int i=2;
        int j=10;


        try {
             j = j/i;
             //Manullay throwing ArithmeticException
             throw new ArithmeticException("Throwing exception manually");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println(j);

    }
}
