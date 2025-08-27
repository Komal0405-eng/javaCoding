public class HierarchialInheritance {
    public static void main(String args[]){
        Mammal cat = new Mammal();
        cat.eat();
        cat.walk();

        Fish tuna = new Fish();
        tuna.eat();
        tuna.swim();

        Bird eagle = new Bird();
        eagle.eat();
        eagle.fly();


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
    void walk(){
        System.out.println("walks");
    } 
     }
    class Fish extends Animal{
        void swim(){
            System.out.println("swims");
        } 
     }
        class Bird extends Animal{
            void fly(){
                System.out.println("flies");
            }
            
         }


