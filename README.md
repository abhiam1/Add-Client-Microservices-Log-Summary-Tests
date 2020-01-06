
     *** README Document for - Add-Client-Microservices-Log-Summary-Tests - created by Abhijit Malankar - MSc Engg TU Berlin ***
     
     
         *** Test Set up Requirements for Testing this folder is - 

1) This Test folder has been created in Eclipse using Java ,  
2) Its a Maven folder , hence please ensure that Maven Libraries are installed in Eclipse for loading any dependencies , 
3) Ensure that the provided - Microservices Log file - The mslog.txt file shared in this git hub repository which contains the 2 log traces , needs to be placed at path C:\\mslog.txt , before running the test cycle 

         *** This Test repository contains - 
                  
1) Source folder in Main branch uploaded through Eclipse  - Microservices_Log_Summary_Test
with Java class Test file ( Log_Summary_Extract_tests.java ) located in path - 
Add-Client-Microservices-Log-Summary-Tests/Microservices_Log_Summary_Test/src/main/java/com/logs/Log_Summary_Extract_tests.java

2) Basic Workflow has been setup with almost 4 different branches created and all merged in the main branch 

3) v1.0 release is available in releases field at path below - which contains both zip and tar.gz Source of the repository
    https://github.com/abhiam1/Add-Client-Microservices-Log-Summary-Tests/releases 
    
4) The main Requirements QA case study document is available for quick reference 

5) Java class Test file ( Log_Summary_Extract_tests.java ) has been written using various functions and methods like - Try/catch ,    
    Buffered reader , while / if loop , String Search , String Tokenizer class , for loop , String Parsing  etc

6) Results file - The Test result output observed on the Eclipse Console after running the Java class Test file 
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




   
