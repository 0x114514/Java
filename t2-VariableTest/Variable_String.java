/* 
    1. String属于引用数据类型
    2. 声明String变量时，使用一对""
    3. String可以为空
    4. String可以和8种数据类型做运算
*/

public class Variable_String {
    public static void main(String[] args){
        String  str = "abcd";
        System.out.println(str);
        str = str + "100";
        System.out.println(str);
        str = str + 100;
        System.out.println(str);
        String  emptyStr = "";
        System.out.println(emptyStr);
        char emptyChar = ' ';//字符不能为空
        System.out.println(emptyChar);
        Boolean typeBool = true;
        str = str + typeBool;
        System.out.println(str);
    }
}
