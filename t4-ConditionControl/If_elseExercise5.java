/* 
    编写程序，计算狗的年龄
        5岁的狗相当于10.5 + 10.5 + 4 + 4 + 4
*/
import java.util.Scanner;
public class If_elseExercise5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double calculationData1 = 10.5;
        double calculationData2 = 4.0;
        System.out.print("Please input the age of your dog:");
        int ageOfDog = scan.nextInt();
        scan.close();
        if(ageOfDog < 0 ){
            System.out.println("您输入的数据有误");
        }else if(ageOfDog <= 2 ){
            System.out.println("the age of dog is:" + (ageOfDog * calculationData1));
        }else{
            System.out.println("the age of dog is:" + ( (2 * calculationData1) + ((ageOfDog - 2) * calculationData2) ) );
        }
    }
}
