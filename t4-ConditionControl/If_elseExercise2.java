/* 
    由键盘输入三个整数存为num1 num2 num3
    使用if else排序并输出
*/
import java.util.Scanner;
public class If_elseExercise2 {
    public static void main(String[] arhs){
        Scanner scan = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("请输入num1：");
        num1 = scan.nextInt();
        System.out.println("请输入num2：");
        num2 = scan.nextInt();
        System.out.println("请输入num3：");
        num3 = scan.nextInt();
        if((num1 == num2) && (num2 == num3)){
            System.out.println("num1、num2、num3一样大");
        }else if(num1 == num2){
            if(num1 > num3){
                System.out.println("num1、num2均为最大");
            }else{
                System.out.println("num3最大");
            }
        }else if(num2 == num3){
            if(num2 > num1){
                System.out.println("num2、num3均为最大");
            }else{
                System.out.println("num1最大");
            }
            
        }else if((num1 > num2) && (num1 > num3)){
            System.out.println("num1最大");
        }else if((num2 > num1) && (num2 > num3)){
            System.out.println("num2最大");
        }else if((num3 > num2) && (num3 > num2)){
            System.out.println("num3最大");
        }
    }
}
