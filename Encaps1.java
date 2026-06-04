class Student {
    private String name;
    private int age;
    private String course;
    private int roll;

    String getname()
    {
            return this.name;
    }

    void setname(String n)
    {
        this.name=n;
    }


    void eat()
    {
        System.out.println("Eating...");
    }
    void study(){
        System.out.println("Studying...");
    }
    
}

public class Encaps1 {
    public static void main(String[] args) {
        Student s= new Student(); // Object Creation
       //s.setname=("Gayatri");
        //System.out.println(s.name);
        s.eat();
    }
}
