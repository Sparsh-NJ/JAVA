//A functional interface has only 1 method
//With functional interfaces we can use Lambda expressions which was introduced in Java 8
interface A{
    void show();
}
public class FunctionalInterface1 {
    public static void main(String[] args) {
        
        //Here I am using the anonymous inner class to implement the show method
        //We have even smaller syntax to implement functional interface method using lamda expressions

        // A obj = new A() {
        //     public void show(){
        //         System.out.println("Inside the show");
        //     }
        // };

        //From above anonymous implementation remove form new keyword till show
        //This makes lamda expression
        A obj = () ->
            {
                System.out.println("Inside the show");
            }
        ;
        obj.show();

        //Using Lambda expressoins does not create a .class file for the inner class 
        //As a result code is lightweight 
    }
}
