package com.tjpuer.arrayexercise;
/*
 * 数组名
 * 下标（或索引）
 * 元素
 * 数组的长度
 * 
 * 数组属于引用数据类型的变量。数组的元素既可以是基本数据类型，也可以是引用数据类型。
 * 创建数组对象会在内存中开辟一整块连续的空间，数组名中引用的是这块连续空间的首地址。
 * 数组的长度一旦确定，就不能修改。
 * 
 * 数组的分类
 * 	按照维数：一维数组、二维数组。。。。。。
 * 按照数组元素的类型：基本数据类型元素的数组、引用数据类型元素的数组。
 * 
 * 一维数组的使用
 * 	一维数组的声明和初始化
 * 	如何调用数组指定位置的元素
 * 	如何获取数组的长度
 * 	如何遍历数组
 * 	数组元素的默认初始化值
 * 	数组的内存解析
 * */
public class ArrayExercise01 {
	public static void main(String[] args) {
		//一维数组的声明和初始化
		int[]	ids;//声明
		//1.1 静态初始化:数组的初始化和元素的赋值操作要同时进行
		ids	= new int[] {1001,1002,1003,1004};
		//1.2 动态初始化：数组的初始化和元素的赋值操作要分开进行
		String[] names = new String[4];
		
		//错误的写法
		//int[] arr1 = new int[];
		//int[5] arr2 = new int[];
		//int[] arr3 = new int[3]{1,2,3};
		
		//数组一旦初始化完成，其长度就确定了。
		
		//2.如何调用指定位置的元素:通过角标方式
		names[0] = "张三";
		names[1] = "法外狂徒";
		names[2] = "格雷福斯";
		names[3] = "男枪";
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		 
		//3.如何获取数组的长度。
		//属性：length
		System.out.println("names的长度是：" + names.length);
		
		//4.如何遍历数组
		for (int i = 0; i < ids.length; i++) {
			System.out.println(ids[i]);
		}
		
		//5.数组元素的默认初始化值
		/*		数组元素是整形		0
		 * 		数组元素是浮点型		0.0
		 * 		数组元素是字符串		null
		 * 		数组元素是char型	空字符(ascii码中的第0位)
		 * 		数组元素是Boolean	false
		 * 
		 * 		数组元素是引用数据类型 	null
		 * */	
		System.out.println("**********");
		int[] arr1 = new int[5];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("**********");
		double[] arr2 = new double[5];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("**********");
		char[] arr3 = new char[5];
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		boolean[] arr4 = new boolean[5];
		//注意是boolean而不是Boolean
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		System.out.println("**********");
		String[] arr5 = new String[5];
		for (int i = 0; i < arr5.length; i++) {
			System.out.println(arr5[i]);
		}
		
		/*
		 * 内存结构的简单说明
		 * 栈：stack	存放局部变量(在方法中定义的变量)
		 * 堆：heap	存放new出来的结构：对象、数组
		 * 方法区：
		 * 	常量池
		 * 	静态域
		 * */
	}
}
