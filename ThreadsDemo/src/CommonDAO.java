import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public interface CommonDAO {
	public static final String SQL = "select gkey,gval,descr from common_generic_params where gkey=? and status='Y'";
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Connection con = null;
		ResourceBundle rb = ResourceBundle.getBundle("db");
		String driverName = rb.getString("drivername");
		String dbUrl = rb.getString("dburl");
		String userid = rb.getString("userid");
		String password = rb.getString("password");
		Class.forName(driverName);
		con = DriverManager.getConnection(dbUrl,userid,password);
		return con;
	}

}
