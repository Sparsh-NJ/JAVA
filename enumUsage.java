//enum specifies that Status is a class of type enum and all the fileds mentioned are objects
enum Status{
  Running, Failed, Stuck
}
public class enumUsage {
    public static void main(String[] args) {
        Status s = Status.Failed;
        // System.out.println(s); //prints failed

        Status arr[] = Status.values();//This will put all the objects inside an array
        for(Status m:arr){
            System.out.println(m + " "+ m.ordinal()); //ordinal will print the indexes
        }
    }
}
