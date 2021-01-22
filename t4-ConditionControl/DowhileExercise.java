/* 
    Do-while循环
    输出0-100所有偶数，以及它们的和、个数
*/
public class DowhileExercise {
    public static void main(String[] args){
        int i = 0;
        int sum = 0;
        int numCounter = 0;
        do{
            if((i % 2) == 0){
                System.out.println(i);
                sum = sum + i;
                numCounter = numCounter + 1;
            }
            i++;
        }while(i <= 100);
        System.out.println("偶数的和为：" + sum);
        System.out.println("偶数的个数为：" + numCounter);

    }
}
