package util;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*;

public class ExcelUtil {

    public static Object[][] getData(String path, String sheetName) {
        try (FileInputStream fis = new FileInputStream(path); Workbook wb = WorkbookFactory.create(fis)) {

            Sheet sheet = wb.getSheet(sheetName);
            int rows = sheet.getPhysicalNumberOfRows();
            int cols = sheet.getRow(0).getPhysicalNumberOfCells();

            DataFormatter formatter = new DataFormatter();
            List<Object[]> dataList = new ArrayList<>();

            for (int i = 1; i < rows; i++) {
                Row row = sheet.getRow(i);
                if (row == null) continue; // skip empty row

                Object[] rowData = new Object[cols];
                boolean hasData = false;

                for (int j = 0; j < cols; j++) {
                    Cell cell = row.getCell(j);
                    String value = formatter.formatCellValue(cell);
                    rowData[j] = value;
                    if (value != null && !value.trim().isEmpty()) {
                        hasData = true;
                    }
                }

                if (hasData) {
                    dataList.add(rowData); // only add rows with at least one non-empty cell
                }
            }

            return dataList.toArray(new Object[0][]);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}