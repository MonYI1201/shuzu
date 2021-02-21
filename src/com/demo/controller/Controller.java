package com.demo.controller;

import com.demo.entity.Config;
import com.demo.service.ArrayInsertService;
import com.demo.service.ArraySortService;
import com.demo.service.UserService;

/*
 * 系统控制类（罗来州）
 */
public class Controller {
	
	public void run(){

		int b[] = UserService.Arr();
		
		
		ArraySortService.buSort(b, 1);
		
		int index = UserService.Index();
		
		ArraySortService.partSort(b, Config.C.length, index-Config.NUMBER-1, 1);
		
		ArrayInsertService.arrayInsertService(Config.C, index, Config.NUMBER);
		
		ArrayInsertService.arrayInsert(Config.C, index);
		
		ArrayInsertService.arryAssignments(b, Config.C, index, index + Config.NUMBER - 1);
	}
}
