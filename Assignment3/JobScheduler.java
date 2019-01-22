/**
 @author varsha namdev
 @Date: 18/1/2019
 Classname: JobScanner
 Description:
 @param:
  burstt= burst time of process
  arrivalt:arrival time of process
  burstcumarrival: 2 d array of arrival time and burst time
  completiont: Completion time of process
  averagewaitt: average waiting time
  waitingt: waiting time of process
 */
import java.util.Scanner;
public class JobScheduler  {
	
	public static void main(String[] args) {
		int burstt, arrivalt, number;
		int  sum=0;
		double add=0.0;
		int output=0, compare=-32768;
		
		System.out.println("Enter no. of process");
		Scanner scan1=new Scanner(System.in);
		number=scan1.nextInt();
		
		int processid[]= new int[number];
		int burstcumarrival[][]= new int[number][2];
		int waitingt[]= new int[number];
		int turnaroundt[]= new int[number];
		int completiont[]= new int[number];
		try
		{
		System.out.println("Enter process id");
		for(int k=0;k<number;k++)
		{
			Scanner scan2=new Scanner(System.in);
			processid[k]=scan2.nextInt();
		}
		}catch(NumberFormatException a)
		{
			System.out.println("Enter valid process id");
		}
		
		for(int i=0; i<number; i++)
		{
			try
			{
				System.out.println("Enter the processes arrival time and their respective burst time" +i);
				Scanner scann= new Scanner(System.in);
				arrivalt=scann.nextInt();
				burstt=scann.nextInt();
				burstcumarrival[i][0]= arrivalt;
				burstcumarrival[i][1]= burstt;
			} catch(NumberFormatException b)
			{
			System.out.println("Enter correct time");
			}
		}
		for(int m=0;m<number;m++)
		{
			for(int n=0;n<2;n++)
			{
				System.out.print(burstcumarrival[m][n]+"");
			}
			System.out.println();
		}
		
		//Completion time calculation
		completiont[0]=burstcumarrival[0][1];
		for(int i=1;i<number;i++)
		{
			completiont[i]=burstcumarrival[i][1]+completiont[i-1];
		}
		
		// turn around time calculation
		for(int k=0;k<number;k++)
		{
			turnaroundt[k]=completiont[k]-burstcumarrival[k][0];
		}

		//Waiting time calculation
		for(int i=0;i<number;i++)
		{
			waitingt[i]=turnaroundt[i]-burstcumarrival[i][1];
			add=add+waitingt[i];
		}
		
		double averagewaitt=add/number; //average waiting time
		
		System.out.println("the waiting time is:");
		for(int i=0;i<number;i++)
		{
			System.out.println(waitingt[i]);
		}
		
		System.out.println("the turnaround time is:");
		for(int i=0;i<number;i++)
		{
			System.out.println(turnaroundt[i]);
		}
		System.out.println("the completion time is:");
		for(int i=0;i<number;i++)
		{
			System.out.println(completiont[i]);
		}
		System.out.println("The average waiting time is"+averagewaitt);
		
		for(int l=0;l<number;l++)
		{
			System.out.println("process id\t" + processid[l] + "\tArrival Time\t" + burstcumarrival[l][0] + "\tBurst Time\t" + burstcumarrival[l][1] + "\tCompletion time\t" + completiont[l] + "\tTurn Around time\t" + turnaroundt[l] + "\twaiting time\t" + waitingt[l]);
		}
		
		for(int p=0; p<number;p++)
		{
		if(waitingt[p]>compare)
			compare=waitingt[p];
		}
		
		System.out.println("The maqximum of waiting time is" + compare);
	}	

}

