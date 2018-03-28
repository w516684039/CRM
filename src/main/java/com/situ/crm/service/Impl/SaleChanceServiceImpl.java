package com.situ.crm.service.Impl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.situ.crm.common.DataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.entity.SaleChance;
import com.situ.crm.mapper.SaleChanceMapper;
import com.situ.crm.service.ISaleChanceService;

@Service
public class SaleChanceServiceImpl implements ISaleChanceService {
	
	@Autowired
	private SaleChanceMapper saleChanceMapper;

	@Override
	public DataGrideResult<SaleChance> pageList(Integer page, Integer rows, SaleChance saleChance) {
		//1.设置分页
		PageHelper.startPage(page, rows);
		//2.执行查询(查询的是分页之后的数据)
		List<SaleChance> list = saleChanceMapper.pageList(saleChance);
		//3.得到满足条件的所有数据的数量，而上面的list是满足这个条件的某一页的数据
		PageInfo pageInfo = new PageInfo<>(list);
		Integer total = (int) pageInfo.getTotal();
		return new DataGrideResult<>(total, list);
	}

	@Override
	public ServerResponse delete(String ids) {
		String[] idsArray = ids.split(",");//[1,2,3]
		/*for (String id : idsArray) {
			saleChanceMapper.deleteByPrimaryKey(Integer.parseInt(id));
		}
		return ServerResponse.createSUCCESS("删除成功");*/
		
		// delete from saleChance where id in (1,2,3);
		int count = saleChanceMapper.deleteAll(idsArray);
		if (count == idsArray.length) {
			return ServerResponse.createSUCCESS("删除成功");
		}
		return ServerResponse.createERROR("删除失败");
	}

	@Override
	public ServerResponse add(SaleChance saleChance) {
		if (StringUtils.isNotEmpty(saleChance.getAssignMan())) {
			saleChance.setStatus(1);//已分配
		} else {
			saleChance.setStatus(0);//未分配
		}
		int count = saleChanceMapper.insert(saleChance);
		if (count > 0) {
			return ServerResponse.createSUCCESS("添加成功");
		}
		return ServerResponse.createERROR("添加失败");
	}
	
	@Override
	public ServerResponse update(SaleChance saleChance) {
		if (StringUtils.isNotEmpty(saleChance.getAssignMan())) {
			saleChance.setStatus(1);//已分配
		} else {
			saleChance.setStatus(0);//未分配
		}
		int count = saleChanceMapper.updateByPrimaryKey(saleChance);
		if (count > 0) {
			return ServerResponse.createSUCCESS("更新成功");
		}
		return ServerResponse.createERROR("更新失败");
	}

	@Override
	public ServerResponse<SaleChance> selectById(Integer saleChanceId) {
		SaleChance saleChance = saleChanceMapper.selectByPrimaryKey(saleChanceId);
		if (saleChance != null) {
			return ServerResponse.createSUCCESS("查找成功", saleChance);
		}
		return ServerResponse.createERROR("查找失败");
	}

	@Override
	public ServerResponse updateDevResult(Integer id, Integer devResult) {
		int count = saleChanceMapper.updateDevResult(id, devResult);
		if (count > 0) {
			return ServerResponse.createSUCCESS("更新成功");
		}
		return ServerResponse.createERROR("更新失败");
	}

	@Override
	public void exportExcel(HttpServletResponse response) {
		// 1.查询用户列表
		List<SaleChance> list = saleChanceMapper.selectAll();
		for (SaleChance saleChance : list) {
			System.out.println(saleChance);
		}
		// 2.写到excel
		// 1、创建工作簿：Workbook。
		HSSFWorkbook workbook = new HSSFWorkbook();
		// 2、创建工作表：Sheet。
		HSSFSheet sheet = workbook.createSheet("用户列表");
		// 设置默认的列宽
		sheet.setDefaultColumnWidth(25);
		// 2.1创建合并单元格对象
		CellRangeAddress cellRangeAddress = new CellRangeAddress(2, 6, 1, 12);
		sheet.addMergedRegion(cellRangeAddress);
		// 3、创建行：Row。
		HSSFRow rowTitle = sheet.createRow(2);
		// 4、创建单元格：Cell。
		HSSFCell cellTitle = rowTitle.createCell(1);

		HSSFCellStyle style = createStyle(workbook, 25);
		cellTitle.setCellStyle(style);
		cellTitle.setCellValue("用户列表");

		HSSFRow rowHead = sheet.createRow(7);
		/* 创建单元格 */
		String[] array = { "编号", "客户名称", "概要", "联系人" };
		for (int i = 0; i < array.length; i++) {
			HSSFCell cellHead = rowHead.createCell(i + 1);
			HSSFCellStyle headStyle = createStyle(workbook, 13);
			cellHead.setCellStyle(headStyle);
			cellHead.setCellValue(array[i]);
		}

		HSSFCellStyle styleCenter = workbook.createCellStyle();
		styleCenter.setAlignment(HSSFCellStyle.ALIGN_CENTER);//center horizontal alignment
		styleCenter.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);//垂直居中
		
		//遍历输出数据库中的数据到excel中
		for (int i = 0; i < list.size(); i++) {
			
			HSSFRow row = sheet.createRow(8 + i);
			HSSFCell cellId =  row.createCell(1);
			cellId.setCellStyle(styleCenter);
			cellId.setCellValue(list.get(i).getId());
			HSSFCell cellName =  row.createCell(2);
			cellName.setCellStyle(styleCenter);
			cellName.setCellValue(list.get(i).getCustomerName());
			HSSFCell cellDescription =  row.createCell(3);
			cellDescription.setCellStyle(styleCenter);
			cellDescription.setCellValue(list.get(i).getDescription());
			HSSFCell cellLinkman =  row.createCell(4);
			cellLinkman.setCellStyle(styleCenter);
			cellLinkman.setCellValue(list.get(i).getLinkMan());
		}
		
		response.setContentType("applicaiton/x-excel");
		// 3.以附件的形式返回给浏览器
		ServletOutputStream outputStream = null;
		try {
			//response.setHeader("Content-Disposition", "attachment;filename=" + "aaa.xls");
			response.setHeader("Content-Disposition", "attachment;filename=" + new String("用户列表.xls".getBytes(), "ISO-8859-1"));
			outputStream = response.getOutputStream();
			workbook.write(outputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 输出excel到文件
			if (workbook != null) {
				try {
					workbook.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private HSSFCellStyle createStyle(HSSFWorkbook workbook, int fontSize) {
		//创建单元格样式
		HSSFCellStyle style = workbook.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);//center horizontal alignment
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);//垂直居中
		//创建字体
		HSSFFont font = workbook.createFont();
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);//字体加粗
		font.setFontHeightInPoints((short)fontSize);//设置字体大小
		//加载字体到样式
		style.setFont(font);
		return style;
	}

}
