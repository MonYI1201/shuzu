package com.demo.service;
/*
 * 数组操作类（冒泡排序）（赵鹏程）
 */
public class ArraySortService {
	/**
	 * 全数组冒泡排序的方法 （包含升序和降序的选择）
	 * 参数内容   【需要排序的数组 array[]、确定该数组需要的排序方式  way 】  
	 */
	public static void buSort(int[] array , int way) {
		for(int x=0; x<array.length-1; x++){
		// 让第一位和第二位进行对比，第二位和第三位对比，以此循环对比 
			for(int y=0; y<array.length-x-1; y++){
				if (way==0) {//升
					if(array[y]>array[y+1]){
						int z = array[y];
						array[y] = array[y+1];
						array[y+1] = z;
					}
				}
				if(way==1) {//降
					if(array[y]<array[y+1]){
						int z = array[y];
						array[y] = array[y+1];
						array[y+1] = z;
					}
				}
			}
		}
	}
	
	/**
	 * 数组中部分位置进行冒泡排序的方法 （同样包含升序和降序的选择）
	 * 参数内容 【需要排序的数组 array []、排序开始的下标位置 startSub 、 排序结束的位置下标 endSub 、 排序的方式 way 】
	 */
	
	public static void partSort(int[] array ,int startSub,int endSub, int way) {
		for(int x=0; x<=endSub; x++){
			for(int y=startSub; y<=endSub-1-x; y++){
				if (way==0) {
					if(array[y]>array[y+1]){
						int z = array[y];
						array[y] = array[y+1];
						array[y+1] = z;
					}
				}
				if(way==1) {
					if(array[y]<array[y+1]){
						int z = array[y];
						array[y] = array[y+1];
						array[y+1] = z;
					}
				}
			}
		}
	}
}
