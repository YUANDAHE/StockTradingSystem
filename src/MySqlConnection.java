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
		try {
			java.sql.Driver driver = new com.mysql.jdbc.Driver();
			
			/** jdbc:mysql://<machine_name><:port>/dbname */
			String url = "jdbc:mysql://127.0.0.1:3306/stock_trading_system";
			Properties info = new Properties();
			info.put("user", "root");
			info.put("password", "password");
			Connection con = driver.connect(url, info);
			System.out.println("JDBC connection successfully. con="+con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
