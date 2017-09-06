package com.service.jdbc;

import java.sql.*;

public class JdbcUtil {

	private static String url = "jdbc:oracle:thin:@192.168.4.149:1521:LMPINECIQ";
	// system为登陆oracle数据库的用户名
	private static String user = "eciq";
	// manager为用户名system的密码
	private static String password = "eciq";
	public static Connection conn;
	public static PreparedStatement ps;
	public static ResultSet rs;
	public static Statement st;

	/**
	 * 
	 * @Title: com.service.jdbc
	 * @Auther:admin
	 * @Description:数据库连接
	 * @return void
	 * @date 2017年6月2日上午8:19:20
	 */
	public static Connection databaseConn() {

		try {
			// 初始化驱动包
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 根据数据库连接字符，名称，密码给conn赋值
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;

	}

	/**
	 * 
	 * @Title: com.service.jdbc
	 * @Auther:查询
	 * @Description:
	 * @return ResultSet
	 * @date 2017年6月2日上午8:27:49
	 */
	public static ResultSet query() {

		conn = databaseConn();
		String sql = "select * from ITF_INS_LAB_BILL";
        try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	

}
