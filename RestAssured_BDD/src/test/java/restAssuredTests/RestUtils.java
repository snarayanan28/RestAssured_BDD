package restAssuredTests;

import org.apache.commons.lang3.RandomStringUtils;

// Utility function for RestAPI
public class RestUtils {
	public static String getFirstName()	{
		String rndFName = RandomStringUtils.randomAlphabetic(3);
		return ("Pete" + rndFName);
	}

	public static String getLastName()	{
		String rndLName = RandomStringUtils.randomAlphabetic(3);
		return ("Sampras" + rndLName);
	}
	
	public static String getUserName()	{
		String rndUName = RandomStringUtils.randomAlphabetic(3);
		return ("Pete" + rndUName);
	}
	
	public static String getPassword()	{
		String rndPwd = RandomStringUtils.randomAlphabetic(3);
		return ("Pete" + rndPwd);
	}
	
	public static String getEmail()	{
		String rndEmail = RandomStringUtils.randomAlphabetic(6);
		return (rndEmail + "@gmail.com");
	}

	public static String empName()	{
		String rndEmpName = RandomStringUtils.randomAlphabetic(5);
		return ("Krishna" + rndEmpName);
	}
	
	public static String empSal()	{
		String rndSal = RandomStringUtils.randomNumeric(5);
		return rndSal;
	}
	
	public static String empAge()	{
		String rndAge = RandomStringUtils.randomNumeric(2);
		return rndAge;
	}
}
