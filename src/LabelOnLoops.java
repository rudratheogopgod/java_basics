public class LabelOnLoops {
    public static void main(String[] args) {
        myLoop: for(int i = 1; i<=5; i++){
            if (i == 2){
                break myLoop;
            }
            System.out.println(i);
        }
    }
}
