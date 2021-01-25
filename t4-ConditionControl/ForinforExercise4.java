/* 
    质数问题优化
*/
public class ForinforExercise4 {
    public static void main(String[] args){
        //int         calculateTime = 0;//统计计算次数
        long    startTime = System.currentTimeMillis();//获取1970-01-01 00：00据当前的ms数
        int     primeCount = 0;
        for (int i = 2; i <100000; i++){
            Boolean     prime = true;
            //for (int j = 2; j < i; j++){
            for (int j = 2; j <= Math.sqrt(i); j++){//优化2
                //++calculateTime;
                if((i % j) == 0){
                    prime = false;
                    break;  //优化1
                }
            }
            if(prime){
                //System.out.println(i);
                primeCount++;
            }
        }
        long    endTime = System.currentTimeMillis();

        //System.out.println("计算次数为" + calculateTime);

        System.out.println("质数个数为" + primeCount);
        System.out.println("计算时间为" + (endTime - startTime) + "ms");
    }
    
}
