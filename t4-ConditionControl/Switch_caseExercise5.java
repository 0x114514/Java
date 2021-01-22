/* 
    输入年月日，输出该日期是当年的第几天
*/
import java.util.Scanner;
public class Switch_caseExercise5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input year:");
        int year = scan.nextInt();
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
            case 3:
                if( (((year % 100) != 0) && ((year % 4) == 0)) || ((year % 400) == 0) ){
                    counter = counter + 29;
                }else{
                    counter = counter + 28;
                }
            case 2:counter = counter + 31;
            case 1:counter = counter + day;
        }
        System.out.println(counter);

    }
}
