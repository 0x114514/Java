/* 
    使用switch-case将小写字母转换成大写，只转换abcde，其他输出other
*/
import java.util.Scanner;
public class Switch_caseExercise1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input data(letter)");
        String  inputData = scan.next();
        scan.close();
        char    inputLetter = inputData.charAt(0);
        switch(inputLetter){
            case 'a':System.out.println("A");break;
            case 'b':System.out.println("B");break;
            case 'c':System.out.println("C");break;
            case 'd':System.out.println("D");break;
            case 'e':System.out.println("E");break;
            default :System.out.println("others");break;
        }
        
    }
}
