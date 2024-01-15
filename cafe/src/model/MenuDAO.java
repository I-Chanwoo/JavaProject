package model;

import java.sql.*;
public class MenuDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	public void getConn() {
		String driver = "oracle.jdbc.driver.OracleDriver"; 
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		String user = "service";
		String pw = "12345";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getClose() {
		try {
			if(rs != null)rs.close();
			if(psmt != null)psmt.close();
			if(conn != null)conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public int getMenuCount() {
		int count = (Integer) null;
		String sql = "select count(*) from menu";
		getConn();
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			if(rs.next()) count = rs.getInt(1);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			getClose();
		}//t-c-f
		return count;
	}//getMenuCount
	
	public void getMenu() {
		int count = (Integer) null;
		String sql = "select * from menu where rownum = ?";
		
	}
}
