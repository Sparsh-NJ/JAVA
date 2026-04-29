//Parent class
class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    
    public int sub(int a, int b){
        return a-b;
    }
}
//Suppose parent.java file is deleted inheritance can still be implemented if we have .class file for the same
//Child class
class AdvacneCalculator extends Calculator{
    
    public int mult(int a, int b){
        return a*b;
    }
    
    public int div(int a, int b){
        return a/b;
    }
    //This method is common in both parent and child , always the method closest to obj will be called, here it is child class 
     public int sub(int a, int b){
        return a*b;
    }

}

public class Inheritance {
    public static void main(String[] args) {
        AdvacneCalculator calc = new AdvacneCalculator();
        int r1 = calc.add(4, 7);
        int r2 = calc.sub(7, 4);
        int r3 = calc.mult(4, 7);
        int r4 = calc.div(4, 7);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " ");
        
    }


    //In java multi inheritance does not work ie: one child class cannot inherit 2 parent classes at the same time
    //This is because if both parent has same method lets say y(), in that case child will be confused which y() to call.
    //Therefore multiple inheritance is not supported in java
    //to solve this problem we have interfaces
}
