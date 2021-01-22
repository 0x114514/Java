/* 
    注意
        声明Long型变量，必须以l或L结尾
*/

public class Variable_Byte_Short_int_long {
    public static void main(String[] args){
        byte    variableByte1 = 127;
        short   variableShort1 = 32767;
        int     variableInt1 = 2147483647;
        long    variableLong1 = 2147483648L;
        System.out.println(variableByte1);
        System.out.println(variableShort1);
        System.out.println(variableInt1);
        System.out.println(variableLong1);
        byte    variableByte2 = -128;
        short   variableShort2 = -32768;
        int     variableInt2 = -2147483648;
        long    variableLong2 = -2147483649L;
        System.out.println(variableByte2);
        System.out.println(variableShort2);
        System.out.println(variableInt2);
        System.out.println(variableLong2);
    }
        
}
