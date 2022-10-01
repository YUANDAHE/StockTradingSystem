import java.sql.Connection;
import java.util.Properties;

/**
 * Brent He
 * 112811248
 * yuanda.he@stonybrook.edu
 * 1st Project
 * CSE 305
 */

public class MySqlConnection {
	public static void main(String[] args) {
		String dbname = "stock_trading_system";
		String user = "root";
		String password = "password";

		try {
			java.sql.Driver driver = new com.mysql.jdbc.Driver();
			
			/** jdbc:mysql://<machine_name><:port>/dbname */
			String url = "jdbc:mysql://127.0.0.1:3306/"+dbname;
			Properties info = new Properties();
			info.put("user", user);
			info.put("password", password);
			Connection con = driver.connect(url, info);
			System.out.println("JDBC connection successfully. con="+con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
