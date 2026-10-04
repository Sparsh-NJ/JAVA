class A {
    // Class A has one method
    public void show1() {
        System.out.println("Inside show of A");
    }
}

class B extends A {
    // Class B inherits from A and adds its own method
    public void show2() {
        System.out.println("Inside the show of B");
    }
}

public class DownCasting {
    public static void main(String[] args) {
        // Upcasting: A reference of type A pointing to an object of type B
        // This is safe because B IS-A A (inheritance)
        A obj = new B(); 
        
        // obj.show2(); // Not allowed here because 'obj' is of type A,
        // and A does not have show2() method in its definition.

        // B obj = (B) new A(); 
        // This is invalid: trying to cast an object of type A into B.
        // Will compile but throw ClassCastException at runtime.

        // Downcasting: converting reference 'obj' (which actually points to B)
        // back into type B. This is safe because obj really refers to a B object.
        B obj2 = (B) obj; 
        
        // Now obj2 is of type B, so it can access both methods:
        obj2.show1(); // Method from class A (inherited by B)
        obj2.show2(); // Method from class B
    }
}
