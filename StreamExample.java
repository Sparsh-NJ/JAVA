
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8);
        Stream<Integer> s = arr.stream();
        // s.forEach(n->System.out.println(n));
        // s.forEach(a->System.out.println(a)); //This will throw error , we can use one stream only once
        Stream<Integer> s2 = s.filter(n->n%2==0);
        // s2.forEach(n->System.out.println(n));
        Stream<Integer> s3 = s2.map(n->n*n);
        // s3.forEach(n->System.out.println(n));
        int result = s3.reduce(0,(c,e)-> c+e);  //Reduce method given only a single value
        System.out.println(result);

        //reduce(0,(c,e)-> c+e); 
        //0 1 2 3 4 5 6  lets say these are the values which we need to add
        //  c e           Here 0 states that it is the initial value , c + e will be stored now
        //    c e         just like sum= sum + result same follows here


        //Internal Working of .filer() method on stream
        //Filter takes a predicate object which is a functional interface.

        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8);

        // Predicate<Integer> p = new Predicate<Integer>() {
        //     public boolean test(Integer i) {
        //         if(i%2 ==0)
        //             return true;
        //         else 
        //             return false;
        //     }
            
        // };

        //we can use lambda expressions in the above 

        Predicate<Integer> p =  i -> i%2==0;
        Stream<Integer> o = (l.stream().filter(p));
        o.forEach(n->System.out.println(n));




        //Internal working of map function.It takes an object of Function functional interface

        // Function<Integer,Integer> fun = new Function<Integer,Integer>() {

        //     public Integer apply(Integer t) {
        //         return t*2;
        //     }
            
        // };

        //Using lambda expression

         //Internal working of map function.It takes an object of Function functional interface

        Function<Integer,Integer> fun = t ->  t*2;

        Stream<Integer> x = l.stream().map(fun);
        x.forEach(n-> System.out.println(n));

    }
}