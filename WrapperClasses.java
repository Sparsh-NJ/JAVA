//We know in java every class extends Object class but it also has some primitve types
//like int,char, float etc which does not extend Object class
//Therefore for every primitive tyoe we have a corresponding class which extends object class
//which are called wrapper classes

//int - Integer class
//char - Character class
//double - Double class etc

public class WrapperClasses {
    public static void main(String[] args) {
        int num1 = 8;
        //When we pass a primitive type variable to an object it is called as boxing
        // Integer num2 = new Integer(num1); //Boxing
        Integer num3 = num1; //AutoBoxing , because by default like above num1 is passed to object of Integer class and assigned to  num3.
        int num4 = num3; //autounboxing

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
