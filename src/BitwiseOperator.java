public class BitwiseOperator {
    public static void main(String[] args) {
        int p = 9, q = 10;

        //Bitwise Operators
        System.out.println(p | q); //11 Bitwise OR
        System.out.println(p & q); //8 Bitwise AND
        System.out.println(p ^ q); //3 Bitwise XOR
        System.out.println(~p); //6 Bitwise Complement
        System.out.println(p<<2); //36 Bitwise Left Shift
        System.out.println(q<<1); //5 Bitwise Right Shift
    }
}
