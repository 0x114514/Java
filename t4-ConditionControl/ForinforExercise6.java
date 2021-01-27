/* 
    输出100以内所有质数

*/
public class ForinforExercise6 {
    public static void main(String[] args){
        int primeCount = 0;
        long    startTime = System.currentTimeMillis();//获取1970-01-01 00：00据当前的ms数
        for (int i = 1; i < 100000; i++){
            Boolean     prime = true;
            //outLable:for (int j = 1; j <= i; j++){
            outLable:for (int j = 1; j <= i; j++){
                for (int k = 1; k <= Math.sqrt(i) ; k++){
                    if ( (j * k) == i && (j != i) ){
                        prime = false;
                        break outLable;
                    }
                }
            }
            if(prime && (i != 1)){
                System.out.print(i + "\t");
                primeCount++;
            }
        }
        long    endTime = System.currentTimeMillis();
        System.out.println("共有" + primeCount + "个质数");
        System.out.println("程序花费" + (endTime - startTime) + "ms");
    }
}
