package exceptions;


public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Before call phepChia func.");
        int ret = 0;
        try {
            ret = phepChia(23, 1);
        } catch (Exception e){
            System.out.println("Loi trong ham phepChia");
            ret = -999999;
        }
        System.out.println("Result = " + ret);
        System.out.println("After call phepChia func.");
    }

    private static int phepChia(int a, int b) {
        System.out.println("phepChia func is being run!");
        int c = 0;
        try {
            c = a / b;

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
            throw e;
        }

        try {
            int i = Integer.parseInt("1ba");
        } catch (Exception e){
            System.out.println("Loi parse so nguyen");
            throw e;
        }
        return c;
    }
}
