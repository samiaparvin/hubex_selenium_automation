#Prerequisites

- JDK 1.7 or above 
  to check installation run: >java --version & >javac --version
  * Make sure JAVA_HOME is set to the location of your JDK
- apache maven
  to install- 
  1. unzip apache-maven-3.x.y.zip
  2. A directory called "apache-maven-3.x.y" will be created
  3. Add the bin directory to your PATH
    Unix-based operating systems (Linux, Solaris and Mac OS X)
      export PATH=/usr/local/apache-maven-3.x.y/bin:$PATH
    Windows
      set PATH="c:\program files\apache-maven-3.x.y\bin";%PATH%
   4. Run "mvn --version" to verify that it is correctly installed.
   For complete documentation, see https://maven.apache.org/download.html#Installation
- Eclipse IDE 
  For installation steps see: https://www.eclipse.org/downloads/packages/installer
- Selenium Webdriver
  1. For this project chromedriver is used. Get chromedriver according to your chrome browser version.
  see details: https://chromedriver.chromium.org/downloads
  2. place chromedriver in c drive or in this location- C:\
  
#Clone project

1. Go to git project repository -> clone (copy clone URL)
2. Open Git Bash in any location where you want to keep the project.
3. Run $ git clone <URL>

#Open Project

1. open Eclipse
2. Click File -> Import
3. Type Maven in the search box under Select an import source:
4. Select Existing Maven Projects
5. Click Next
6. Click Browse and select the pom.xml that is the root of the Maven project 
7. Click Next
8. Click Finish

For any kind inconvenience that may happen with project dependencies, the pom.xml content is added herewith-
 
#pom.xml 

<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>HubexAutomation</groupId>
	<artifactId>HubexAutomation</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<packaging>jar</packaging>

	<name>HubexAutomation</name>
	<url>http://maven.apache.org</url>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>3.141.59</version>
		</dependency>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.12</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>6.9.9</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>com.sun.mail</groupId>
			<artifactId>javax.mail</artifactId>
			<version>1.6.0</version>
		</dependency>
	</dependencies>
	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>2.22.0</version>
				<configuration>
<!--  					<skipTests>true</skipTests>  -->
					<suiteXmlFiles>
						<suiteXmlFile>${suiteXmlFile}</suiteXmlFile>
					</suiteXmlFiles>
				</configuration>
			</plugin>
		</plugins>
	</build>
</project>

#Run

1. To run desired TestSuite click on <TestSuiteName.bat> file. or
   Open command prompt im project location and run this command- mvn test -Dsurefire.suiteXmlFiles=<TestSuiteName.xml>
   
2. To run all tests in project at once click on the RunTest.bat file or
   Open command prompt im project location and run this command- mvn test -Dsurefire.suiteXmlFiles=testng.xml

