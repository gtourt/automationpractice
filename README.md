##**AUTOMATION PRACTICE TEST FRAMEWORK**

This is a test framework for the www.automationpractice.com.

Prerequisites:
>-Maven

To install the framework:
-Clone the automationpractice repository from github: https://github.com/gtourt/automationpractice.git
-Navigate to the folder where the pom.xml exist (/automationpractice/AutomationTest/)
-Execute in command line : 
```
mvn test
```

If the user needs to change any properties of the framework execution such as: username, email, password then:
-Navigate to the automationpractice/AutomationTest/src/test/resources/string.properties
    Change username from : `C1yn3T3st` to a username of your preference. Make sure not to include quotes after the `=`.
    Change password according to the rule above. (DO NOT INCLUDE "")
    Change mail according to the rule above. (DO NOT INCLUDE "")
    
    Any change made in this area should end up in the same exactly format : `user.username.new=Test`


