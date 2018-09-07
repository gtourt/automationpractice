**AUTOMATION PRACTICE TEST FRAMEWORK**
=========================================
This is a test framework for the www.automationpractice.com.

Prerequisites:
*Java JDK 8 installed<br />
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
Navigate to the `automationpractice/AutomationTest/src/test/resources/string.properties`.<br />
```
DO NOT INCLUDE "" 
```
<br />
*Change username from : `C1yn3T3st` to a username of your preference. Make sure not to include quotes after the `=`.<br />
*Change password according to the rule above.<br />
*Change mail according to the rule above.<br />
*Any change made in this area should end up in the same exactly format : `user.username.new=Test`
