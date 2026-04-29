//In enum always define objects first otherwise it will throw an error
//enum classes can have constructors, methods , objects 

enum Laptop{
    Macbook(1000), ThinkPad(800), Vivobook16(900);

    private int price;

    //This sets the currect object price equal to to passed price
    Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
  
}
public class EnumPart2 {
    public static void main(String[] args) {
        Laptop l = Laptop.Macbook;
        System.out.println(l + " " + l.getPrice());

        l.setPrice(2000);
        System.out.println(l + " " + l.getPrice());

        for(Laptop s : Laptop.values()){
            System.out.println(s + " " + s.getPrice());
        }
    }
}
