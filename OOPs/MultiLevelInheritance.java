public class MultiLevelInheritance {
    public static void main(String args[]){
        Dog moti = new Dog();
        moti.eat();
        moti.legs=4;
        System.out.println(moti.legs);

    }
}
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }

}
class Mammal extends Animal{
    int legs;

}
class Dog extends Mammal{
    String breed;
}
 
 

    

