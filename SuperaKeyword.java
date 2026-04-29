class A extends Object {//Every class extends Object class by Default
    
    //By default when we inisitlaize a constructor it has super() method always just not visible, which calls the default constructor of parent class
    A(){
        super();//It will be there even if we dont initialize it
        System.out.println("Inside A default constructor");
    }
    A(int a){
        super();// Hre we can see that A is parent class super() will call what?? 
        //In java every class extends Object class by deafult , we can't see it and constructor of object class is empty
        System.out.println("Inside parametarized A construcotr");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("Inside default constructor of B");
    }
    B(int b){
        super();
        System.out.println("Inside parametarized constructor of B");
    }
}

public class SuperaKeyword {
    public static void main(String[] args) {
        B obj = new B(4);//Even if we call parametarized constrcutor of child class B it will by default call --- default constructor of A class
    }
}
