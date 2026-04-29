//java code --> javac(compiler) --> Byte code(runnable everywhere) --> JVM accepts it and execute it
//JDK has JRE and JRE has JVM to run the java code. If I develop a java application the client must have the JRE-JVM to run the application, JDK not needed.
class Basics{
    public static void main(String args[])
    {
        System.out.println("Hello World");
        System.out.println(3 + 5);
        System.out.println(3 + 9);

        // float marks = 6.5; // This gives error in java as by default it accepts a double value not float.
        float marks = 6.5f; // This specifies that double bydefault is float now.
        System.out.println(marks);

        //Casting
        byte b = 127;
        int a = 12;
        b = (byte)a;
        System.out.println(b);

        //Implicit Conversion
        //a = b , int can take byte datatype



        
    }
}