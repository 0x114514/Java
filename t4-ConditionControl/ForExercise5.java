/* 
    输出所有的水仙花数
*/
public class ForExercise5 {
    public static void main(String[] args){
        int numCache1 = 0;
        int numCache2 = 0;
        int numCache3 = 0;
        for(int i = 100;i < 1000;i++){
            numCache1 = i / 100;
            numCache2 = (i % 100) / 10;
            numCache3 = i % 10;
            if(((numCache1 * numCache1 * numCache1) + (numCache2 * numCache2 * numCache2) + (numCache3 * numCache3 * numCache3)) == i){
                System.out.println(i);
            }
        }
    }
}
