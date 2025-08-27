public class ConstructorTypes {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Harshal");
        Student s3 = new Student(457);
    }
    
}
class Student {
    String name;
    int roll;

    Student(){
        System.out.println("Constructor is called");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}
