/* 
    质数问题优化
*/
public class ForinforExercise5 {
    public static void main(String[] args){
        //int         calculateTime = 0;//统计计算次数
        long    startTime = System.currentTimeMillis();//获取1970-01-01 00：00据当前的ms数
        int     primeCount = 0;
        lable:for (int i = 2; i <100000; i++){
            for (int j = 2; j <= Math.sqrt(i); j++){//优化2
                //++calculateTime;
                if((i % j) == 0){
                    continue lable;  //优化3
                }
            }
                primeCount++;
        }
        long    endTime = System.currentTimeMillis();

        //System.out.println("计算次数为" + calculateTime);

        System.out.println("质数个数为" + primeCount);
        System.out.println("计算时间为" + (endTime - startTime) + "ms");
    }
    
}
