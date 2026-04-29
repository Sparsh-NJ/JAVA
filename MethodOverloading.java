class calculator{
    //Here we are having 2 methods with same name only paramaters are different.
    //This is called as method overloading

    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public double add(double n1,int n2){
        return n1 + n2;
    }

    //Below method will not work as no. of parameters must be different in case of method overloading, even if return type is diff
    // public double add(int n1, int n2){

    // }

}
public class MethodOverloading {
   public static void main(String[] args) {
    int num1 = 2;
    int num2 = 3;
    double num3 = 4.6;

    calculator calc = new calculator();
    double result = calc.add(num3,num2);
    System.out.println(result);
   } 
}
