package hrmsTestscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import hrmslib.Gen;

public class TC001 {
	@Test
	public class tc001 {
		//test Case Steps
		//public static void main (String args[]) throws Exception{
		
		public void tc001() throws Exception{
			DOMConfigurator.configure("log4j.xml");

		Gen g=new Gen();
		    g.openApplication();
		    g.login();
		    g.logout();
		    g.closeApplication();
			}
	}
}

