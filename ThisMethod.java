class A  {
    
    A(){
        super();
        System.out.println("Inside A default constructor");
    }
    A(int a){
        super();
        System.out.println("Inside parametarized A construcotr");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("Inside default constructor of B");
    }
    B(int b){
        this(); //This method calls the constructor of the same class ie class B default constructor
        System.out.println("Inside parametarized constructor of B");
    }
}
public class ThisMethod {
    public static void main(String[] args) {
        B obj = new B(6);
    }

    //this is how we can call both the constructors at the same time of same class
}
