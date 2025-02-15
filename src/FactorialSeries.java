import java.util.Scanner;

public class FactorialSeries {
    public static void main(String[] args) {
        System.out.println("Enter the the rage of the Series: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        System.out.println("The required series is:");
        for(int i = 1; i<=n; i++){
            fact *= i ;
            System.out.print(" "+i+"->"+fact+" ");
        }
    }
}
