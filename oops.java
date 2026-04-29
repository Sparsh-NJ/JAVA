public class oops {
//making method add as static is mandatory to let the class oops know that it can directly be used by this class no need to make an object of oops class then call add.
//If I will not use static keyword then I must make an objet of class oops and then call add like oop.add();
     public static int add(){
            System.out.println("inside add method");
            return 0;
        }
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int result = add();
        System.out.println(result);

    }
}
