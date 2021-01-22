/* 
1.Java规范的三种注释方式
单行注释
多行注释
文档注释（Java特有的）

2.单行注释、多行注释的作用
    对所写的程序进行解释说明，增强可读性。
    调试所写的代码
*/
//  单行注释：快捷键 ctrl + /
/*
    快捷键 alt + shift + a
    多
    行
    注
    释
    多行注释不可以嵌套
*/

//文档注释
    /** 
    文档注释
    @author samomi
    @version v1.0
    这是我的第一个Java程序
    */
public class JavaComment {
    //如下的main方法是程序的入口
    /**
     如下的方法是main()，作用：程序的入口
     */
    public static void main(String[] args){
        System.out.println("Java Comment");
    }
}
