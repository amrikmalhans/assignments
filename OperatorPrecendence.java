public class OperatorPrecendence {
    public static void main(String[] args) {

        // some simple math
        int x = 1 + 2;
        int y = x * 4;

        // some more complex math
        int z = 8;
        int a = z / 2;

        // some more complex math
        int b = 8;
        int c = b / 4;

        // Print out the results
        System.out.println("x is " + x);
        System.out.println("y is " + y);
        System.out.println("z is " + z);
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("c is " + c);
    }
}