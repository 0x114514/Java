public class Variable_Char{
    public static void main(String[] args){
        // 定义char类型的变量，通常使用单引号，内部只能写一个字符（可以是中文）
        char variableChar = 'a';
        //  转义字符
        char variableChar1 = '\n';
        //Unicode字符集
        char variableChar2 = '\u1234';
        System.out.println(variableChar);
        System.out.print(variableChar1);
        System.out.println(variableChar2);
        
        //布尔型 boolean，只能取两个值
        boolean variableBoolean = true;
        System.out.println( ! variableBoolean);
    }

}