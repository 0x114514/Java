package com.tjpuer.arrayexercise;
/*
 * 创建一个长度为6的int型数组，数组元素的值在1-30之间，且是随机赋值，要求数组的各个元素均不相同。
 * 
 * 	
 * */
public class ArrayExercise07 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		int randomNumber = 0;
		boolean sameFlag = false;
		for (int i = 0; i < arr.length; i++) {
			do {
				randomNumber = (int)(Math.random() * 30 + 1);
				sameFlag = false;
				for (int j = 0; j < arr.length; j++) {
					if (randomNumber == arr[j]) {
						sameFlag = true;
						System.out.println("检测到相同的数，正在重新生成!\t当前随机数为 " + randomNumber + " 与 " + "arr[" + j + "] = " + arr[j] + "相同");
					}
				}
				arr[i] = randomNumber;
			}while(sameFlag);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
