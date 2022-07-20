package bms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import bean.Order;

public class OrderDAO {

	private static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost:8889/mybookdb?serverTimezone=UTC";
	private static String USER = "root";
	private static String PASS = "root";

	// DB接続情報を利用してDBに接続するメソッド
	private static Connection getConnection() {

		Connection con = null;
		try {
			Class.forName(RDB_DRIVE);
			con = DriverManager.getConnection(URL, USER, PASS);
			return con;

		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

	// 引数の購入データをもとに新規登録を行うメソッド
	public void insert(Order order) {

		Connection con = null;
		Statement smt = null;

		String sql = "INSERT INTO orderinfo VALUES(NULL,'" + order.getUserId() + "','" + order.getUniformId() + "',"
				+ order.getQuantity() + ",'" + order.getOrderedAt() + "' CURDATE() )";

		try {
			con = getConnection();
			smt = con.createStatement();

			smt.executeUpdate(sql);

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException ignore) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ignore) {
				}
			}
		}
	}
}
