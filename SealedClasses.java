//Suppose we have one parent class A and 3 other classes B, C , D. If I want only B and C to inherit A and if D tries to inherit A it should
//Throw  a compiler error, We can do so by using Sealed keyword

//If parent is of type saeled in that case child classes must be of any one type from:-
//1)Sealed . 2)non_sealed , 3)final

sealed class A permits B,C{

}
non-sealed class B extends A{

}
final class C extends A{

}
//If I want D to extend B in that case we must make D as seald, final or non sealed.
//Non sealed can be used with parent class if any class can extend it.
//We can make B as non Sealed suchthat D can extend it
class D extends B{

}

public class SealedClasses {
    public static void main(String[] args) {
        //we can use sealed with interfaces as well, we know interface can never be final. Therefore we must use , 
        //sealed - non sealed with interfaces 
    }
}
