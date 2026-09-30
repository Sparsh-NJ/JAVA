//String buffer is used to create mutable strings in java
public class Buffer {
    public static void main(String[] args) {

       StringBuffer s = new StringBuffer("");
       System.out.println(s.capacity()); //by default 16 capacity

       
       StringBuffer s1 = new StringBuffer("jog");
       System.out.println(s.capacity()); //16 + no. of chars in "jog" = 16 + 3 = 19

       s.append("Sparsh Nandrajog gamer"); 
       
       //Capacity grows automatically when content exceeds current capacity (formula: (oldCapacity * 2) + 2) = 34
       //If s.append("Sparsh") which is less than 16 capacity in that case output = 16
       System.out.println(s.capacity());

       //append can be used to modify the same string object
       s.append(" Nandrajog"); 
       
       // deletes a char at an index
       s.deleteCharAt(2); 

       System.out.println(s);

       //Replace method can be used to replace the old string with new value
       s.replace(0, s.length(), "Gamer");
       System.out.println(s);

       //String builder is same as string buffer for creting mutable strings only difference between them is 
       //StringBuffer is Thread safe and String builder is not 
    }
}
