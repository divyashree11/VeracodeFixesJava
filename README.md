# VeracodeFixesJava
This repo consists of remediation methods for basic veracode vulnerablities.



spring-annotation-logs-demo -> this project consists of basic spring project with log4j integration. 
In order to avoid Veracode CWE 117 vulnerability I have used a custom logger class which uses HtmlUtils.htmlEscape() function to mitigate the vulnerablity.
Recommended solution to this problem by Veracode is to use ESAPI loggers but if you dont want to add an extra dependency to your project this should work fine.
