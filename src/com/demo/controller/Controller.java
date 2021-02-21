package com.demo.controller;

import java.util.Arrays;

import com.demo.entity.Config;
import com.demo.service.ArrayInsertService;
import com.demo.service.ArraySortService;
import com.demo.service.UserService;

/*
 * 系统控制类（罗来州）
 */
 
public class Controller extends Config {
	
	public void run(){

		int b[] = UserService.Arr();
		
		ArraySortService.buSort(b, 0);
		
		int index = 0; 
		index = UserService.Index();
		
		ArrayInsertService.arrayInsertService(Config.C, index, Config.NUMBER);//
		
		ArrayInsertService.arryAssignments(b, Config.C, index + Config.NUMBER - 1, index,0);
		
		ArraySortService.partSort(Config.C, 0, index - 1, 1);
		
		ArraySortService.partSort(Config.C, index + Config.NUMBER, Config.C.length-1, 0);
		
//		ArraySortService.partSort(b, Config.C.length, index-Config.NUMBER-1, 1);
//		
//		ArrayInsertService.arrayInsertService(Config.C, index, Config.NUMBER);
//		
//		ArrayInsertService.arrayInsert(Config.C, index);
//		
//		ArrayInsertService.arryAssignments(b, Config.C, index, index + Config.NUMBER - 1);
		
		System.out.println(Arrays.toString(Config.C));
	}
}
