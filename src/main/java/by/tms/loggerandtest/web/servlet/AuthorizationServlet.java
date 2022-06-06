package by.tms.loggerandtest.web.servlet;

import by.tms.loggerandtest.entity.User;
import by.tms.loggerandtest.service.UserService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/authorization")
public class AuthorizationServlet extends HttpServlet {

    private final UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/authorization.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        User user = userService.findUserByLogin(login);
        if (user == null) {
            System.out.println("User does not exist");
        } else if (user.getPassword().equals(password)) {
            req.getSession().setAttribute("user", user);
            getServletContext().getRequestDispatcher("/calc.jsp").forward(req, resp);
        } else {
            req.getSession().setAttribute("Warning", "Error acquired");
        }
        getServletContext().getRequestDispatcher("/authorization.jsp").forward(req, resp);
    }

}
