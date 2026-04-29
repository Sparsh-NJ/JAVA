class A{
    public final void show(){
        //Here if my method if final it means it can be overriden at child class
        System.out.println("This is Sparsh method");
    }
}
class B extends A{

    //Will not be able to override parent class method if its final
    // public void show(){

    // }
}
public class FinalMethod {
    public static void main(String[] args) {
        
    }
}
