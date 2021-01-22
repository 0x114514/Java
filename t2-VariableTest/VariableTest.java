/* 
    变量的使用
    Java定义变量的格式
        数据类型 变量名 = 变量值;
    变量必须先声明、赋值，后使用
    变量在其作用域内是有效的
    同一个作用域内，不可以声明两个同名变量
*/
public class VariableTest {
    private static PrintService PS = new PrintService();
    public static void main(String[] args){

        // 变量的定义
        int myAge = 12;

        // 变量的使用
        System.out.println("myAge = " + myAge);
        int myNumber;
        myNumber = 1001;
        System.out.println("myNumber = " + myNumber);
        PS.printClass();
        
        //System.out.println(myClass);
    }
    public static void method1(){
        
    }
    public static void mrthod2(){
        
    }
}

class PrintService{
    public void printClass(){
        //变量出了作用域会失效
        int myClass = 1;
        System.out.println("myClass = " + myClass);
    }
}

