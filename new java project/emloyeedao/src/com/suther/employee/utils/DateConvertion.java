package com.suther.employee.utils;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateConvertion {
	private static Date sqlDate;
	public static Date convertDate(String str) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		try {
			java.util.Date utilDate = sdf.parse(str);
			sqlDate = new Date(utilDate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return sqlDate;
	}
}
