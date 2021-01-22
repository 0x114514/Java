public class calculateSum{
    public static void main(String[] args){
        System.out.println(calculateNumberSum(1,100));
    }
    public static int calculateNumberSum(int startNumber,int endNumber){
        int     sumResult = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            sumResult = sumResult + i;
        }
        return sumResult;
    }
}
