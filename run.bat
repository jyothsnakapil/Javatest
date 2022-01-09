set projectLocation=C:\Users\tamat\eclipse-workspace\Job
cd %projectLocation%
set classpath=C:\Users\tamat\eclipse-workspace\Job\bin;%projectlocation%\lib\*
java org.testng.TestNG %projectlocation%\testNG.xml
pause