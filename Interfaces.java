//just like abstract classes , interfaces have all methods as public abstract by deafult
//It is mandatory to implemnt all methods inside an interface 
interface A{

    String name = "Sparsh"; //By default variables inside an interface are final and static
    void show();
    void config();
}

//Mandatory for B to implement interface methods
class B implements A{
    public void show(){
        System.out.println("Inside show");
    }
    public void config(){
        System.out.println("Inside config");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        A obj; // we can create an object of an interface but cannot use new A(); to instantiate it
        obj = new B();
        obj.show();
        obj.config();
        String n = obj.name;//one way to call name , by object 
        //As varaible are final and static inside an interface I can directly use those varibles using interface name
        n = A.name;
        // A.name = "Nandrajog"; // by default A.name is final we cnnot assign new value
        System.out.println(n);
    }

    //Also we know mulitple inheritance is not allowed in java 
    //We can have multiple inheritance using interfaces as one class can implement more than one interface at the same time
    
}
