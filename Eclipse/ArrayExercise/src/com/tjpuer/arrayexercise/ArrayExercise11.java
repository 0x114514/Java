package com.tjpuer.arrayexercise;
/*
 * 数组的复制、反转、查找（线性查找、二分法查找）
 * */
public class ArrayExercise11 {
	public static void main(String[] args) {
		String[] arr1 = new String[] {"AA","BB","CC","DD","EE","FF","GG","HH","II"};
		String[] arr2 = new String[arr1.length];
		String[] arr3 = new String[arr1.length];
		System.out.println("arr1[]:");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
		System.out.println("\narr2[]:");
		//复制
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
			System.out.print(arr2[i] + "\t");
		}
		//两个数组反转
		System.out.println("\narr3[]:");
		for (int i = 0; i <= arr1.length - 1; i++) {
			arr3[i] = arr1[arr1.length - 1 - i];
			System.out.print(arr3[i] + "\t");
		}
		System.out.println("\narr3[]反转:");
		//单个数组反转
		for (int i = 0; i < arr3.length / 2; i++) {
			String	arr3Temp = "";
			arr3Temp = arr3[i];
			arr3[i] = arr3[arr3.length - 1 - i];
			arr3[arr3.length - 1 - i] = arr3Temp;
		}
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + "\t");
		}
		System.out.println();
		//查找
		//线性查找：
		String destination = "BB";
		for (int i = 0; i < arr3.length; i++) {
			//if (arr3[i] == destination) {
			if (arr3[i].equals(destination)) {
				//“==”判断的是地址值，equals()方法判断的是内容
				System.out.println("找到了目标" + destination + "位于arr3[" + i + "]");
				break;
			}else if(i == arr3.length - 1) {
				System.out.println("很遗憾，没有找到目标");
			}
		}
		//二分法查找
		//所查找的数据必须有序
		int[]	arr4 = new int[] {-98,-34,2,34,54,66,79,105,210,333,498};
		int		destination2 = 498;
		int		startNumber = 0;//初始索引
		int		endNumber = arr4.length - 1;//初始索引
		
		while(startNumber <= endNumber) {
			int	middleNumber = (startNumber + endNumber) / 2;
			if(arr4[middleNumber] == destination2) {
				System.out.println("找到所需的值，位置在arr4[" + middleNumber + "]" + "值为" + destination2);
				break;
			}else if(arr4[middleNumber] > destination2) {
				endNumber = middleNumber - 1;
			}else {
				startNumber = middleNumber + 1;
			}
		}
		
	}
}
