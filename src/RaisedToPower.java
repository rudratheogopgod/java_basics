import java.util.Scanner;

public class RaisedToPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base: ");
        int base = sc.nextInt();
        int original = base;
        System.out.println("Enter power: ");
        int pow = sc.nextInt();
        for(int i = 2; i<=pow; i++){
            base *= original;//multiplies the base to original base pow number of times
        }
        System.out.println(original+"^"+pow+" = "+base);

    }
}
