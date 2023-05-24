# Coolblue functional automation project

## Description
This is a functional automation script for the Coolblue website started on 05/23. 
The script will go through the website in a checkout flow. It will simulate a 
potential client going through the website choosing a product to buy and eventually purchase it.

## Technologies
- Programming language = Java
- Build system = Maven
- Test automation framework = Selenium
- Operating system = Windows
- Behavior driven development = Cucumber
- IDE = IntelliJ

## Pre requisites
- Java Development Kit (openjdk-20)
- Selenium
- Maven project
- Browser web drivers

## Starting point
1. Install Java software development kit (JDK)
https://www.oracle.com/java/technologies/downloads
2. Setup environment variable on Windows to point to your web drivers folder and Java JDK
3. Choose an IDE of your liking and make a project (Java and Maven)
4. Add the latest version of "Selenium Java" dependency to the pom.xml file
https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
5. Set envirement variables, in IntelliJ configuration of the executor file -> VM options 
   - -Dbrowser=ChromeDriver -Dlanguage=nl
6. Setup Maven on your OS, for Windows check following link
https://phoenixnap.com/kb/install-maven-windows
7. Maven clean install to make everything ready for execution