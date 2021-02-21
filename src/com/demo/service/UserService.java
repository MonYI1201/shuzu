package com.demo.service;

import java.util.Scanner;

import com.demo.entity.Config;

/*
 * 用户操作类（控制台输入）
 */
public class UserService {

	
	public static final Scanner input = new Scanner(System.in);
	/*
	 * 用户输入 采集数组b
	 */
	public static int[] Arr() {
		int[] b = new int[Config.NUMBER];
		System.out.print("数组a：");
		for(int i = 0;i < Config.A.length; i++) {
			System.out.print(Config.A[i]);
			// A数组里的每个元素后面加","号，最后一个元素不加
			if(i != Config.A.length - 1)	
				System.out.print(", ");
		}
		
		System.out.println("");
		
		for(int i = 0; i < Config.NUMBER; i++) {
			System.out.print("请输入长度为 " + Config.NUMBER + " 的数组第 " + i + " 下标的数组b内容：");
			b[i] = input.nextInt();
		}
		return b;
	}
	/*
	 * 递归验证，用户下标录入
	 */
	public static int Index() {
		int i = 0;
		do {
			
		System.out.println("请输入插入到数组a的位置：");
		i = input.nextInt();
		
		}while(i > 8 || i < 0);
		return i;
	}
}