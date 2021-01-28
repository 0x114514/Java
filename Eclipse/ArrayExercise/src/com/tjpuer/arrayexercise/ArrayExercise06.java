package com.tjpuer.arrayexercise;
/*
 * 打印杨辉三角
 * 
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * …………
 * */
public class ArrayExercise06 {
	public static void main(String[] args) {
		long	startTime = System.currentTimeMillis();
		int[][] arr = new int[10][10];
		//给三角边缘赋值为1
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = 1;
			arr[i][i] = 1;
		}
		//给三角内部赋值
		for (int i = 2; i < arr.length; i++) {
			for (int j = 1; j < i; j++) {
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			}
		}
		//打印整个三角
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
				
//				if (arr[i][j] != 0) {
//				System.out.print(arr[i][j] + "\t");
//				}
				
				//优化程序，不输出0
				if (j == i) {
					break;
				}
			}
			System.out.println();
		}
		long	endTime = System.currentTimeMillis();
		System.out.println("程序花费时间：" + (endTime - startTime) + "ms");
	}
}
