package ajax;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckUserIdServlet extends HttpServlet {

    private UserIdList userIdList = new UserIdList();
    private ServletContext context;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.context = config.getServletContext();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String submittedUserId = request.getParameter("userid");
        StringBuffer sBuff = new StringBuffer();
        if (submittedUserId != null) {
            submittedUserId = submittedUserId.trim().toLowerCase();
        } else {
            context.getRequestDispatcher("/error.jsp").forward(request,response);
        }
        if (userIdList.isPresent(submittedUserId)) {
            sBuff.append("<status>");
            sBuff.append("NotAvailable");
            sBuff.append("</status>");
        } else {
            sBuff.append("<status>");
            sBuff.append("Available");
            sBuff.append("</status>");
        }
        response.setContentType("text/xml");
        response.getWriter().write(sBuff.toString());
    }

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }
}
