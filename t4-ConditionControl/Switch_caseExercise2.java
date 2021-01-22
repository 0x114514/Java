/* 
    输入学生成绩，大于等于60分合格，小于60分不合格
*/
import java.util.Scanner;
public class Switch_caseExercise2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input your archievement(int) : ");
        int achievement = scan.nextInt();
        scan.close();
        switch(achievement / 60){
            case 0:System.out.println("不及格");break;
            case 1:System.out.println("及格");break;
        }
    }
}
