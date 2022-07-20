package bms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bean.User;

public class UserDAO {

	private static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost/kandauniformdb";
	private static String USER = "root";
	private static String PASS = "root123";

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

	// userid、passwordと一致するユーザー情報を検索するメソッド
	public User selectByUser(String user_id, String password) {

		Connection con = null;
		Statement smt = null;

		User user = new User();

		String sql = "SELECT * FROM userinfo WHERE user_id = '" + user_id + "' AND password= '" + password + "'";

		try {
			con = getConnection();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				user.setUserId(rs.getInt("user_id"));
				user.setName(rs.getString("name"));
				user.setNameKana(rs.getString("name_kana"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setPhoneNumber(rs.getString("phone_number"));
				user.setAddress(rs.getString("address"));
				user.setAuthority(rs.getInt("authority"));
				user.setCreatedAt(rs.getDate("created_at"));

			}

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

		return user;
	}

	// DBの全データをArrayListに格納するメソッド
	public ArrayList<User> selectAll() {

		Connection con = null;
		Statement smt = null;

		ArrayList<User> userList = new ArrayList<User>();

		String sql = "SELECT * FROM userinfo ORDER BY user_id";

		try {
			con = getConnection();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				User user = new User();
				user.setUserId(rs.getInt("user_id"));
				user.setName(rs.getString("name"));
				user.setNameKana(rs.getString("name_kana"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setAddress(rs.getString("address"));
				user.setAuthority(rs.getInt("authority"));
				user.setCreatedAt(rs.getDate("date"));
				userList.add(user);
			}

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

		return userList;

	}

}
