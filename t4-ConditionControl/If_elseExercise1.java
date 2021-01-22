import java.util.Scanner;
public class If_elseExercise1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int     achievement = 0;
        System.out.println("请输入成绩：");
        achievement = scan.nextInt();
        scan.close();
        if(achievement == 100){
            System.out.println("奖励一个宝马");
        }else if(achievement >= 80){
            System.out.println("奖励一个iphone");
        }else if(achievement >= 60){
            System.out.println("奖励一个ipad");
        }else{
            System.out.println("奖励一个锤子");
        }
    }
}
