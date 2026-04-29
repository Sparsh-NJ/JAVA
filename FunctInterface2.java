
//It is good practice to annote a functional interface

@FunctionalInterface
interface A{
    int add(int a, int b);
}

public class FunctInterface2 {
    public static void main(String[] args) { //Using lamda expression
        // A obj = (int a, int b) ->
        //     {
        //         return a + b;
        //     };

        //in above commented code we have one statement in brackets we can remove brackets
        //Also we can remove return keyword and also datatypes of a  and b from brackets ie 'int'

        A obj = (a,b) -> a+b; //shortest lamda expression
        int result = obj.add(2, 3);
        System.out.println(result);
    }
}