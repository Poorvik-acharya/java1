class Outer{
    void display(){
        System.out.println("My Name is Poorvik");
    }
    class Inner{
        void display(){
            System.out.println("I am CSE student");
        }
    }
}
public class T8 {
    public static void main(String[] args) {
        Outer o1=new Outer();
        o1.display();
        Outer.Inner i1=new o1.Inner();
        i1.display();
    }
}
