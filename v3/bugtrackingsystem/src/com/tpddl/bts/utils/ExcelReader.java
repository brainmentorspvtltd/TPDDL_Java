package com.tpddl.bts.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

public interface ExcelReader {
	
	public static ArrayList<XLSDTO> readExcel(String path) throws IOException {
		FileInputStream fs = new FileInputStream(path);
		HSSFWorkbook workBook = new HSSFWorkbook(fs);  // xls
		HSSFSheet sheet = workBook.getSheetAt(0);
		Iterator<Row> rows = sheet.rowIterator();
		ArrayList<XLSDTO> list = new ArrayList<>();
		int currentColumnIndex = 1;
		boolean isFirstRow = true;
		while(rows.hasNext()) {
			Row currentRow = rows.next(); // give current and move to the next
			if(isFirstRow ) {
				isFirstRow= false;
				continue;
			}
			currentColumnIndex = 1;
			
			Iterator<Cell> cells =currentRow.cellIterator();
			XLSDTO xlsDTO = new XLSDTO();
			while(cells.hasNext()) {
				Cell currentCell = cells.next();
				switch(currentColumnIndex) {
				case 1:
					if(currentCell.getCellType()==CellType.NUMERIC) {
						xlsDTO.setId((int)currentCell.getNumericCellValue());
					}
					else {
					xlsDTO.setId(Integer.parseInt(currentCell.getStringCellValue()));
					}
					break;
				
				case 2:
				xlsDTO.setUserid(currentCell.getStringCellValue());
				break;
				case 3:
					xlsDTO.setPassword(currentCell.getStringCellValue());
					break;
				case 4:
					xlsDTO.setName(currentCell.getStringCellValue());
					break;
				case 5:
					if(currentCell.getCellType()==CellType.NUMERIC) {
						xlsDTO.setPhone(String.valueOf((int)currentCell.getNumericCellValue()));
					}
					else {
					xlsDTO.setId(Integer.parseInt(currentCell.getStringCellValue()));
					}
					
					break;
				case 6:
					if(currentCell.getCellType()==CellType.NUMERIC) {
						xlsDTO.setReportingId((int)currentCell.getNumericCellValue());
					}
					else {
					xlsDTO.setReportingId(Integer.parseInt(currentCell.getStringCellValue()));
					}
					break;
				case 7:
					if(currentCell.getCellType()==CellType.NUMERIC) {
						xlsDTO.setRoleId((int)currentCell.getNumericCellValue());
					}
					else {
					xlsDTO.setRoleId(Integer.parseInt(currentCell.getStringCellValue()));
					}
					break;
				}
				currentColumnIndex ++;
			}
			list.add(xlsDTO);
//				if(currentCell.getCellType()==CellType.STRING) {
//					
//				}
//				if(currentCell.getCellType()==CellType.NUMERIC) {
//					
//				}
			}
		
		workBook.close();
		fs.close();
		return list;
		
		//XSSHssfWorkbook  // xlsx
		
	}

}
