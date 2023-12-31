package pages;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import stepsDefinition.Hooks;

public class ExtractionFiltrePage {

	WebDriver driver = Hooks.driver;

	public ExtractionFiltrePage(WebDriver driver) {
		this.driver = driver;
	}

	public void extractDataFromWebTable() {
		WebElement table = driver.findElement(By.xpath("//app-sessiondetails[1]//p-tabpanel[3]//p-table[1]//table[1]"));
		System.out.println("table");

		System.out.println(table);

		try (Workbook workbook = new XSSFWorkbook()) {
			Sheet sheet = workbook.createSheet("TableData");

			List<WebElement> rows = driver.findElements(By.cssSelector(
					"app-admin.ng-star-inserted:nth-child(3) app-sessiondetails.ng-star-inserted:nth-child(3) div.card p-tabview.p-element:nth-child(2) div.p-tabview.p-component div.p-tabview-panels p-tabpanel.p-element:nth-child(3) div.p-tabview-panel.ng-star-inserted p-table.p-element div.p-datatable.p-component div.p-datatable-wrapper table.p-datatable-table.ng-star-inserted thead.p-datatable-thead tr.ng-star-inserted > th"));
			int rowNum = 0;
		for (WebElement row : rows) {
				Row excelRow = sheet.createRow(rowNum++);
				List<WebElement> cols = driver.findElements(By.cssSelector(
						"app-admin.ng-star-inserted:nth-child(3) app-sessiondetails.ng-star-inserted:nth-child(3) div.card p-tabview.p-element:nth-child(2) div.p-tabview.p-component div.p-tabview-panels p-tabpanel.p-element:nth-child(3) div.p-tabview-panel.ng-star-inserted p-table.p-element div.p-datatable.p-component div.p-datatable-wrapper table.p-datatable-table.ng-star-inserted tbody.p-element.p-datatable-tbody tr.ng-star-inserted:nth-child(1) > td")); // Utiliser
																																																																																																															// colonnes
			int colNum = 1;
				for (WebElement col : cols) {
					Cell cell = excelRow.createCell(colNum++);
					cell.setCellValue(col.getText());
					}
			int evaluationsColumnIndex = 3;
				if (colNum > evaluationsColumnIndex) {
					Cell evaluationsCell = excelRow.getCell(evaluationsColumnIndex);
					String evaluationsValue = evaluationsCell.getStringCellValue();

					switch (evaluationsValue) {
					case "( 5 votes )":
						evaluationsCell.setCellValue("5");
					case "(3 Votes)":
						evaluationsCell.setCellValue("3");
						break;
					case "(2 Votes)":
						evaluationsCell.setCellValue("2");
						break;
					case "(1 Votes)":
						evaluationsCell.setCellValue("1");
						break;
					}
					int evaluations = Integer.parseInt(evaluationsCell.getStringCellValue());
					if (evaluations <= 3) {

						try (FileOutputStream outputStream = new FileOutputStream("FilteredTableData.xlsx")) {
							workbook.write(outputStream);
						}
					}
				}
			}

			try (FileOutputStream outputStream = new FileOutputStream("TableData.xlsx")) {
				workbook.write(outputStream);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
