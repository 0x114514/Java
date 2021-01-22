/* 
    从键盘读入不确定个数的整数，统计正负数的个数，输入0为结束
*/
import java.util.Scanner;
public class WhileExercise1 {
    public static void main(String[] atgs){
        Scanner scan = new Scanner(System.in);
        int positivCounter = 0;
        int negativeCounter = 0;
        int numCache = 0;
        System.out.println("请输入数据(输入0为结束)：");
        while((numCache = scan.nextInt()) != 0){
            if(numCache > 0){
                positivCounter ++;
            }else{
                negativeCounter ++;
            }
            System.out.println("请输入数据(输入0为结束)：");
        }
        scan.close();
        System.out.println("正数的个数为：" + positivCounter);
        System.out.println("负数的个数为：" + negativeCounter);
        
    }
}
