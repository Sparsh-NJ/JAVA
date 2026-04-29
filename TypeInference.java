public class TypeInference {

    // var x = 9; var cannot be used at instance level , it is only used as local varible
    public static void main(String[] args) {
        //Using TypeInference we can declare variables using var keyword do not need to specify type expilicityly
        //came in java 10
        //Only applicable for local variables
        var a = 10; //type is decided at the compile time only
        System.out.println(a);

        var s = "Sparsh";
        System.out.println(s);

        // var b;//This will cause an error as it is compulsory to initialize the varible if we use var keyword , because compiler will not know how
        //and what type to assign to b
    }
}
