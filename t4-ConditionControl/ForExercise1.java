/* 
    遍历1-150，三的倍数输出333 5的倍数输出555 7的倍数输出777
*/
public class ForExercise1 {
    public  static  void    main(String[] args){
        for(int i =1 ; i <= 150 ; i++){
            System.out.print(i + "\t");
            if((i % 3) == 0){
                System.out.print("333\t");
            }
            if((i % 5) == 0){
                System.out.print("555\t");
            }
            if((i % 7) == 0){
                System.out.print("777\t");
            }
            System.out.println();
        }
    }
}
