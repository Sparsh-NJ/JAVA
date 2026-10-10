
public class ExceptionHandling {
    public static void main(String[] args) {
        //We handle the runtime exceptions , example if I divide by zero;

        int i=0;
        int j=0;

        //we can catch using a catch block

        try{
        j = 18/i;
        }catch(Exception e){
            System.out.println("Something went wrong");
        }
        //After proper exception handling the execution of code continues as normal
        System.out.println("Value of j is " + j);
    }
}
