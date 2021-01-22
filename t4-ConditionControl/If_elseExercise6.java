/* 
    程序随机产生一个两位数，
        用户输入
            完全匹配                   10000
            数字匹配，顺序错误          5000
            一位数字匹配，位置正确      3000
            一位数字匹配，位置错误      1000
            其他                      作废
*/
import java.util.Scanner;
public class If_elseExercise6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int randomNumber = (int)(Math.random() * 90 + 10);

        //System.out.println("Random number is: " + randomNumber);

        System.out.print("Please input your number:");
        int userNumber = scan.nextInt();
        scan.close();
        System.out.println("Random number is: " + randomNumber);
        System.out.println("Your number is: " + userNumber);
        
        int randomNumberCache1 = randomNumber % 10;
        int randomNumberCache2 = randomNumber / 10;
        int userNumberCache1 = userNumber % 10;
        int userNumberCache2 = userNumber /10;

        if(userNumber == randomNumber){
            System.out.println("10000$");
        }else if((userNumberCache1 == randomNumberCache2) && (userNumberCache2 == randomNumberCache1)){
            System.out.println("5000$");
        }else if((userNumberCache1 == randomNumberCache1) || (userNumberCache2 == randomNumberCache2)){
            System.out.println("3000$");
        }else if((userNumberCache1 == randomNumberCache2) || (userNumberCache2 == randomNumberCache1)){
            System.out.println("1000$");
        }else{
            System.out.println("none");
        }
        
    }
}
