/* 
    输出100以内所有质数

*/
public class ForinforExercise3 {
    public static void main(String[] args){
        int primeCount = 0;
        for (int i = 1; i < 1000; i++){
            Boolean     prime = true;
            for (int j = 1; j <= i; j++){
                for (int k = 1; k <= j; k++){
                    if ( (j * k) == i && (j != i)){
                        prime = false;
                    }
                }
            }
            if(prime && (i != 1)){
                System.out.print(i + "\t");
                primeCount++;
            }
        }
        System.out.println("共有" + primeCount + "个质数");
    }
}
