package com.demo.service;
/*
 * ���������(������λ)�����ܣ�
 */

import com.demo.entity.Config;

public class ArrayInsertService {
	
	/*
	 *  arr ���������
	 *  index λ�Ƶ���ʼ�±�
	 *  nums λ�Ƶĸ���
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
	 * �������һ��λ��
	 * 
	 */
	public static void arrayInsert(int arr[], int index) {
		for(int f = arr.length; f < index; f--) {
			arr[f] = arr[f - 1];
		}
	}
	
	/*
	 * ������aָ�����ȵ����ݸ�ֵ������b
	 * a �滻����
	 * b ԭʼ����
	 * index ��ʼλ��
	 * lenth ����
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
