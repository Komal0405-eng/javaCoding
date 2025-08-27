public class Interface1 {
    public static void main(String args[]){
        Bear b = new Bear();
        System.out.println("Bear is both Carnivore and Herbivore");

    }
}
interface Herbivore {

}
interface Carnivore {

}
class Bear implements Herbivore , Carnivore {
    
}