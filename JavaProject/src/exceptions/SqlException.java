package exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlException {
	public static void main(String[] args) {
		SqlException SE=new SqlException();
		SE.method1();
		
	}
	public void method1() {
		try {
			Connection conn=DriverManager.getConnection("jdbc");
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}

}
	

