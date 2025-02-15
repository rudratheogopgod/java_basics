import java.util.Scanner;
public class SumSeriesOddEven {
    public static void main(String[] args) {
        System.out.println("Enter the rage of series you want: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n ; i++){
            if(i%2==0){
                sum -= i;// if even "i" is subtracted
            }else{
                sum += i;// if odd "i" is added
            }
        }
        System.out.println("The sum of series until "+n+" is "+sum);
    }

}
