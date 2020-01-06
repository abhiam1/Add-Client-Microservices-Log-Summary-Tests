
     *** README Document for - Add-Client-Microservices-Log-Summary-Tests - created by Abhijit Malankar - MSc Engg TU Berlin ***
     
     
         >>>>>>  Test Set up Requirements for Testing this folder is - 

1) This Test folder has been created in Eclipse using Java ,  
2) Its a Maven folder , hence please ensure that Maven Libraries are installed in Eclipse for loading any dependencies , 
3) Ensure that the provided - Microservices Log file - The mslog.txt file shared in this git hub repository which contains the 2 log 
   traces , needs to be placed at path C:\\mslog.txt , before running the test cycle 

         >>>>>>  This Test repository contains - 
                  
1) Source folder in Main branch uploaded through Eclipse  - Microservices_Log_Summary_Test
with Java class Test file ( Log_Summary_Extract_tests.java ) located in path - 
Add-Client-Microservices-Log-Summary-Tests/Microservices_Log_Summary_Test/src/main/java/com/logs/Log_Summary_Extract_tests.java

2) Basic Workflow has been setup with almost 4 different branches created and all merged in the main branch 

3) v1.0 release is available in releases field at path below - which contains both zip and tar.gz Source of the repository
    https://github.com/abhiam1/Add-Client-Microservices-Log-Summary-Tests/releases 
    
4) The main Requirements QA case study document is available for quick reference within the repository as  -   
    ( Requirements_microservice_logs_case_study.pdf )

5) Java class Test file ( Log_Summary_Extract_tests.java ) has been written using various functions and methods like - Try/catch ,    
    Buffered reader , while / if loop , String Search , String Tokenizer class , for loop , String Parsing  etc , to extract the 
    summary information required from the case study log file 
    
6) Each of the test case from 1 to 7 , has been tagged within the Java class Test file ( Log_Summary_Extract_tests.java ) as well as in    the Test results output available in the Repository file of (  Test Result Output on Eclipse Console for Add Client Log file 
    Extract.txt ) ,test case results have been tagged from 1 to 7 .   

7) Results file - The Test result output observed on the Eclipse Console after running the Java class Test file 
   ( Log_Summary_Extract_tests.java ) is also uploaded in the Repository as -
   ( Test Result Output on Eclipse Console for Add Client Log file Extract.txt ) 
   

        *** Test Results Requirements expected in the case study : ***

     Implement a script, utility or application on using any programming language to extract the following information about each 
     service:
      1. Name of service
      2. Number of requests made to the service
      3. Maximum time of request execution


       *** Results details  : ( Plz refer - Test Result Output on Eclipse Console for Add Client Log file Extract.txt ) *** 

       Captured Summary of the Microservices Log file located at C:\mslog.txt is as below : 
 
 ************ Start of Log file Summary ************* 
 
 Test Result .No 1 - From the log file we are able to find the Name of service is = (addClient & Unique Request id number is = 97900)
 
 Test Result .No 2  - Number of requests made to the service are = 2
 
 Test Result .No 3  - Entry time stamp of Add Client Request (id-97900) found in logfile is = 2015-10-28T12:24:33,903
 
 Test Result .No 4  - Exit time stamp of Add Client Request (id-97900) found in logfile is = 2015-10-28T12:24:34,002
 
 Test Result .No 5  - Entry time stamp (in seconds) of Add Client Request (id-97900) found in logfile is = 33,903
 
 Test Result .No 6 - Exit time stamp (in seconds) of Add Client Request (id-97900) found in logfile is = 34,002
 
 Test Result .No 7 - Maximum time required for Add Client request execution ( in seconds ) is = 0.0099
 
 ************ End of Log file Summary ************* 
 


       *** Results Analysis inference from the console output for Test Results Requirements expected in the case study ***
       


      1. Name of service = Test Result .No 1 - From the log file we are able to find the Name of service is = (addClient & Unique 
                           Request id number is = 97900)
      
      2. Number of requests made to the service = Test Result .No 2  - Number of requests made to the service are = 2
      
      3. Maximum time of request execution = Test Result .No 7 - Maximum time required for Add Client request execution 
                                             ( in seconds ) is = 0.0099
       
       
      
      *** Known Issues / Errors observed in the Requirements Case study Document and Test assumptions made 
                  to mitigate these errors ***
          
      
     
     >>>>>>  Couple of errors were observed in the Requirements Case study Document which are noted below along with mitigation 
     assumptions made for tests - ( Please refer the repository document - Requirements_microservice_logs_case_study.pdf ) )

     
      >> A) On page 1 - under the “Data File” heading the second log entry says “entry with”

         2015-10-28T12:24:34,002 TRACE [OperImpl] entry with (addClient:97900) ,

         should it have been saying “exit with” instead ? Since the Add clinet service is getting a response here.

         Assumption made for Tests : 

         For this test purpose I have considered the second log as “exit with” so the exit time stamp can be accordingly considered .

 
      >> B) Again on page 1 - under the “Data File/ where ” heading - the listed “Response Exit time”  mentioned is - 33,903 which is 
         incorrect , as below

          2015-10-28T12:24:33,903 - response exit time 

          Since the log itself mentions it as - 34,002 

          2015-10-28T12:24:34,002 TRACE [OperImpl] entry with (addClient:97900) 

          Assumption made for Tests : 

          For the test purpose I have considered the “Response Exit time” as - 34,002 , as correctly mentioned in the log trace no2 -

          2015-10-28T12:24:34,002 TRACE [OperImpl] entry with (addClient:97900) 



                                            **************************************
   
