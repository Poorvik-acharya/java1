class Outer{
    void display(){
        System.out.println("My Name is Poorvik");
    }
    static class Inner{
        void display(){
            System.out.println("I am CSE student");
        }
    }
}
public class P8 {
    public static void main(String[] args) {
        Outer o1=new Outer();
        o1.display();
        Outer.Inner i1=new Outer.Inner();
        i1.display();
    }
}
