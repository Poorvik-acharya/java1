public class T1 {
    public static void main(String[] args){
        System.out.println("Even Numbers:");
        for(int i=0;i<20;i++) {
            System.out.print(i*2 + " ");
        }
        System.out.println();
        System.out.println("Odd Numbers:");
        for(int i=0;i<20;i++){
            System.out.print(i*2+1+" ");
        }
        System.out.println();
        System.out.println("Multiples of 3:");
        for(int j=3;j<4;j++){
            for(int i=0;i<20;i++){
                System.out.print(i*j+" ");
            }
        }
        System.out.println();
        System.out.println("Multiples of 4:");
        for(int j=4;j<5;j++){
            for(int i=0;i<20;i++){
                System.out.print(i*j+" ");
            }
        }
        System.out.println();
        System.out.println("Multiples of 5 to 20:");
        for(int j=5;j<21;j++){
            for(int i=0;i<20;i++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }


    }
}

