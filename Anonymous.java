
class A{

    A(){
        System.out.println("Object created");
    }

    public void show(){
        System.out.println("inside show");
    }
}
public class Anonymous {
    public static void main(String[] args) {
        // A obj = new A();   //Here obj is just a reference variable in stack new object creation in heap is done by new A(); 

        new A(); // Anonymous object, this creates an object in heap
        //Only problem with anonymous objects is that we can't reuse them as there is no reference 
        //which will point to them

        new A().show();// This will create a new object of class A and call show method, hence old object is not resusable here
    }
}
