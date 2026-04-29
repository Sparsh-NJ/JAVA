class calculator{
    public int add(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
}
public class oops2 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 4;
        calculator cal = new calculator();
        System.out.println(cal.add(num1, num2));
    }
}
