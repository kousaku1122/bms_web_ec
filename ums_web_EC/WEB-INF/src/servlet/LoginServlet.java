package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import bms.UserDAO;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String error = "";
		String cmd = "";
		try {
			// 文字エンコーディングの指定
			request.setCharacterEncoding("UTF-8");

			// ログイン情報の取得
			String userid = request.getParameter("userId");
			String password = request.getParameter("password");

			// 空データの確認
			if (userid.equals("") || password.equals("")) {
				cmd = "login";
				error = "入力データがありません。";
				return;
			}

			// UserDAOオブジェクトの宣言
			UserDAO objDao = new UserDAO();

			// user情報を取得
			User user = new User();
			user = objDao.selectByUser(userid, password);

			// userデータが存在する場合
			if (user.getUserId() != 0) {
				// 取得したuserをセッションスコープへ登録
				HttpSession session = request.getSession();
				session.setAttribute("user", user);

				// useridとpasswordをクッキーへ登録
				Cookie userCookie = new Cookie("user", userid);
				userCookie.setMaxAge(60 * 60 * 24 * 5);
				response.addCookie(userCookie);

				Cookie passwordCookie = new Cookie("pass", password);
				passwordCookie.setMaxAge(60 * 60 * 24 * 5);
				response.addCookie(passwordCookie);
			} else {
				error = "入力データが間違っています。";
				cmd = "login";
				return;
			}

		} catch (IllegalStateException e) {
			error = "DB接続エラーの為、ログイン出来ません。";
		} finally {
			// エラーがない場合
			if (error.equals("")) {
				request.getRequestDispatcher("/view/topPage.jsp").forward(request, response);
			}
			if (cmd.equals("login")) {
				request.setAttribute("error", error);
				request.getRequestDispatcher("/view/login.jsp").forward(request, response);
			} else {
				// エラーがある場合、error.jspにフォワード
				request.setAttribute("error", error);
				request.getRequestDispatcher("/view/error.jsp").forward(request, response);
			}
		}
	}
}
