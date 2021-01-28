package com.tjpuer.arrayexercise;
/*
 * 二维数组
 * 	
 * 二维数组的使用
 * 	1.二维数组的声明和初始化
 * 	2.如何调用指定位置的元素	
 * 	3.如何获取数组的长度
 * 	4.如何遍历数组
 * 	5.数组元素的默认初始化值
 * 	6.数组的内存解析
 * */
public class ArrayExercise04 {
	public static void main(String[] args) {
		//1.二维数组的声明和初始化
		int arr1[] = new int[]{1,2,3};
		//静态初始化
		int[][] arr2 = new int[][] {{1,2,3,4,5},{1,2,0,0,0}};
		//动态初始化,先5个元素构成数组，再2个元素构成数组
		int[][] arr3 = new int[5][2];
		int[][] arr4 = new int[][]{{1,2,3},{4,5,6},{7,8},{9}};
		
		//2.指定位置元素的调用
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("arr2 位置 [" + i + "] [" + j + "] 的元素是" + arr2[i][j]);
			}
		}
		System.out.println("----------------------");
		//3.获取数组的长度
		System.out.println(arr3.length);
		System.out.println(arr3[0].length);
		System.out.println("----------------------");
		//4.如何遍历二维数组
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
				System.out.println("arr4 位置 [" + i + "] [" + j + "] 的元素是" + arr4[i][j]);
			}
		}
		/*
		 * 5.二维数组的初始化值
		 * 针对arr[x][y]
		 * 	外层元素:arr[0],arr[1]等
		 * 		地址值
		 * 	内层元素：
		 * 		与一维数组相同
		 * 
		 * 针对arr[x][]
		 * 	外层元素:arr[0],arr[1]等
		 * 		null
		 * 
		 * 
		 * */
		int[][] arr5 = new int[4][3];
		System.out.println(arr5);
		System.out.println(arr5[0]);
		System.out.println(arr5[0][0]);
		
		float[][] arr6 = new float[4][3];
		System.out.println(arr6);
		System.out.println(arr6[0]);
		System.out.println(arr6[0][0]);
		
		String[][] arr7 = new String[4][3];
		System.out.println(arr7);
		System.out.println(arr7[0]);
		System.out.println(arr7[0][0]);
		
		double[][] arr8 = new double[4][];
		System.out.println(arr8);
		System.out.println(arr8[1]);
		
	}
}
