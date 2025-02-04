public class LogicalOperators {
    public static void main(String[] args) {
        int p = 4, q = 2;
        // && AND operator
        System.out.println(p==q && q<=p); // false

        // || OR operator
        System.out.println(p==q || q<=p); // true

        // ! NOT operator
        System.out.println(!(p==q)); // true
    }
}
