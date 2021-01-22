/* 
    打印1-100之间，7的倍数的整数的个数以及他们的和
*/
public class ForExercise4 {
    public static void main(String[] args){
        int numSum = 0;
        int numCounter = 0;
        for(int i = 1;i <= 100;i++){
            if((i % 7) ==0){
                numSum = numSum + i;
                numCounter = numCounter + 1;
            }
        }
        System.out.println(numCounter);
        System.out.println(numSum);
    }
}
