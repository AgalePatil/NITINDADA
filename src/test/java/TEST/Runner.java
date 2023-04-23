package TEST;

import java.util.List;

import org.apache.commons.compress.utils.Lists;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class Runner {

	public static void main(String[] args) {
		TestNG testng=new TestNG();
		
		List<String> suites=Lists.newArrayList();
		String suitepath=System.getProperty("user.dir")+"//Test001";
		suites.add(suitepath);
		testng.setTestSuites(suites);
		testng.run();

	}

}
