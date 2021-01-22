/* 
    具体如何从键盘获取不同类型的变量：需要使用Scanner类
        1.导包
            import java.util.Scanner;
        2.实例化
            Scanner scan = new Scanner(System.in);
        3.调用Scanner类的相关方法来获取指定类型的变量
            scan.nextInt()
*/

import java.util.Scanner;

public class ScannerGetData {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int     achievement = scan.nextInt();
        if(achievement == 100){
            System.out.println("奖励一个宝马");
        }else if(achievement >= 80){
            System.out.println("奖励一个iphone");
        }else if(achievement >= 60){
            System.out.println("奖励一个ipad");
        }else{
            System.out.println("奖励一个锤子");
        }
        //System.out.println(achievement);
    }
}
