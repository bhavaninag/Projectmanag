package com.actiTime.com.tests;

import com.actiTime.com.generic.excelData;

public class demo extends excelData 
{
	public static void main(String[] args)
	{
		String data=excelData.getdata(file_path, "Sheet1", 0, 1);
		System.out.println(data);
	}
}
