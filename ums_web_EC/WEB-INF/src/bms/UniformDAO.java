package bms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bean.Uniform;

public class UniformDAO {

	private static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost:8889/mybookdb";
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

	// DBの全データをArrayListに格納するメソッド
	public ArrayList<Uniform> selectAll() {

		Connection con = null;
		Statement smt = null;

		ArrayList<Uniform> uniformList = new ArrayList<Uniform>();

		String sql = "SELECT * FROM uniforminfo ORDER BY uniform_id";

		try {
			con = getConnection();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				Uniform uniform = new Uniform();
				uniform.setUniformId(rs.getInt("uniform_id"));
				uniform.setUniformName(rs.getString("uniform_name"));
				uniform.setPrice(rs.getInt("price"));
				uniform.setStock(rs.getInt("stock"));
				uniform.setImage(rs.getString("image"));
				uniform.setInfo(rs.getString("info"));
				uniform.setCreatedAt(rs.getDate("date"));
				uniformList.add(uniform);
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

		return uniformList;

	}

}
