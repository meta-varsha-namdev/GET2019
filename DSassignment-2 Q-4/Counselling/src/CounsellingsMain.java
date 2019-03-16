import java.io.File;
import java.util.Map;
import java.util.Map.Entry;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;


public class CounsellingsMain 
{
	public static void main(String args[]) throws Throwable
	{
//		try
//		{
//		String fileName = "Councel.xls";	
//		WritableWorkbook workbook = Workbook.createWorkbook(new File(fileName));
//		WritableSheet sheet1 = workbook.createSheet("Sheet1", 0);
//
//		Label label11 = new Label(0,0,"Student Name");
//		sheet1.addCell(label11);
//
//		Label label12 = new Label(1,0,"Program Preference");
//		sheet1.addCell(label12);
//		
//		
//		WritableSheet sheet2 = workbook.createSheet("Sheet2", 1);
//
//		Label label21 = new Label(0,0,"Program Name");
//		sheet2.addCell(label21);
//
//		Label label22 = new Label(1,0,"Program capacity");
//		sheet2.addCell(label22);
//		
//		
//		workbook.write();
//		workbook.close();
//		}
//		catch(WriteException e)
//		{
//			
//		}
//		
		
		StudentCouncelling counselling = new StudentCouncelling();
		Map<String,String> actual = counselling.counselingProcess("C:\\Users\\admin\\workspace\\Counselling\\Councel.xls");

		try
		{
			String fileName1 = "CouncelResult.xls";	
			WritableWorkbook workbook1 = Workbook.createWorkbook(new File(fileName1));
			WritableSheet sheet3 = workbook1.createSheet("Sheet3", 0);

			Label label1 = new Label(0,0,"Student Name");
			sheet3.addCell(label1);

			Label label2 = new Label(1,0,"Program allotted");
			sheet3.addCell(label2);

			int index=0, index_1=0;
			for(Entry<String, String> entry : actual.entrySet())
			{
				Label label31 = new Label(0,++index,entry.getKey());
				sheet3.addCell(label31);

				Label label32 = new Label(1,++index_1,entry.getValue());
				sheet3.addCell(label32);
			}
			
			workbook1.write();
			workbook1.close();

		}
		catch(WriteException e)
		{
//
		}
	}
}
