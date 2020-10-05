package com.dell.educy.utils;

import java.util.Calendar;


public class DateUtil {
	public String getYear(){
		Calendar calendar=Calendar.getInstance();
		return calendar.get(Calendar.YEAR)+"";
	}
}
