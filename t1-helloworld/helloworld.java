public class helloworld{
	public static void main(String[] args){
	
		// 换行打印println
		System.out.println("Hello,World");
		// 不换行打印print
		System.out.print("Hello,print");
		System.out.print("Hello,print");
	}
}

/* 
	对第一个java程序进行总结
	1.java的 编写 - 编译 - 运行的过程
	编写：将编写的java代码保存在以".java"结尾的源文件中
	编译：javac.exe可以将源文件编译成字节码文件(".class")
	运行：java.exe命令解释运行字节码文件。
*/
/* 
	一个源文件内可以存在多个class,但是只能有一个class声明为public
	public的class只能与文件名同名，在本例中,public只能是helloworld
	在编译后，也会产生多个class
*/
class Person{

}

class Animal{

}
/* 
	程序的入口是main()方法。格式是固定的，其中，args是arguments的缩写，可以改变，中括号也可以改变
	* public static void main(String a[]){
*/
/* 
	输出语句：
		System.out.println();
		System.out.print();

*/
/* 
	每一行执行语句都以分号结束
*/
