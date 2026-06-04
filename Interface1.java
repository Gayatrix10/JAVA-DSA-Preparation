interface A {

    void pay();

    default void display() {
        System.out.println("hii from A....");
    }
}

interface B {

    void pay();

    default void display() {
        System.out.println("hii from B....");
    }
}

class Upi implements A, B {

    public void pay() {
        System.out.println("Payment done via UPI");
    }

    public void display() {

        System.out.println("hi from UPI...");

        A.super.display();
        B.super.display();
    }
}

public class Interface1 {

    public static void main(String[] args) {

        Upi user = new Upi();

        user.pay();
        user.display();
    }
}