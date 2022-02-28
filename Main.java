public class Main {
    public static void main(String[] args) {
        int x;

        x = 333;
        System.out.println("isOdd(" + x + ") = " + Numeric.isOdd(x));
        System.out.println("isEven(" + x + ") = " + Numeric.isEven(x));
        System.out.println("square(" + x + ") = " + Numeric.square(x));
        System.out.println("cube(" + x + ") = " + Numeric.cube(x));

        x = 4444;
        System.out.println("isOdd(" + x + ") = " + Numeric.isOdd(x));
        System.out.println("isEven(" + x + ") = " + Numeric.isEven(x));
        System.out.println("square(" + x + ") = " + Numeric.square(x));
        System.out.println("cube(" + x + ") = " + Numeric.cube(x));
    }
}