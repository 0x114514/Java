package com.tjpuer.arrayexercise;
/*
 * 输出回形数
 * 	
 * */
import  java.util.Scanner;
public class ArrayExercise08 {
	public static void main(String[] args) {
		long	startTime = System.currentTimeMillis();
		Scanner scan = new Scanner(System.in);
		int currentNumber = 1;
		String	direction = "right";
		boolean finishFlag = true;
		boolean loopFlag = true;
		System.out.println("请输入矩阵行数：");
		int matrixOrderRow = scan.nextInt();
		System.out.println("请输入矩阵列数：");
		int matrixOrderCol = scan.nextInt();
		System.out.println("即将生成 " + matrixOrderRow + "行" + matrixOrderCol + "列的回形数矩阵");
		int startRow = 1;
		int startCol = 1;
		int endRow = 1;
		int endCol = matrixOrderCol - 2;
		int[][] arr = new int[matrixOrderRow][matrixOrderCol];
		//填充最外圈的数组
		for (int i = 0; i < matrixOrderCol; i++) {
			arr[0][i] = currentNumber++;
		}
		for (int i = 1; i < matrixOrderRow; i++) {
			arr[i][matrixOrderCol - 1] = currentNumber++;
		}
		for (int i = matrixOrderCol - 1; i > 0; i--) {
			arr[matrixOrderRow - 1][i - 1] = currentNumber++;
		}
		for (int i = matrixOrderRow - 1; i > 1; i--) {
			arr[i - 1][0] = currentNumber++;
		}
		//判断数组是否被填充完毕
		forLable:for (int i = 0; i < matrixOrderRow; i++) {
			for (int j = 0; j < matrixOrderCol; j++) {
				if (arr[i][j] == 0) {
					finishFlag = false;
					break forLable;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("外圈填充完毕，数组完成状态：" + finishFlag);
		while(!finishFlag) {
			loopFlag = true;
			while(direction == "right" && loopFlag) {
			//while(direction == "right") {
				System.out.println("Current direction is:" + direction);
				for (int i = startCol; i <= endCol; i++) {
					arr[startRow][i] = currentNumber++;
				}
				direction = "down";
				startRow = startRow + 1;
				System.out.println("next startRow is " + startRow);
				for (int i = 1; i < matrixOrderRow; i++) {
					if(arr[i][endCol] != 0 && arr[i - 1][endCol] == 0) {
						endRow = i - 1;
					}
				}
				System.out.println("next endRow is " + endRow);
				startCol = endCol;
				System.out.println("next startCol is " + startCol);
				System.out.println("next endCol is " + endCol);
				loopFlag = false;
			}
			
			while(direction == "down" && loopFlag) {
			//while(direction == "down") {
				System.out.println("Current direction is:" + direction);
				for (int i = startRow; i <= endRow; i++) {
					arr[i][startCol] = currentNumber++;
				}
				direction = "left";
				startRow = endRow;
				System.out.println("next startRow is " + startRow);
				System.out.println("next endRow is " + endRow);
				startCol = startCol - 1;
				System.out.println("next startCol is " + startCol);
				for (int i = matrixOrderCol - 2; i >= 0; i--) {
					if(arr[startRow][i] != 0 && arr[startRow][i + 1] == 0) {
						endCol = i + 1;
					}
				}
				System.out.println("next endCol is " + endCol);
				loopFlag = false;
			}
			
			while(direction == "left" && loopFlag) {
			//while(direction == "left") {
				System.out.println("Current direction is:" + direction);
				for (int i = startCol; i >= endCol; i--) {
					arr[startRow][i] = currentNumber++;
				}
				direction = "up";
				startCol = endCol;
				System.out.println("next startCol is " + startCol);
				System.out.println("next endCol is " + endCol);
				startRow = startRow - 1;
				System.out.println("next startRow is " + startRow);
				for (int i = matrixOrderRow - 2; i > 0; i--) {
					if (arr[i][startCol] != 0 && arr[i + 1][startCol] == 0) {
						endRow = i + 1;
					}
				}
				System.out.println("next endRow is " + endRow);
				loopFlag = false;
			}
			while(direction == "up" && loopFlag) {
			//while(direction == "up") {
				System.out.println("Current direction is:" + direction);
				for (int i = startRow; i >= endRow; i--) {
					arr[i][startCol] = currentNumber++;
				}
				direction = "right";
				startRow = endRow;
				System.out.println("next startRow is " + startRow);
				System.out.println("next endRow is " + endRow);
				startCol = startCol + 1;
				System.out.println("next startCol is " + startCol);
				for (int i = 1; i < matrixOrderCol; i++) {
					if(arr[startRow][i] != 0 && arr[startRow][i-1] == 0 ) {
						endCol = i - 1;
					}
					System.out.println("next endCol is " + endCol);
				}
			}
			
			//finishFlag = true;
			
			
			
			forLable:for (int i = 0; i < matrixOrderRow; i++) {
				for (int j = 0; j < matrixOrderCol; j++) {
					finishFlag = true;
					if (arr[i][j] == 0) {
						finishFlag = false;
						break forLable;
					}
				}
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println("finishFlag is:" + finishFlag);
		}
		long	endTime = System.currentTimeMillis();
		System.out.println("程序花费时间:" + (endTime - startTime) + "ms");
	}
}
