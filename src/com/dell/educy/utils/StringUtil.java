package com.dell.educy.utils;

public class StringUtil {
	public String num2String(int num){
		if(num<10){
			return "0"+num;
		}
		return num+"";
	}
}
