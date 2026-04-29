final class A{
    void show(){
        System.out.println("Showing A");
    }
}

//If we make parent class as final in that case we cant extend that class
//inheritance will not be possible
// class B extends A {

// }


public class FinalKey {
    public static void main(String[] args) {
        final int a = 9;//final is used to make value constant
        // a = 8;//can't assign anything to a if it is already final
        System.out.println(a);
    }
}
