interface C{
    public void config();
}

interface A{
    public void show();
    public void sing();
}

interface B extends A{
      public void dance();
}

public class Testing implements B,C {

    @Override
    public void show() {
       System.out.println("In A show");
    }

    @Override
    public void sing() {
          System.out.println("In A singing");
    }

    @Override
    public void config() {
         System.out.println("In C config");
    }

    @Override
    public void dance() {
         System.out.println("In B dance");
    }
    
        public static void main(String[] args) {
            C obj = new Testing();
            obj.config();
    }
}
