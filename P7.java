interface Resizable{
    void resizeWidth(int width);
    void resizeHieght(int hieght);
}
class rectangle implements Resizable{
     private int width;
     private int hieght;
     public rectangle(int width,int hieght){
         this.width=width;
         this.hieght=hieght;
     }
     public void resizeWidth(int width){
         this.width=width;
     }
     public void resizeHieght(int hieght){
         this.hieght=hieght;
     }
     public void display(){
         System.out.println("Rectangle Width"+width);
         System.out.println("Rectengle Hieght"+hieght);
     }
}
public class P7 {
    public static void main(String[] args) {
        rectangle r1=new rectangle(5,10);
        System.out.println("\n Original size rectangle:");
        r1.display();
        r1.resizeWidth(8);
        r1.resizeHieght(10);
        System.out.println("\n Resized rectengle:");
        r1.display();
    }
}
