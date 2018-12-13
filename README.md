# SpringBoot
This is a sample Spring Boot application in which we can configure the Task work flow.
We define the work flow of the Tasks in the Spring Configuration file (xml) which is accessed by the Controller and execute.

1.  java -jar spring-bpm-demo-0.0.1-SNAPSHOT.jar 
or Run the project from IDE
         - This startup the application with a sample cricketer initiating the WorkFlow.
 
  2.  GET http://localhost:8182/cricketers
        - Lists all available Cricketers.

  3.  We can initate the WorkFlow as
        POST http://localhost:8182/cricketers/initateWorkFlow
        Header: content-type: application/json
        Payload:
                {
                  "cName": "Ganguly",
                  "country": "India",
                  "matches": 345,
                  "runsScored": 10987,
                  "notOuts": 35,
                  "wickets": 135,
                  "runsConceded": 3321
                }
                
  4.  We can also retrieve data based on Cricketer name
                GET http://localhost:8182/cricketers/{cName}
