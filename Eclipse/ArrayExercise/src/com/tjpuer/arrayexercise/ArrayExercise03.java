package com.tjpuer.arrayexercise;
/*
 * 从键盘读入学生人数与成绩，并按照A B C D 定档
 * 	成绩 >= 最高分 - 10		A
 * 	成绩 >= 最高分 - 20		B
 * 	成绩 >= 最高分 - 30		C
 * 	其它					D
 * */
import java.util.Scanner;
public class ArrayExercise03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生人数：");
		int[] studentAchievement = new int[scan.nextInt()];
		String[] studentLevel = new String[studentAchievement.length];
		System.out.println("请分别输入学生成绩");
		for (int i = 0; i < studentAchievement.length; i++) {
			studentAchievement[i] = scan.nextInt();
			System.out.println("confirm!");
		}
		int maxAchievement = 0;
		for (int i = 0; i < studentAchievement.length; i++) {
			maxAchievement = ((studentAchievement[i] >= maxAchievement) ? studentAchievement[i] : maxAchievement);
		}
		System.out.println("最高分为" + maxAchievement);
		int minusResult = 0;
		for (int i = 0; i < studentLevel.length; i++) {
			minusResult = maxAchievement - studentAchievement[i];
			if(minusResult <= 10) {
				studentLevel[i] = "A";
			}else if(minusResult <= 20) {
				studentLevel[i] = "B";
			}else if(minusResult <= 30) {
				studentLevel[i] = "C";
			}else {
				studentLevel[i] = "D";
			}
		}
		for (int i = 0; i < studentAchievement.length; i++) {
			System.out.println("student " + i + " achievement is :" + studentAchievement[i] + "\tlevel is:" + studentLevel[i]);
		}
		
	}
}
