/* 
    使用switch case 实现
        输入2021年月份、日期，输出这是2021年第几天
    月份倒序，不加break，实现天数叠加
*/
import java.util.Scanner;
public class Switch_caseExercise4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input month:");
        int month = scan.nextInt();
        System.out.println("Please input day");
        int day = scan.nextInt();
        scan.close();
        int counter = 0;
        switch(month){
            case 12:counter = counter + 30;
            case 11:counter = counter + 31;
            case 10:counter = counter + 30;
            case 9:counter = counter + 31;
            case 8:counter = counter + 31;
            case 7:counter = counter + 30;
            case 6:counter = counter + 31;
            case 5:counter = counter + 30;
            case 4:counter = counter + 31;
            case 3:counter = counter + 28;
            case 2:counter = counter + 31;
            case 1:counter = counter + day;
        }
        System.out.println(counter);

    }
}
