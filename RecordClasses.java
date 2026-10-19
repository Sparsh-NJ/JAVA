
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
