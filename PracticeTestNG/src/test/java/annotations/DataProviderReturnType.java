package annotations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderReturnType {

	// Object[]
	@Test(dataProvider = "dataProvider1")
	public void testMethods(String s) {
		System.out.println(s);
	}

	@DataProvider
	public Object[] dataProvider1() {
		String[] str = new String[] { "User1", "User2", "User3", "User4", "User5" };
		return str;
	}

	// Object[] []
	@Test(dataProvider = "dataProvider2")
	public void testMethods2(String[] s) {
		System.out.println(s[0]);
		System.out.println(s[1]);
	}

//	public void testMethods2(String username, String password) {
//		System.out.println(username);
//		System.out.println(password);
//	}
	@DataProvider
	public Object[][] dataProvider2() {
		String[][] str = new String[][] { 
			{ "User1", "Password1" }, 
			{ "User2", "Password2" }, 
			{ "User3", "Password3" },
			{ "User4", "Password4" }, 
			{ "User5", "Password5" } 
		};
		return str;
	}

	// Iterator<Object>
	@Test(dataProvider = "dataProvider3")
	public void testMethods3(String s) {
		System.out.println(s);
	}

	@DataProvider
	public Iterator<String> dataProvider3() {
		List<String> str = new ArrayList<String>();
		str.add("Vivek");
		str.add("Virat");
		str.add("Rohit");
		str.add("Sachin");
		str.add("Mohin");
		return str.iterator();
	}

	// Iterator<Object[]>
	@Test(dataProvider = "dataProvider4")
	public void testMethods4(String s[]) {
		System.out.println(s[0]+" "+s[1]);
	}

	@DataProvider
	public Iterator<String[]> dataProvider4() {
		List<String[]> str = new ArrayList<String[]>();
		str.add(new String[]{"Vivek", "Patil"});
		str.add(new String[]{"Virat", "Kohli"});
		str.add(new String[]{"Rohit", "Sharma"});
		str.add(new String[]{"Sachin", "Tendulkar"});
		str.add(new String[]{"Mohin", "Verma"});
		return str.iterator();
	}
	
}
