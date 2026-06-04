class A{
    void great(){
        System.out.println("Hi from A");
    }
}

class B extends  A{
    void great(){
        System.out.println("Hi from B");
    }
}

public class Poly2 {
 public static void main(String[] args) {
    B b =new B();
    b.great();
 }   
}
