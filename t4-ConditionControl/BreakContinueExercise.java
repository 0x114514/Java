/* 
    break和continue关键字的使用
                适用范围               作用             相同点
    break:       switch-case           
                 循环               结束当前循环       关键字后面不能有执行语句

    continue:    循环               结束当次循环
*/
public class BreakContinueExercise {
    public  static  void    main(String[] args){
        for (int i = 1; i <= 10; i++){
            if (i % 4 == 0){
                break;
            }
            System.out.println(i);
        }
        System.out.println("---------------");
        for (int i = 1; i <= 10; i++){
            if (i % 4 == 0){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("---------------");
        lable:for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 10; j++){
                if (j % 4 == 0){
                    //break默认会跳出最近的循环
                    break lable;  
                    //continue lable;//结束指定标识的循环
                }
                System.out.println(j);
            }
        }
    }
}
