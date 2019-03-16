import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class StudentCouncelling
{
	Workbook workbook;
	private final int totalProgram=5;
	static QueueImpl queue = new QueueImpl();
	static HashMap<String,Integer> mapOfProgramCapacity = new HashMap<String,Integer>();
	static HashMap<String,String> mapOfStudentPreference = new HashMap<String,String>();
	static HashMap<String,String> mapOfCounsellingResult = new HashMap<String,String>();

	/**
	 * read the total program and the no. of seats in each program from the Excel file.
	 * @param pathOfFile
	 * @throws IOException
	 */
	public void readTotalNoOfSeatInEachProgram(String pathOfFile) throws IOException 
	{

		try 
		{
			workbook = Workbook.getWorkbook(new File(pathOfFile));
			Sheet sheet = workbook.getSheet(1);

			for (int row = 1; row < sheet.getRows(); row++)
			{
				Cell cell = sheet.getCell(0, row);
				CellType type = cell.getType();
				if (type == CellType.LABEL) 
				{
					String programName=cell.getContents();
					cell = sheet.getCell(1,row);
					
					int programCapacity=Integer.parseInt(cell.getContents());
					
					mapOfProgramCapacity.put(programName, programCapacity);
					
				}
			}
		} 
		catch (BiffException e) 
		{
			throw new AssertionError("Invalid xls Format");
		}
	}
	/**
	 * read students name with their preferences from the Excel file.
	 * @param pathOfFile
	 * @throws IOException
	 */
	public void readPreferenceOfStudent(String pathOfFile) throws IOException  
	{
		try 
		{
			workbook = Workbook.getWorkbook(new File(pathOfFile));
			Sheet sheet = workbook.getSheet(0);

			for (int row = 1; row < sheet.getRows(); row++) 
			{  
				Cell cell = sheet.getCell(0, row);  
				CellType type = cell.getType();
				if (type == CellType.LABEL) 
				{
					String studentName=cell.getContents();
					queue.Enqueue(studentName);
					cell = sheet.getCell(1,row);
					String preference=cell.getContents();
					mapOfStudentPreference.put(studentName, preference);
				}
			}
		}
		catch (BiffException e) 
		{
			throw new AssertionError("Invalid xls Format");
		}
	}
	/**
	 * calls counseling process
	 * @return mapOfCounsellingResult
	 * @throws IOException
	 * @throws Throwable 
	 */
	public HashMap<String,String> counselingProcess(String pathOfFile ) throws IOException, Throwable 
	{	
		readTotalNoOfSeatInEachProgram(pathOfFile);
		readPreferenceOfStudent(pathOfFile);
		return allotProgramsToStudent(queue);	
		
			
	}

	/**
	 * allots students with program as per their preferences and availability
	 * @param queue
	 * @return mapOfCounsellingResult
	 * @throws InterruptedException
	 */
	public  HashMap<String,String> allotProgramsToStudent(QueueImpl queue) throws InterruptedException
	{

		while(!queue.isEmpty())
		{
			String student=queue.Dequeue();
			String pref = mapOfStudentPreference.get(student);
			String[] preference = new String[totalProgram];
			preference=pref.split(",");
			boolean assign=false;
			for(int program = 0 ;program < totalProgram ; program++) 
			{
				if(assign==true)
					break;
				String subject = preference[program];
				try
				{
				int programSeatAvailable=mapOfProgramCapacity.get(subject);
				if(programSeatAvailable>0) 
				{
					mapOfCounsellingResult.put(student.toUpperCase(),subject.toUpperCase());
					assign=true;
					programSeatAvailable--;
					mapOfProgramCapacity.put(subject,programSeatAvailable);
				}
				}
				catch(NullPointerException e)
				{
					
				}
				
			}
		}
		return mapOfCounsellingResult;
	}
}
