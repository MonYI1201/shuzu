package com.demo.service;

import java.util.Scanner;

import com.demo.entity.Config;

/*
 * �û������ࣨ����̨���룩
 */
public class UserService {

	
	public static final Scanner input = new Scanner(System.in);
	/*
	 * �û����� �ɼ�����b
	 */
	public static int[] Arr() {
		int[] b = new int[Config.NUMBER];
		System.out.print("����a��");
		for(int i = 0;i < Config.A.length; i++) {
			System.out.print(Config.A[i]);
			// A�������ÿ��Ԫ�غ����","�ţ����һ��Ԫ�ز���
			if(i != Config.A.length - 1)	
				System.out.print(", ");
		}
		
		System.out.println("");
		
		for(int i = 0; i < Config.NUMBER; i++) {
			System.out.print("�����볤��Ϊ " + Config.NUMBER + " ������� " + i + " �±������b���ݣ�");
			b[i] = input.nextInt();
		}
		return b;
	}
	/*
	 * �ݹ���֤���û��±�¼��
	 */
	public static int Index() {
		int i = 0;
		do {
			
		System.out.println("��������뵽����a��λ�ã�");
		i = input.nextInt();
		
		}while(i > 8 || i < 0);
		return i;
	}
}