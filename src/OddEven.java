import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter Your Number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a%2 == 0){ //If condition
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

    }
}
