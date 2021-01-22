/* 
    输入两个整数num1 num2
        求其最大公约数  最小公倍数
*/
import  java.util.Scanner;
public class ForExercise2 {
    public  static  void    main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input num1:");
        int num1 = scan.nextInt();
        System.out.print("Please input num2:");
        int num2 = scan.nextInt();
        scan.close();
        for (int i = ((num1 <= num2) ? num1 : num2);i > 0;i--){
            if( ((num1 % i ) == 0) && ((num2 % i ) == 0) ){
                if(i != 1){//防止最大公约数是1
                    System.out.println("最大公约数是：" + i);
                    break;
                    //可以使用break跳出循环
                }else{
                    System.out.println("没有找到最大公约数！");
                }
                
                
            }
        }
        for (long i = (long)((num1 >= num2) ? num1 : num2);;i++){
            if( ((i % num1) == 0) && ((i % num2) == 0) ){
                System.out.println("最小公倍数是：" + i);
                break;
            }
        }
    }
}
