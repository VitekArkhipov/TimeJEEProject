package time.servlet;

import time.ejb.Time;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "timeServlet",  urlPatterns={"/time", "/time/current"})
public class TimeServlet extends HttpServlet {

    @EJB
    private Time timeBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String currentTime = timeBean.getCurrentTime();
        req.setAttribute("currentTime", currentTime);
        req.getRequestDispatcher("/time.jsp").forward(req, resp);

    }
}