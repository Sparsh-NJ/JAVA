import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7);
        int result = l.parallelStream().filter(n->n%2==0).mapToInt(n->n).sum(); //maptoInt method is better than reduce as it has inbuilt sum and other methods 
        System.out.println(result);

        //parallel stream are more faster than stream. stream works on single object at a time while parallelstream can work on multiple objects
        
    }
}
