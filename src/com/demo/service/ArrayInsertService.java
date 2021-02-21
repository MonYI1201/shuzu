package com.demo.service;
/*
 * 数组插入类(数组移位)（付哲）
 */

import com.demo.entity.Config;

public class ArrayInsertService {
	
	/*
	 *  arr 数组的引用
	 *  index 位移的起始下标
	 *  nums 位移的个数
	 */
	
	public static void arrayInsertService(int arr[], int index, int nums) {
		for(int i = arr.length - 1; i >= index + nums; i--) {             
			if(index == 8) {
				arr[i] = arr[i - nums + 1];
			}
				arr[i] = arr[i - nums];
		}
	}
	
	/*
	 * 数组后移一个位置
	 * 
	 */
	public static void arrayInsert(int arr[], int index) {
		for(int f = arr.length; f < index; f--) {
			arr[f] = arr[f - 1];
		}
	}
	
	/*
	 * 将数组a指定长度的内容赋值给数组b
	 * a 替换数据
	 * b 原始数据
	 * index 起始位置
	 * lenth 长度
	 */
	
	public static void arryAssignments(int a[],int b[],int index, int lenth) {
		for(int z = index; z < lenth; z++) {
			b[z] = a[z];
		}
	}
	
	public static void  arryAssignments(int a[],int b[],int index, int lenth,int n) {
		for(int z = index; z <= lenth; z++) {
			b[z] = a[n];
			n++;
		}
	}
	
}
