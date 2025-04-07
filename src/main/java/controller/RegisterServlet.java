package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import model.User;
import model.UserDAO;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

@WebServlet(name = "register", value = "/register")
@MultipartConfig(
        maxFileSize = 1024 * 1024 * 50,
        fileSizeThreshold = 1024 * 1024 * 20,
        maxRequestSize = 1024 * 1024 * 100
)
public class RegisterServlet extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        byte[] image = null;
        Part filePart = req.getPart("image");

        if (filePart != null) {
            try(InputStream in = filePart.getInputStream();) {
                image = new byte[(int)filePart.getSize()];
            }
        }

        User user = new User(username, email, password, image);

        try {
            boolean registered = UserDAO.registerUser(user);
            if (registered) {
                System.out.println("User registered successfully");
            }
            else {
                System.out.println("User could not be registered");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
