package com.demo.service;
/*
 * ��������ࣨð�����򣩣������̣�
 */
public class ArraySortService {
	/**
	 * ȫ����ð������ķ��� ����������ͽ����ѡ��
	 * ��������   ����Ҫ��������� array[]��ȷ����������Ҫ������ʽ  way ��  
	 */
	public static void buSort(int[] array , int way) {
		for(int x=0; x<array.length-1; x++){
		// �õ�һλ�͵ڶ�λ���жԱȣ��ڶ�λ�͵���λ�Աȣ��Դ�ѭ���Ա� 
			for(int y=0; y<array.length-x-1; y++){
				if (way==0) {//��
					if(array[y]>array[y+1]){
						int z = array[y];
						array[y] = array[y+1];
						array[y+1] = z;
					}
				}
				if(way==1) {//��
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
	 * �����в���λ�ý���ð������ķ��� ��ͬ����������ͽ����ѡ��
	 * �������� ����Ҫ��������� array []������ʼ���±�λ�� startSub �� ���������λ���±� endSub �� ����ķ�ʽ way ��
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
