/* 
    基本数据类型之间的运算规则
    1.自动类型提升：
        byte short int long float double
        低级向高级做运算，结果为高级类型的
        char是可以做运算的
        特别的 byte short char三种类型做运算，结果为int
        byte + byte不能使用short接收，可以使用int接收
    2.强制类型转换：
        自动类型提升的逆运算
*/
public class TypeConversion{
    public static void main(String[] args){
        byte    typeByte = 2;
        int     typeInt = 4;
        int    sumResult = typeByte + typeInt ;
        System.out.println(sumResult);
        float   sumResult2 = sumResult;
        System.out.println(sumResult2);
        char    typeChar = 'a';
        int     sumResult3 = typeInt + typeChar;
        System.out.println(sumResult3);
        short   typeShort = 10;
        int     typeInt2 = typeShort + typeChar + typeByte;
        System.out.println(typeInt2);

        double  typeDouble = 11.24;
        int     typeInt3 = 0;
        typeInt3 = (int)typeDouble;
        System.out.println(typeInt3);

        int     typeInt4 = 128;
        byte    typeByte2 = (byte)typeInt4;
        System.out.println(typeByte2);
        /* 
          若long型变量结尾不加L，且范围在int内，则会由int自动类型转换为long
                                若范围在int外，则会报错  
        */
        long    typeLong = 128;
        System.out.println(typeLong);
        /* 
            若float型结尾不加F，则会报错
        */
        float   typeFloat = (float)11.24;
        System.out.println(typeFloat);

    }
}