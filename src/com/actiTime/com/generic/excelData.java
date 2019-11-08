package com.actiTime.com.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelData implements AutoConstant
{
	public static String getdata(String file_path, String Sheetname, int rn, int cn)
	{
		try {
			FileInputStream fis=new FileInputStream(new File(file_path));
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(Sheetname);
			Row rc=sh.getRow(rn);
			Cell cc=rc.getCell(cn);
			String data=cc.toString();
			return data;
		}
		
		catch(Exception e)
		{
			return "";
		}
	
	}
}
