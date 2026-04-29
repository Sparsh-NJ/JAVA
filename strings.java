//String is a class in java
public class strings {
    public static void main(String[] args) {
        String s = new String();// Make a object in heap
        s = "Sparsh";
        System.out.println(s);

        String s1 = "Nandrajog"; //This also works in java behind the scenes it will create an object in heap
       
        //Various methos od String class
        System.out.println( s.charAt(1));

        //String constant pool conecpt:--
        //JVM has heap memory inside heap we have a string constant pool in which string values are stored.

        //Here we are not creating 2 different objects of string
        //What happens is first m1 when initialized checks "Sparsh" in String pool in Heap
        //If it does not exist it will put the value in string pool and object is created
        //For second instance m2 again string "Sparsh" is checked in string pool and if it is present it will simply point m2 to string "Sparsh" in string pool 
        String m1 = "Sparsh";
        String m2 = "Sparsh";

        //m1 and m2 instances are stored in stack which points to heap string pool


        //if i try to update string m1 in that case :-
        m1 = "Sparsh Nandrajog";
        //Here it will create a new object in heap with value "Sparsh Nandrajog" previous value("Sparsh") will still be available in string pool
        //and it will be eligible for garbage collection 

        //Threfore by default Strings are immutable

        //If we want mutable strings then we can use:-
        //1) String buffer
        //2) String Builder
    }
}
