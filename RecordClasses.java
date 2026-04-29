// 1. Purpose of equals()
// The equals() method determines if two objects are logically equivalent. 
// Codefinity
// Codefinity
//  +1
// Logical Equality: By default, the Object class implementation uses the == operator, which only checks if two references point to the same memory location.
// Value Comparison: Developers override equals() to compare actual data (like a student's ID or name) rather than memory addresses. 

// 2. Purpose of hashCode()
// The hashCode() method returns an integer representation of an object, acting as a "digest" or unique identifier for efficiency. 
// Medium
// Medium

// Bucketing: Hash-based collections use this integer to determine a "bucket" (index) in an internal array where the object should be stored.
// Performance: It allows collections to narrow down a search from thousands of items to just a few in a specific bucket, providing near O(1) performance for lookups. 

// 3. The equals and hashCode Contract
// Java enforces a strict contract between these two methods to ensure collections work correctly: 
// Codefinity
// Codefinity

// Same Objects, Same Hash: If a.equals(b) is true, then a.hashCode() must equal b.hashCode().
// Different Objects, Any Hash: If a.equals(b) is false, their hash codes do not have to be different (this is called a "collision"), but having distinct codes improves performance.
// Consistency: If an object’s state hasn't changed, multiple calls to hashCode() or equals() must return the same result. 


// class Student{

//     private String name;
//     private int age;

//     Student(String name, int age){
//         this.name = name;
//         this.age = age;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public int getAge() {
//         return age;
//     }
//     public void setAge(int age) {
//         this.age = age;
//     }
//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         result = prime * result + age;
//         return result;
//     }
//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Student other = (Student) obj;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         if (age != other.age)
//             return false;
//         return true;
//     }
//     @Override
//     public String toString() {
//         return "Student [name=" + name + ", age=" + age + "]";
//     } 

// }

//Instead of above class we can simply use a record class which has toString(), Hashcode() and Equals() method already implemented
//Also it has a constructor implemented in it
//By default the variables inside the record class are final
//A record class cannot inherit another class but we can implement an interface 

record Student(String name,int age){ }

public class RecordClasses {
    public static void main(String[] args) {
        Student s1 = new Student("Sparsh", 26);
        Student s2 = new Student("Sparsh", 26);

        if(s1.equals(s2)) System.out.println("True");
        else System.out.println("False");

        System.out.println(s1);
        //This will print false, as equals() compare the values associated with it but for proper behavior we must overrride the 
        //equals() and hashcode() method

        //This method is way more tedious and lines of codes are exceeding unecessarily. We can use Record classes for that which defines
        //a class is treated as a record.



        
    }
}
