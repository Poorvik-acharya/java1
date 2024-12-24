class DivByZeroErrorException extends Exception{
    public DivByZeroErrorException(String message){
        super(message);
    }
}
public class T9 {
    public static void main(String[] args) {
        int nr = 10;
        int dr = 0;
        try {
            if (dr == 0) {
                throw new
                        DivByZeroException("Div by zero error not allowed");
            }
            int remainder = 10 % 0;
            System.out.println("result of modulus" + remainder);
            int result = nr / dr;
            System.out.println("result of division" + result);
        }
        catch (DivByZeroException e) {
            System.out.println("Error" + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("error division allowed");
        }
        finally {
            System.out.println("Block is Ecxecuted");
        }
    }
}
