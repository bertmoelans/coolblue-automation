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
- Java Development Kit (JDK) = openjdk-20
- Selenium
- Maven project
- Browser web drivers

## Starting point
1. Install Java software development kit (JDK)
<br />
https://www.oracle.com/java/technologies/downloads
2. Setup environment variable on Windows to point to your web drivers folder and Java JDK
3. Choose an IDE of your liking and make a project (Java and Maven)
4. Add the latest version of "Selenium Java" dependency to the pom.xml file
<br />
https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
```
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>x.x.x</version>
</dependency>
```