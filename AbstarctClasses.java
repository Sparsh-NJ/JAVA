//Suppose I don't know how to implement musicSystem method but want child classes to implement that feature as a compulsion
//In that case I can just declare musicSystem class using abstarct keyword
//But to implement abstarct methods class must also be abstarct.
abstract class Car{

    public void drive(){
        System.out.println("Driving..");
    }

    public abstract void musicSystem();
}
//Fortuner class extends Car class which is abstarct in nature , therefore it is compulsory for
//child class to implement abstact methods of an abstact class
class Fortuner extends Car{
    
    public void musicSystem() {
        System.out.println("Music playing");
    }
}
public class AbstarctClasses {
    public static void main(String[] args) {
        Fortuner obj = new Fortuner();
        obj.drive();
        obj.musicSystem();

        // Car a = new Car() //We can't create objects of abstract classes directly
        //as it does not makes sense to create an object of a class which has only declared the methodsand not implemented them
         

        //An abstract class can have all methods as non abstract also.
    }
}
