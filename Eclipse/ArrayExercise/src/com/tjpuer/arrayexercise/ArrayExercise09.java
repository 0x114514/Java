package com.tjpuer.arrayexercise;
/*
 * 定义一个int[],填充随机数据（2位数），求最大值、最小值、平均值、和值，要求
 * 
 * 10-99
 * 
 * 
 * */
import	java.util.Scanner;
public class ArrayExercise09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请定义数组长度：");
		int[] arr = new int[scan.nextInt()];
		int	  maxNumber = 0;
		int	  minNumber = 100;
		int	  numSum = 0;
		double	averageNumber = 0.0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 90 + 10);
			maxNumber = ((arr[i] > maxNumber)? arr[i]: maxNumber);
			minNumber = ((arr[i] < minNumber)? arr[i]: minNumber);
			numSum = numSum + arr[i];
		}
		averageNumber = (double)numSum / arr.length;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		System.out.println("maxNumber = " + maxNumber);
		System.out.println("minNumber = " + minNumber);
		System.out.println("numSum = " + numSum);
		System.out.println("averageNumber = " + averageNumber);
		
	}
}
