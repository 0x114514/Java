/* 
    声明两个double型变量，判断第一个数大于10.0，且第二个数小于20.0，则输出两数之和，否则则输出两数之积
*/
public class If_elseExercise4 {
    public static void main(String[] args){
        double  num1 = 11.0;
        double  num2 = 20.0;
        if((num1 > 10.0) && (num2 < 20.0)){
            System.out.println("两数之和为" + (num1 + num2));
        }else{
            System.out.println("两数之积为" + (num1 * num2));
        }
    }
}
