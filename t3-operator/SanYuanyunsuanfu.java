/* 
    
    表达式1 和 表达式2 要求是一致的
    凡是可以使用三元运算符的地方，都可以使用if-else
*/
public class SanYuanyunsuanfu {
    public static void main(String[] args){
        //比较两个数大小关系
        int num1 = 14;
        int num2 = 4;
        String maxNum = (num1 > num2) ? "num1大" : ((num1 == num2) ? "一样大" : "num2大");
        //maxNum = (num1 > num2) ? 1.0 : "2";   编译不通过
        System.out.println("比较结果为：" + maxNum);

        //比较三个数大小关系
        int     num3 = 10;
        int     num4 = 8;
        int     num5 = 9;
        String  compareResult = "";
        //一般不这么写
        compareResult = (num3 > num4) ? ((num3 > num5) ? "num3" : "num5") : ((num4 > num5) ? "num4" : "num5" ) ;
        System.out.println("比较结果为：" + compareResult + "大"); 
        int     compareCache1 = 0;
        int     compareCache2 = 0;
        compareCache1 = (num3 > num4) ? num3 : num4;
        compareCache2 = (compareCache1 > num5) ? compareCache1 : num5;
        System.out.println("最大的数为：" + compareCache2); 

    }
}
