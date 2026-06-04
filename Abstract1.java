abstract class Animal
{
    int legs;
    String color;
    String diet;


    void eat(){
        System.out.println("Eating time....");
    }
    
    void sleep(){
        System.out.println("Sleeping time....");
    }

    abstract void speak();


}

class Rabbit extends Animal{
        void speak()
        {
            System.out.println("Rabbit is speaking....");
        }

        void jump(){
            System.out.println("Rabbit is Jumping....");
        }
}

public class Abstract1 {
    public static void main(String[] args) {
        Rabbit rb =new Rabbit();
            rb.eat();
            rb.color="Black n White";
            System.out.println(rb.color);
        };
    }