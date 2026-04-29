interface A{
    void show();
    void config();
}
interface B{
    void sum();
}
interface C extends B{
    void cMethod();
}

//Here we are implementing only C but C extends B interface therefore we need to 
//Define methods of both interfaces
//also method of A interface

public class InterfacePar2 implements C,A {

    public void sum(){
        System.out.println("Sum");
    }
    public void cMethod(){
        System.out.println("C method");
    }
    public void show() {
        System.out.println("Inside show of A");
    }
    public void config() {
        System.out.println("Inside config of A");
    }

    public static void main(String[] args) {
        C obj;
        obj = new InterfacePar2();
        obj.sum();
        obj.cMethod();
        
        A obj2 = new InterfacePar2();
        obj2.config();
        obj2.show();
    }
    
}
