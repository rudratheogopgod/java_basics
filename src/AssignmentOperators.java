public class AssignmentOperators {
    public static void main(String[] args) {
        int p = 3, q;

        // = Assignment operator
        q = p;
        System.out.println(q); // 3 assignment

        // +=
        System.out.println(q+=q); // 6

        q = 3;

        // -=
        System.out.println(q-=q); // 0

        q = 3;

        // *=
        System.out.println(q*=p); // 9

        q= 3;

        // /=
        System.out.println(q/=p); // 1

        q= 3;

        // %=
        System.out.println(q%=p); // 0
    }
}
