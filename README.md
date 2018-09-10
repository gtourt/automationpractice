**AUTOMATION PRACTICE TEST FRAMEWORK**
=========================================
This is a test framework for the webpage www.automationpractice.com.

Prerequisites:<br />
*Java JDK 1.8.1_181 installed<br />
*Maven<br />

To install and test the framework:
### FIRST WAY
-Clone the automationpractice repository from github: (https://github.com/gtourt/automationpractice.git)<br />
-Navigate to the folder where the pom.xml exist (/automationpractice/AutomationTest/)<br />
-Execute in command line : 
```
mvn test
```
### SECOND WAY
Open your favourite IDE and import the project as a maven project. Then Run the TestRunner class in :<br />
'automationpractice/AutomationTest/src/test/java/testSuites/TestRunner.class'


## PROPERTIES
If the user needs to change any properties of the framework execution such as: username, email, password.<br />
Navigate to the `automationpractice/AutomationTest/src/test/java/features/*` and change the examples section of each feature with the data of preference.
