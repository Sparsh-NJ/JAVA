
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEachMethod {
    public static void main(String[] args) {
        //for each method is a part of List interface.
        
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7);
        // arr.forEach(n -> System.out.println(n)); 
        //for each method takes a Consumer object, Consumer is a functional interface which has method to be overriden as accept.
        
        // Consumer<Integer> consumer = new Consumer<Integer>() {
        //     public void accept(Integer n){
        //         //Here we can define the logic of printing values
        //         System.out.println(n);
        //     }
        // };

        //We can use lambda expression for above 

         Consumer<Integer> consumer = (n) -> System.out.println(n);
         arr.forEach(consumer);
        
    }
}
