package comcg.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	public static Connection getConnection() throws Exception
	{
		String user="scott";
		String pass="tiger";
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String className ="oracle.jdbc.driver.OracleDriver";
		Connection connection =null;	
		Class.forName(className);
		connection =DriverManager.getConnection(url,user,pass);
		return connection;
		
	}
	
	
	
}
