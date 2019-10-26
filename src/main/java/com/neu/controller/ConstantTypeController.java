package com.neu.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.neu.entity.ConstantType;
import com.neu.service.ConstantTypeService;

@RestController
@RequestMapping("constantType")
public class ConstantTypeController {
	@Autowired
	private ConstantTypeService constantTypeService;
	
	@RequestMapping("getPaged")
	public PageInfo<ConstantType> getPaged(
			@RequestParam(defaultValue="1") int pageNum,
			@RequestParam(defaultValue="10")int pageSize,
			@RequestBody Map<String, Object> params){
		return constantTypeService.getPaged(pageNum, pageSize, params);
	}
	@RequestMapping("export")
	public void export(HttpServletResponse response,int pageNum,int pageSize,String code,String name) throws IOException {
		Map<String, Object> map = new HashMap<>();
		map.put("code", code);
		map.put("name", name);
		
		PageInfo<ConstantType> pageInfo = constantTypeService.getPaged(pageNum, pageSize, map);
		List<ConstantType> list = pageInfo.getList();
		
		//创建一个工作簿
		Workbook wb = new HSSFWorkbook();
		//创建工作表
		Sheet sheet = wb.createSheet("sheet1");
		Row row ;
		Cell cell;
		int startRowIndex = 1;
		
		int startCellIndex = 1;
		for(ConstantType type : list) {
			int n = startCellIndex;
			row = sheet.createRow(startRowIndex++);
			//创建单元格
			cell = row.createCell(n++);
			cell.setCellValue(type.getId());
			
			cell = row.createCell(n++);
			cell.setCellValue(type.getCode());
			
			cell = row.createCell(n++);
			cell.setCellValue(type.getName());			
		}
		
		sheet.autoSizeColumn(startCellIndex);
		sheet.autoSizeColumn(startCellIndex+1);
		sheet.autoSizeColumn(startCellIndex+2);
		
		//设置响应内容类型
		response.setContentType("application/vnd.ms-excel");
		//设置响应头
		response.setHeader("Content-disposition", "attachment;filename=constantType.xls");
		//得到响应字节流
		ServletOutputStream outputStream = response.getOutputStream();
		//将工作簿写入到响应流中
		wb.write(outputStream);
		//关闭响应流
		outputStream.close();
	}
	
	@RequestMapping("getAll")
	public List<ConstantType> getAll(){
		return constantTypeService.getAll();
	}
}








