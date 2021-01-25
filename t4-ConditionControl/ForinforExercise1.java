

/* 
    for in for 嵌套循环
    打印图形
    1.
    *
    **
    ***
    ****
    *****

    2.
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *

    3.
        *
       * *
      * * *
     * * * *
    * * * * *
     * * * *
      * * *
       * *
        *
    4.
    **********
    ****  ****
    ***    ***
    **      **
    *        *
    **      **
    ***    ***
    ****  ****
    **********
    5.
         *****         *****
       *********     *********
     ************* *************
    *****************************
    *****************************
    *****************************
     ***************************
       ***********************
         *******************
           ***************
             ***********
               *******
                 ***
                  *

*/
public class ForinforExercise1 {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        for (int i = 1; i <= 5; i++){
            for (int j = 1;j <= 5 - i; j++){
                System.out.print(" ");
            }
            for (int k = 1;k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++){
            for (int j = 1;j <= i; j++){
                System.out.print(" ");
            }
            for (int k = 1;k <= 5 - i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        for (int i = 1; i <= 5; i++){
            for(int j = 0; j <= 5 - i; j++){
                System.out.print("*");
            }
            for(int k = 1; k <= 2 * (i - 1); k++){
                System.out.print(" ");
            }
            for(int l = 0; l <= 5 - i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            for(int k = 1; k <= 6 - 2 * (i - 1); k++){
                System.out.print(" ");
            }
            for(int l = 0; l <= i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 5 - 2 * (i - 1); j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 5 + 4 * (i - 1); j++){
                System.out.print("*");
            }
            for (int k = 1; k <= 9 - 4 * (i - 1); k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 5 + 4 * (i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 29; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 7; i++){
            for (int j = 1; j <= 1 + 2 * (i - 1); j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 13 - 2 * (i - 1); j++){
                System.out.print("*");
            }
            System.out.print("*");
            for (int j = 1; j <= 13 - 2 * (i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 14; i++){
            System.out.print(" ");
        }
        System.out.print("*");
    }
}
