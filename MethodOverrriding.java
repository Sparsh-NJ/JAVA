class Calculator{

    public int add(int a, int b){
        return a+b;
    }
    public void show(){
        System.out.println("Adding two numbers");
    }
}
class AdvanceCalculator extends Calculator{
    public int mult(int a, int b){
        return a*b;
    }
    //Method Overriding
    public void show(){
        System.out.println("Multiplying two numbers");
    }

}
public class MethodOverrriding {
    public static void main(String[] args) {
         AdvanceCalculator calc = new AdvanceCalculator();
         calc.show();
    }
}
