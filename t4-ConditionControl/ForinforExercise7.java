/* 
    找到1000以内的完数
*/
public class ForinforExercise7 {
    public  static  void    main(String[] args){
        long    startTime = System.currentTimeMillis();
        long    endTime = System.currentTimeMillis();;
        int     numSum = 0;
        for (int i = 2; i <= 100000000; i++){
            numSum = 0;
            for (int j = 1; j < i; j++){
                if ( i % j == 0){
                    numSum = numSum + j ;
                }
            }
            if (numSum == i){
                System.out.println(i);
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("程序花费时间：" + (endTime - startTime) + "ms");
    }    
}
