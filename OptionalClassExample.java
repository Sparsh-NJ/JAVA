//java 8 feature
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassExample {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Sparsh","Laxmi","Gamer");
        // String s = l.stream().filter(n->n.contains("x")).findFirst(); //Here findFirst will give a string of type optional class
        //OPtional calss ensure that string returned does not give a null pointer exception

        Optional<String> s = l.stream().filter(n->n.contains("x")).findFirst();
        System.out.println(s.orElse("Not found"));  //we have an orelse method in optional class which gives value if found else we can print our custom message
        
        
    }
}
