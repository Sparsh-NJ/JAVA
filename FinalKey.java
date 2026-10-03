//If we make parent class as final in that case we can't extend that class
//inheritance will not be possible

//If we make a method as final then we cannot do method overriding as well.

class A{
    final void show(){
        System.out.println("Showing A");
    }
}

// class B extends A {
//      void show(){
        
//      }
// }

public class FinalKey {
    public static void main(String[] args) {
        final int a = 9;//final is used to make value constant
        // a = 8; -> //can't assign anything to 'a' , if it is already final
        System.out.println(a);
    }
}
