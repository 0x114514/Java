/* 
    打印1-100内，所有奇数的和
*/
public class ForExercise3 {
    public static void main(String[] args){
        int numSum = 0;
        for(int i = 1;i <= 100;i++){
            if((i % 2) !=0){
                numSum = numSum + i;
            }
        }
        System.out.println(numSum);
    }
}
