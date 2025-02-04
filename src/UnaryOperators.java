public class UnaryOperators {
    public static void main(String[] args) {
        int p = 3;

        // +
        System.out.println(+p); // 3

        //-
        System.out.println(-p); // -3

        //++ increment unary operator
        System.out.println(++p); // 4 pre increment
        System.out.println(p++); // 4 post increment
        System.out.println(p); // 5 effect of post increment

        //-- decrement unary operator
        System.out.println(--p); // 4 pre decrement
        System.out.println(p--); // 4 post decrement
        System.out.println(p); // 3 effect of post decrement

        // ! NOT operator
        System.out.println(!(true)); // false
    }
}
