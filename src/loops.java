
public class loops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {//for loop
            System.out.println(i);// 0 to 9
        }

        int i = 0;
        while (i < 10) {//while loop
            System.out.println(i);
            i++;// 0 to 9
        }

        i = 0;
        do {//do while loop
            System.out.println(i);
            i++;
        } while (i < 10);// 0 to 9

        int [] numbers = {1, 2, 3, 4, 5};//For-Each loop
        for (int num : numbers) {
            System.out.println(num);// 1 2 3 4 5
        }

        String [] alphabets = {"E", "D", "C", "B", "A"};//For-Each loop with strings
        for (String num : alphabets) {
            System.out.println(num);// E D C B A
        }

        //Break and Continue
        for(int j = 1; j<= 5; j++){//Breaks the loops even if the condition is true
            System.out.println(j);
            if(j == 3){
                break;// 1 2 3
            }
        }

        for(int j = 1; j<= 5; j++){
            if(j == 3){
                continue;// 1 2 4 5
            }
            System.out.println(j);
        }

    }
}
