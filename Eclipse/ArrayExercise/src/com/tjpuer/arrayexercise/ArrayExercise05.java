package com.tjpuer.arrayexercise;
/*
 * 获取arr数组中所有元素的和
 * */
public class ArrayExercise05 {
	public static void main(String[] args) {
		int[][] arr = new int[][] {{3,5,8},{12,9},{7,0,6,4}};
		int sumResult = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sumResult = sumResult + arr[i][j];
			}	
		}
		System.out.println(sumResult);
	}
}
