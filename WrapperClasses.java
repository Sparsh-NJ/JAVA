//We know in java every class extends Object class but it also has some primitive types
//like int,char, float etc which do not extend Object class
//Therefore for every primitive type we have a corresponding class which extends object class
//which are called Wrapper classes

//int - Integer class
//char - Character class
//double - Double class etc

public class WrapperClasses {
    public static void main(String[] args) {
        int num1 = 8;

        //When we pass a primitive type variable to an object it is called as boxing
        // Integer num2 = new Integer(num1); //Boxing
        Integer num3 = num1; //AutoBoxing , because by default like above num1 is passed to object of Integer class and assigned to  num3.

        //We can use num3.intValue() method to convert an object to a primitive int value
        // int num4 = num3.intValue(); //Unboxing
        int num4 = num3; //Auto unboxing, because by default intValue() is called in the backend

        System.out.println(num3);
        System.out.println(num4);

        //Autoboxing:- primitive value is assigned to a WrapperClass
        //AutoUnboxing:- Wrapperclass object is assigned to the primitive type

        //Benefit of wrapper classes:-
        String s = "12";
        int n = Integer.parseInt(s);//This method of Integer wrapper class will extract integer value from a string
        System.out.println(n);
    }
}
