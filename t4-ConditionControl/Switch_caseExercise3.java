/* 
    根据指定月份，输出季节
*/
import java.util.Scanner;
public class Switch_caseExercise3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input data(month) : ");
        int month = scan.nextInt();
        scan.close();
        switch(month){
            case 3:
            case 4:
            case 5:System.out.println("春季");break;
            case 6:
            case 7:
            case 8:System.out.println("夏季");break;
            case 9:
            case 10:
            case 11:System.out.println("秋季");break;
            case 12:
            case 1:
            case 2:System.out.println("冬季");break;
            default:break;
        }
    }
}
