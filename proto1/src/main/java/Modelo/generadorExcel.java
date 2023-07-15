/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author Yeisson
 */
public class generadorExcel {
    public void generadorExc() {
    try (Workbook workbook = new XSSFWorkbook()) {
        Sheet sheet = workbook.createSheet("Mi Hoja de Trabajo");

        Row headerRow = sheet.createRow(0);
        Cell headerCell = headerRow.createCell(0);
        headerCell.setCellValue("Título de la Columna");

        Row dataRow = sheet.createRow(1);
        Cell dataCell = dataRow.createCell(0);
        dataCell.setCellValue("Dato de la Celda");

        // Puedes agregar más filas y celdas según los doatos

        // Escribir el archivo Excel en disco
        try (FileOutputStream outputStream = new FileOutputStream("ruta/del/archivo.xlsx")) {
            workbook.write(outputStream);
        }

        System.out.println("Archivo Excel generado exitosamente.");
    } catch (Exception e) {
        e.printStackTrace();}
}
}
