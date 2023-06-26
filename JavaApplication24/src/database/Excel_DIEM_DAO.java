package database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import database.DIEM_DAO;
import models.DIEM;

public class Excel_DIEM_DAO extends BDConnect{
	public static Excel_DIEM_DAO getInstance() {
		return new Excel_DIEM_DAO();
	}
	public int Import_excel(String filePath) {
            int kq = 0;
		try {
			FileInputStream excelFile = new FileInputStream(new File(filePath));
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet datatypeSheet = workbook.getSheetAt(0);
			DataFormatter fmt = new DataFormatter();

			Iterator<Row> iterator = datatypeSheet.iterator();
			Row firstRow = iterator.next();
			Row secondRow = iterator.next();
			Row thirdRow = iterator.next();
			Row fouthRow = iterator.next();
			Cell firstCell = firstRow.getCell(0);
			Cell secondCell = secondRow.getCell(2);
			Cell thirdCell = thirdRow.getCell(2);
			String maMonHoc = thirdCell.getStringCellValue();
			String maHocKy = secondCell.getStringCellValue();
			List<DIEM> listOfDiem = new ArrayList<DIEM>();
			while (iterator.hasNext()) {
				Row currentRow = iterator.next();
				DIEM diem = new DIEM();
//				int stt = Integer.parseInt(fmt.formatCellValue(currentRow.getCell(0)));
				
				diem.setMaSV(currentRow.getCell(1).getStringCellValue());
//				diem.set(Integer.parseInt(fmt.formatCellValue(currentRow.getCell(0))));
				diem.setMaHocKy(maHocKy);
				diem.setMaMon(maMonHoc);
				diem.setDiemChuyenCan(Float.parseFloat(fmt.formatCellValue(currentRow.getCell(3))));
				diem.setDiemGiuaKy(Float.parseFloat(fmt.formatCellValue(currentRow.getCell(4))));
				diem.setDiemKetThuc(Float.parseFloat(fmt.formatCellValue(currentRow.getCell(5))));
				diem.setFlag(true);
				
				listOfDiem.add(diem);
			}
			DIEM_DAO diem_dao = new DIEM_DAO();
			for (DIEM diem : listOfDiem) {
				kq += diem_dao.insert(diem);
//				System.out.println(diem);
			}
			workbook.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
              return kq;  
	}
	
}
