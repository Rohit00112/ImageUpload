package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.UserDAO;

import java.io.IOException;
import java.sql.SQLException;
@WebServlet(name = "login", value = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect(req.getContextPath() + "/login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        try {
            boolean loggedin = UserDAO.loginUser(username,password);
            if (loggedin) {
                HttpSession session = req.getSession();
                session.setAttribute("username", username);

                resp.sendRedirect(req.getContextPath() + "/home.jsp");
            }
            else {
                resp.sendRedirect(req.getContextPath() + "/login.jsp");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
