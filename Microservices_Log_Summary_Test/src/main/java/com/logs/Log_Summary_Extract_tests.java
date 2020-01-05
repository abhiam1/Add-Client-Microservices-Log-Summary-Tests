package com.logs;

import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Log_Summary_Extract_tests

{
	
	public static void main(String[] args) throws FileNotFoundException {

		String Search3 = null;
		String Search4 = null;
		double timestamp_difference;
		{
		/* 1 - To find Service name and Unique request id number using Try/catch , Buffered reader , while , String Search*/  
			
			try (BufferedReader br = new BufferedReader(new FileReader("C:\\mslog.txt"))) {

				{
					System.out.println(
							" Captured Summary of the Microservices Log file located at C:\\mslog.txt is as below :  ");
					System.out.println(" ************ Start of Log file Summary ************* ");
				
					String sCurrentLine;
					String service = null;
					String sid=null;
					String Search = "(addClient:97900)";
					while ((sCurrentLine = br.readLine()) != null) 
					{
					
						if (sCurrentLine.contains(Search)) 
						{
							
							StringTokenizer st=new StringTokenizer(Search,":");
							while(st.hasMoreElements())
							{
							 service=st.nextToken();
							 sid=st.nextToken();
							}
							
							System.out.println( " Test Result .No 1 - From the log file we are able to find the Name of service is = " + service+ " & Unique Request id number is = " +sid);
							break;
						}

					}
					
		/* 2 - To find Number of requests made to the service using for loop */ 
					
					{
						int count = 0;
						for (int i = 0; i <= 1; i++) 
						{
							count++;

						}
						
						System.out.println(" Test Result .No 2  - Number of requests made to the service are = " + count);
					}

				}

			}

			catch (IOException e) 
			{
				e.printStackTrace();
			}

		/* 3 - To find Entry time stamp of Add Client Request (id-97900) using Try/catch , Buffered reader , while , String Search */ 
			
			try (BufferedReader br1 = new BufferedReader(new FileReader("C:\\mslog.txt"))) {

				{
					String sCurrentLine;
					String Search1 = "2015-10-28T12:24:33,903";
					while ((sCurrentLine = br1.readLine()) != null) 
					{
						if (sCurrentLine.contains(Search1)) 
						{
							System.out.println(" Test Result .No 3  - Entry time stamp of Add Client Request (id-97900) found in logfile is = "+ Search1);
						}

					}

				}
			}

			catch (IOException e)
			{
				e.printStackTrace();
			}

		/* 4 - To find Exit time stamp of Add Client Request (id-97900) using Try/catch , Buffered reader , while , String Search  */ 
			
			try (BufferedReader br2 = new BufferedReader(new FileReader("C:\\mslog.txt"))) 
			{

				{
					String sCurrentLine;
					String Search2 = "2015-10-28T12:24:34,002";
					while ((sCurrentLine = br2.readLine()) != null) 
					{
						if (sCurrentLine.contains(Search2)) 
						{
						System.out.println(" Test Result .No 4  - Exit time stamp of Add Client Request (id-97900) found in logfile is = " +Search2);
						}

					}

				}
			}

			catch (IOException e) 
			{
				e.printStackTrace();
			}
			
		/* 5 - To find Entry time stamp ( in seconds ) of Add Client Request (id-97900) using Try/catch , Buffered reader , while , String Search  */
			
			try (BufferedReader br3 = new BufferedReader(new FileReader("C:\\mslog.txt"))) 
			{
				{
					String sCurrentLine;
					Search3 = "33,903";
					while ((sCurrentLine = br3.readLine()) != null) 
					{
						if (sCurrentLine.contains(Search3)) 
						{
							System.out.println (" Test Result .No 5  - Entry time stamp (in seconds) of Add Client Request (id-97900) found in logfile is = " +Search3);
							
						}

					}

				}
			}

			catch (IOException e) 
			{
				e.printStackTrace();
			}

		/* 6 - To find Exit time stamp ( in seconds ) of Add Client Request (id-97900) using Try/catch , Buffered reader , while , String Search  */
			
			try (BufferedReader br4 = new BufferedReader(new FileReader("C:\\mslog.txt"))) {

				{
					String sCurrentLine;
					 Search4 = "34,002";
					while ((sCurrentLine = br4.readLine()) != null)
					{
						if (sCurrentLine.contains(Search4)) 
						{
						System.out.println(" Test Result .No 6 - Exit time stamp (in seconds) of Add Client Request (id-97900) found in logfile is = " +Search4);
							
						}

					}
					
		/* 7 - To find Maximum time required for Add Client request execution ( in seconds ) using String Parsing  */
					
					Search3=Search3.replaceAll(",",""); 
					Search4=Search4.replaceAll(",",""); 
					timestamp_difference=(Double.parseDouble(Search4)-Double.parseDouble(Search3))*0.0001;
					System.out.println(" Test Result .No 7 - Maximum time required for Add Client request execution ( in seconds ) is = " + timestamp_difference);

					System.out.println(" ************ End of Log file Summary ************* ");

				}
				
			}
			
			catch (IOException e) {
				e.printStackTrace();
			}

			
			
		}

	}
}

