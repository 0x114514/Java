package com.tjpuer.arrayexercise;
/*
 * public class ArrayTest{
 * 		public static void main(String[] args){
 * 			int[] arr = new int[]{8,2,1,0,3};
 * 			int[] index = new int[]{2,0,3,2,4,0,1,3,2,3,3};
 * 			String tel = "";
 * 			for(int i = 0; i < index.length; i++){
 * 			tel += arr[index[i]];	
 * 			}
 * 			System.out.println("联系方式：" + tel);
 *			//1 8 0 1 3 8 2 0 1 0 0
 * 		}
 * }
 * */
public class ArrayExercise02 {
	public static void main(String[] args) {
			int[] arr = new int[]{8,2,1,0,3};
 			int[] index = new int[]{2,0,3,2,4,0,1,3,2,3,3};
 			String tel = "";
 			for(int i = 0; i < index.length; i++){
 			tel += arr[index[i]];	
 			}
 			System.out.println("联系方式：" + tel);
	}
}
