package hrmsTestscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;


import hrmslib.Gen;

public class TC002 {
	@Test
	public class tc002 {
		//Test case Steps
		//public static void main(String args[]) throws Exception 
		public void tc002() {
			DOMConfigurator.configure("log4j.xml");
			Gen g=new Gen();
		    g.openApplication();
		    g.login();
		    g.addEmp();
		    g.logout();
		    g.closeApplication();
	}
	}
}

